/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spendingtracker;

/**
 *
 * @author adam-
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        Background = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        InnerHeaderPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(204, 204, 204));
        Background.setForeground(new java.awt.Color(255, 255, 255));

        HeaderPanel.setBackground(new java.awt.Color(218, 218, 218));

        Title.setBackground(new java.awt.Color(204, 204, 204));
        Title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(24, 51, 51));
        Title.setText("Spending Tracker");
        Title.setToolTipText("");

        javax.swing.GroupLayout InnerHeaderPanelLayout = new javax.swing.GroupLayout(InnerHeaderPanel);
        InnerHeaderPanel.setLayout(InnerHeaderPanelLayout);
        InnerHeaderPanelLayout.setHorizontalGroup(
            InnerHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerHeaderPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        InnerHeaderPanelLayout.setVerticalGroup(
            InnerHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(InnerHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        Configure.setForeground(new java.awt.Color(51, 51, 51));
        Configure.setText("  Configure");
        Configure.setToolTipText("");
        Configure.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Configure.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Configure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Configure.setIconTextGap(0);
        Configure.setMinimumSize(new java.awt.Dimension(0, 0));
        BottomInnerPanel.add(Configure);

        Help.setBackground(new java.awt.Color(204, 204, 204));
        Help.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Help.setForeground(new java.awt.Color(51, 51, 51));
        Help.setText("  Help");
        Help.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Help.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Help.setIconTextGap(0);
        Help.setMinimumSize(new java.awt.Dimension(0, 0));
        BottomInnerPanel.add(Help);

        Exit.setBackground(new java.awt.Color(204, 204, 204));
        Exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(51, 51, 51));
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
        Spending.setForeground(new java.awt.Color(51, 51, 51));
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
        Goals.setForeground(new java.awt.Color(51, 51, 51));
        Goals.setText("Goals");
        Goals.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Goals.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Goals.setIconTextGap(0);
        Goals.setMinimumSize(new java.awt.Dimension(0, 0));
        TopInnerPanel.add(Goals);

        Data.setBackground(new java.awt.Color(204, 204, 204));
        Data.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Data.setForeground(new java.awt.Color(51, 51, 51));
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

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SpendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpendingActionPerformed
        Spending spending = new Spending();
        spending.setVisible(true);
        
    }//GEN-LAST:event_SpendingActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
        security Security = new security();
        Security.setVisible(true);
    }//GEN-LAST:event_DataActionPerformed
    
    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Help help = new help();
        help.setVisible(true);
    }//GEN-LAST:event_HelpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BottomInnerPanel;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JButton Configure;
    private javax.swing.JButton Data;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Goals;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton Help;
    private javax.swing.JPanel InnerHeaderPanel;
    private javax.swing.JButton Spending;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TopInnerPanel;
    private javax.swing.JPanel TopPanel;
    // End of variables declaration//GEN-END:variables
}
