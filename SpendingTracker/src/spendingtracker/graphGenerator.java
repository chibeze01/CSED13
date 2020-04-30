/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spendingtracker;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.labels.PieSectionLabelGenerator;  
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;  
import org.jfree.chart.plot.PiePlot;  
import org.jfree.data.general.DefaultPieDataset;  
import org.jfree.data.general.PieDataset;  

/**
 *
 * @author User
 */
public class graphGenerator extends javax.swing.JPanel {
    
    private MainMenu main;
    private JFreeChart chart;
    
    //makes dataset for line graphs
    private DefaultCategoryDataset getLineData(int colKey){
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      
      BufferedReader br = null;
        String line = "";

        try {
            //open csv file
            br = new BufferedReader(new FileReader(main.userName + "spending.csv"));
            while ((line = br.readLine()) != null) {

                // store the line as an array
                String[] item = line.split(",");
                
                //if data is in a group already in the graph, add to the group
                //otherwise add that group to the graph
                //e.g two spends on one day will be added together rather than one spend overriding the other
                if(dataset.getColumnKeys().contains(item[colKey])){
                    dataset.incrementValue(Math.abs(Double.valueOf(item[0])), "row" , item[colKey]);
                }else{
                    dataset.addValue(Math.abs(Double.valueOf(item[0])), "row" , item[colKey]);
                }

            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
      return dataset;
   }
    //returns dataset for pie charts
    private PieDataset getPieData(int key){
      DefaultPieDataset dataset=new DefaultPieDataset();
      
      BufferedReader br = null;
        String line = "";

        try {

            br = new BufferedReader(new FileReader(main.userName + "spending.csv")); //open csv
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] item = line.split(",");
                
                //add data to dataset
                //if similar data exists (e.g same category) add onto that category rather than overriding it
                if(dataset.getKeys().contains(item[key])){
                    double value = dataset.getValue(item[key]).doubleValue() + Math.abs(Double.valueOf(item[0]));
                    dataset.setValue(item[key], value);
                }else{
                    dataset.setValue(item[key], Math.abs(Double.valueOf(item[0])));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
      return dataset;
   }
    
    //creates line chart
    private JFreeChart getLineChart(int grouping){
        JFreeChart lineChart = ChartFactory.createLineChart(
        "Spending",
        "Date","Amount Spent",
        getLineData(grouping + 1),
        PlotOrientation.VERTICAL,
        false,true,false);
        
        this.chart = lineChart;
        
        return lineChart;
    }
    
    //create pie chart
    private JFreeChart getPieChart(int grouping){
        JFreeChart pieChart = ChartFactory.createPieChart(
        "Spending",
        getPieData(grouping + 1),
        false,true,false);
        
        this.chart = pieChart;
        
        return pieChart;
    }
    
    public void exportPNG(String path){
        try {
            ChartUtilities.saveChartAsPNG(new File(path + ".png"), this.chart, 560, 360);
            
        } catch (IOException ex) {
            Logger.getLogger(graphGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Creates new form graphGenerator
     * calls the relevant chart generator
     */
    public graphGenerator(int type, int grouping, MainMenu main) {
        
        this.main = main;
        
        if(type == 0){
            ChartPanel chartPanel = new ChartPanel(getLineChart(grouping));
            chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 360 ) );
            this.add(chartPanel);
        }else{
            ChartPanel chartPanel = new ChartPanel(getPieChart(grouping));
            chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 360 ) );
            this.add(chartPanel);
        }
        

      initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
