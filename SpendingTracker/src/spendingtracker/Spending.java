/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spendingtracker;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author adam-
 */
public class Spending extends javax.swing.JFrame {
    
    private MainMenu main;
    
    DateFormat df = new SimpleDateFormat("dd/MM/yy");
    /**
     * Creates new form Spending
     */
    public Spending(MainMenu main) {
        initComponents();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();   
        tf1.setValue(date); //fill box with current date
        this.main = main;
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        tf = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf1 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        CategoryBox = new javax.swing.JComboBox<>();
        MoneyIn = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        tf.setText("??");
        tf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter new spending");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Amount");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Category");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        tf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        tf1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category 1", "Category 2" }));
        CategoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryBoxActionPerformed(evt);
            }
        });

        MoneyIn.setText("Money going into account");
        MoneyIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MoneyIn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CategoryBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoneyIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
        
    }//GEN-LAST:event_tfActionPerformed
        
    private String modifyBalance(String value){
        String balance = "0.00";
        
        Caeser balanceCaeser = new Caeser(main.userName + "balance.csv");
        
        try {
            balanceCaeser.decrypt(12, "csv");
        }
        catch (FileNotFoundException ignore) {}

        
        // try and get balance if it exists
        try {
            // create file reader to read bytes, and buffered reader to read lines
            BufferedReader reader = new BufferedReader(new FileReader(main.userName + "balance.csv"));
            balance = reader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e);
        }
        
        // calculate new total
        
        double balancePoundsPence = Double.parseDouble(balance);
        double newPoundsPence = Double.parseDouble(value);

        DecimalFormat FORMAT = new DecimalFormat("0.00");

        String total = FORMAT.format(balancePoundsPence + newPoundsPence);

        

       
            
        try{
            // use file writer to write string to file
            FileWriter writer = new FileWriter(main.userName + "balance.csv", false);
            writer.write(total);
            writer.close();
            
            balanceCaeser.encrypt(12, "csv");
            
            return total;
            
        } catch (FileNotFoundException e) {            
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e);
        }
        
        return "0.00";
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		
        
        Caeser spendingCaeser = new Caeser(main.userName + "spending.csv");
        
        try {
            spendingCaeser.decrypt(10, "csv");
        }
        catch (FileNotFoundException ignore) {
            ignore.getMessage();
        }

        try {
            // create file writer to write to, and a string builder to build string to write to file
            FileWriter writer = new FileWriter(main.userName + "spending.csv", true); //creates file in project folder (...CSED13/SpendingTracker)
            StringBuilder sb = new StringBuilder();
            
            // get amount spent in ?? text
            var spent = tf.getText();
            if(spent.length() == 0){ //prevents empty amounts being added
                return;
            } else if(spent.charAt(0) == '??'){
                spent = spent.substring(1);
            }
            spent = spent.replace(",", "");
            
            if (!MoneyIn.isSelected()){
                // if money is coming out make it negative
                spent = "-" + spent;
            }
            
            String newBalance = this.modifyBalance(spent);
            main.updateBalance();
            
            System.out.println(spent);
            sb.append(spent);
            sb.append(',');
            
            // get the date and format it,
            sb.append(df.format(tf1.getValue()));
            sb.append(',');
            
            // get the category that was entered
            sb.append(CategoryBox.getItemAt(CategoryBox.getSelectedIndex()));
            sb.append(',');
            
            // add in current balance
            sb.append(newBalance);
            
            // create new line for next entry
            sb.append('\n');
            
            // use file writer to write string to file
            writer.write(sb.toString());
            writer.close();
            
            spendingCaeser.encrypt(10, "csv");
            
          } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
          } catch (IOException e){
              System.out.println(e);
          }
        tf.setText("??");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void MoneyInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoneyInActionPerformed

    private void CategoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryBoxActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        Caeser categoriesCaeser = new Caeser(main.userName + "categories.csv");
        
        try {
            categoriesCaeser.decrypt(8, "csv");
        }
        catch (FileNotFoundException ignore) {}

        
// When shown, we want to add all categories to selection
        try {
            // create file reader to read bytes, and buffered reader to read lines
            BufferedReader reader = new BufferedReader(new FileReader(main.userName + "categories.csv"));
            
            // while there is still data...
            String lineRead; 
             
            // clear the category box
            CategoryBox.removeAllItems();
            
            int i = 0;
             
            // while there is data to be read from file..
            while ((lineRead = reader.readLine()) != null){
                // add each new category
                CategoryBox.addItem(lineRead);
                i++;
            }
            
            if (i == 0){
                // no categories found, can't enter a spending
                JOptionPane.showMessageDialog(null, "You must create categories before entering spending!");
                
                try {
                    categoriesCaeser.encrypt(8, "csv");
                }
                catch (FileNotFoundException ignore) {}

                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            }
            // close buffered reader
            reader.close();
            
            categoriesCaeser.encrypt(8, "csv");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "You must create categories before entering spending!");
            
            try {
                categoriesCaeser.encrypt(8, "csv");
            }
            catch (FileNotFoundException ignore) {}

            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            System.out.println(e.getMessage());
        } catch (IOException e){
              System.out.println(e);
        }
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoryBox;
    private javax.swing.JCheckBox MoneyIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JFormattedTextField tf;
    private javax.swing.JFormattedTextField tf1;
    // End of variables declaration//GEN-END:variables
}
