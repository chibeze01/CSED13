/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spendingtracker;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author adam-
 */
public class MainMenu extends javax.swing.JFrame {

    public String userName;
    
    public Caeser caeser;
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu(String userName) {
        caeser = new Caeser();
        initComponents();
        this.userName = userName;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.generateMemo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        InnerHeaderPanel = new javax.swing.JPanel();
        InnerHeaderPanel1 = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        BottomPanel = new javax.swing.JPanel();
        BottomInnerPanel = new javax.swing.JPanel();
        Configure = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        TopPanel = new javax.swing.JPanel();
        TopInnerPanel = new javax.swing.JPanel();
        Spending = new javax.swing.JButton();
        Goals = new javax.swing.JButton();
        Data = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BalanceDisplay = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        memo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(204, 204, 204));
        Background.setForeground(new java.awt.Color(255, 255, 255));

        HeaderPanel.setBackground(new java.awt.Color(218, 218, 218));

        Title1.setBackground(new java.awt.Color(204, 204, 204));
        Title1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Title1.setForeground(new java.awt.Color(24, 51, 51));
        Title1.setText("Spending Tracker");
        Title1.setToolTipText("");

        javax.swing.GroupLayout InnerHeaderPanel1Layout = new javax.swing.GroupLayout(InnerHeaderPanel1);
        InnerHeaderPanel1.setLayout(InnerHeaderPanel1Layout);
        InnerHeaderPanel1Layout.setHorizontalGroup(
            InnerHeaderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerHeaderPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InnerHeaderPanel1Layout.setVerticalGroup(
            InnerHeaderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout InnerHeaderPanelLayout = new javax.swing.GroupLayout(InnerHeaderPanel);
        InnerHeaderPanel.setLayout(InnerHeaderPanelLayout);
        InnerHeaderPanelLayout.setHorizontalGroup(
            InnerHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerHeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InnerHeaderPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        InnerHeaderPanelLayout.setVerticalGroup(
            InnerHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InnerHeaderPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(InnerHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InnerHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BottomInnerPanel.setLayout(new java.awt.GridLayout(0, 1, 5, 10));

        Configure.setBackground(new java.awt.Color(204, 204, 204));
        Configure.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Configure.setText("  Configure");
        Configure.setToolTipText("");
        Configure.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Configure.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Configure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Configure.setIconTextGap(0);
        Configure.setMinimumSize(new java.awt.Dimension(0, 0));
        Configure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigureActionPerformed(evt);
            }
        });
        BottomInnerPanel.add(Configure);

        Help.setBackground(new java.awt.Color(204, 204, 204));
        Help.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Help.setText("  Help");
        Help.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Help.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Help.setIconTextGap(0);
        Help.setMinimumSize(new java.awt.Dimension(0, 0));
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        BottomInnerPanel.add(Help);

        Exit.setBackground(new java.awt.Color(204, 204, 204));
        Exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Exit.setText("  Exit");
        Exit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Exit.setIconTextGap(0);
        Exit.setMinimumSize(new java.awt.Dimension(0, 0));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        BottomInnerPanel.add(Exit);

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BottomInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        BottomPanelLayout.setVerticalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BottomInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        TopInnerPanel.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        Spending.setBackground(new java.awt.Color(204, 204, 204));
        Spending.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Spending.setText("Spending");
        Spending.setToolTipText("");
        Spending.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Spending.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Spending.setIconTextGap(0);
        Spending.setMinimumSize(new java.awt.Dimension(0, 0));
        Spending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpendingActionPerformed(evt);
            }
        });
        TopInnerPanel.add(Spending);

        Goals.setBackground(new java.awt.Color(204, 204, 204));
        Goals.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Goals.setText("Goals");
        Goals.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Goals.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Goals.setIconTextGap(0);
        Goals.setMinimumSize(new java.awt.Dimension(0, 0));
        Goals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoalsActionPerformed(evt);
            }
        });
        TopInnerPanel.add(Goals);

        Data.setBackground(new java.awt.Color(204, 204, 204));
        Data.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Data.setText("Data");
        Data.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Data.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Data.setIconTextGap(0);
        Data.setMinimumSize(new java.awt.Dimension(0, 0));
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
            }
        });
        TopInnerPanel.add(Data);

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TopInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TopInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        BalanceDisplay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BalanceDisplay.setText("Your balance: £0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BalanceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BalanceDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        memo.setEditable(false);
        memo.setColumns(20);
        memo.setLineWrap(true);
        memo.setRows(4);
        memo.setText("You have 12 days left on your first goal.");
        memo.setWrapStyleWord(true);
        jScrollPane1.setViewportView(memo);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SpendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpendingActionPerformed
        Spending spending = new Spending(this);
        spending.setVisible(true);
        
    }//GEN-LAST:event_SpendingActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
        Data data = new Data(this);
        data.setVisible(true);
    }//GEN-LAST:event_DataActionPerformed
    
    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Help help = new Help();
        help.setVisible(true);
    }//GEN-LAST:event_HelpActionPerformed

    private void ConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigureActionPerformed
        Configure configure = new Configure(this);
        configure.setVisible(true);
    }//GEN-LAST:event_ConfigureActionPerformed

    private void GoalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoalsActionPerformed
        Goals goals = new Goals(this);
        goals.setVisible(true);
    }//GEN-LAST:event_GoalsActionPerformed

    public void updateBalance() {
        
        Caeser balanceCaeser = new Caeser(this.userName + "balance.csv");
        
        try {
            balanceCaeser.decrypt(12, "csv");
        }
        catch (FileNotFoundException ignore) {}
        
        // TODO: update balance using csv file when called
        try{
            // create file reader to read bytes, and buffered reader to read lines
            BufferedReader reader = new BufferedReader(new FileReader(this.userName + "balance.csv"));
            
            String line = reader.readLine();
            
            if (line == null){
                // if null set to £0.00
                FileWriter writer = new FileWriter(this.userName + "balance.csv", false);
            
                // use file writer to write string to file
                writer.write("0.00");
                
                writer.close();
                
                BalanceDisplay.setText("Your current balance is £0.00");
            }else{
                BalanceDisplay.setText("Your current balance is £" + line);
            }
            
            
            
            // close buffered reader
            reader.close();
            
            balanceCaeser.encrypt(12, "csv");
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void generateMemo(){
        String memoTxt = "ERROR";
        String line;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(this.userName + "goals.csv"));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
            while ((line = br.readLine()) != null && line.split(",").length > 1) {

                    line = line;

                    System.out.println(line);

                    // use comma as separator
                    String[] item = line.split(",");

                    String goalDesc = item[0];
                    String endDate = item[1];
                    boolean goalMet = Boolean.parseBoolean(item[2]);
                    
                    if(goalMet){
                        memoTxt = "Tip: Create a new goal under 'Goals' -> 'add goal'";
                    }else{
                        long days = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse(endDate, formatter));
                        memoTxt = "You have " + Long.toString(days) + " days until the end of your '" + goalDesc + "' goal.";
                        break;
                    }
                }

                br.close();
        }catch (FileNotFoundException e) {
            System.out.print("not found");
            // create file and re-load table
            try{
                FileWriter writer = new FileWriter(this.userName + "goals.csv", false);
                writer.close();
            } catch(IOException ignore){}
        } catch (IOException e) {
            e.printStackTrace();
        }
        memo.setText(memoTxt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BalanceDisplay;
    private javax.swing.JPanel BottomInnerPanel;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JButton Configure;
    private javax.swing.JButton Data;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Goals;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton Help;
    private javax.swing.JPanel InnerHeaderPanel;
    private javax.swing.JPanel InnerHeaderPanel1;
    private javax.swing.JButton Spending;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel TopInnerPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea memo;
    // End of variables declaration//GEN-END:variables
}
