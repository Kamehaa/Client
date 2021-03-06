/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;

/**
 *
 * @author Andrey
 */
public class MixGUI extends javax.swing.JFrame {

    /**
     * Creates new form MixGUI
     */
    JSONMailer mailer;
    
    public MixGUI() throws JSONException {
        setVisible(true);
        initComponents();
        initLabelCount();
        alertDialog.setBounds(600,400, 170, 100);
    }
    public int getIdFromIcon(String s){
        int x;
        int pos1 = s.length()-1;
        int pos2 = s.length()-1;
        String temp;
        while(s.charAt(pos1)!='/'){
            pos1--;
        }
        while(s.charAt(pos2)!='.'){
            pos2--;
        }
        temp = s.substring(pos1+1,pos2);
        switch (temp) {
            case "honey":
                x = 0 ;
                break;
            case "herbs":
                x = 1 ;
                break;
            case "clay":
                x = 2 ;
                break;
            case "mineral":
                x = 3 ;
                break;
            case "potion":
                x = 4 ;
                break;
            case "incense":
                x = 5 ;
                break;
            case "gems":
                x = 6 ;
                break;
            case "lifeelixir":
                x = 7 ;
                break;
            case "manacrystal":
                x = 8 ;
                break;
            case "philosopherstone":
                x = 9 ;
                break;
            default:
                x = -1;
                break;
        }
        return x;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alertDialog = new javax.swing.JDialog();
        alertLabel = new javax.swing.JLabel();
        okalertButton = new javax.swing.JButton();
        mixButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        honeyCount = new javax.swing.JLabel();
        herbsCount = new javax.swing.JLabel();
        clayCount = new javax.swing.JLabel();
        mineralCount = new javax.swing.JLabel();
        potionCount = new javax.swing.JLabel();
        incenseCount = new javax.swing.JLabel();
        gemsCount = new javax.swing.JLabel();
        lifeelixirCount = new javax.swing.JLabel();
        manacrystalCount = new javax.swing.JLabel();
        philosopherstoneCount = new javax.swing.JLabel();
        honeyButton = new javax.swing.JButton();
        herbsButton = new javax.swing.JButton();
        slot1 = new javax.swing.JButton();
        slot2 = new javax.swing.JButton();
        clayButton = new javax.swing.JButton();
        mineralButton = new javax.swing.JButton();
        potionButton = new javax.swing.JButton();
        incenseButton = new javax.swing.JButton();
        gemsButton = new javax.swing.JButton();
        lifeelixirButton = new javax.swing.JButton();
        manacrystalButton = new javax.swing.JButton();
        philosopherstoneButton = new javax.swing.JButton();

        alertDialog.setTitle("Alert");

        okalertButton.setText("OK");
        okalertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okalertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alertDialogLayout = new javax.swing.GroupLayout(alertDialog.getContentPane());
        alertDialog.getContentPane().setLayout(alertDialogLayout);
        alertDialogLayout.setHorizontalGroup(
            alertDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alertDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alertDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(alertDialogLayout.createSequentialGroup()
                        .addComponent(okalertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        alertDialogLayout.setVerticalGroup(
            alertDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alertDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okalertButton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mix Item");
        setPreferredSize(new java.awt.Dimension(800, 600));

        mixButton.setText("Mix");
        mixButton.setPreferredSize(new java.awt.Dimension(55, 23));
        mixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        honeyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/honey.png"))); // NOI18N
        honeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                honeyButtonActionPerformed(evt);
            }
        });

        herbsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/herbs.png"))); // NOI18N
        herbsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herbsButtonActionPerformed(evt);
            }
        });

        slot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot1ActionPerformed(evt);
            }
        });

        slot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot2ActionPerformed(evt);
            }
        });

        clayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clay.png"))); // NOI18N
        clayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clayButtonActionPerformed(evt);
            }
        });

        mineralButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mineral.png"))); // NOI18N
        mineralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineralButtonActionPerformed(evt);
            }
        });

        potionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/potion.png"))); // NOI18N
        potionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potionButtonActionPerformed(evt);
            }
        });

        incenseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incense.png"))); // NOI18N
        incenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incenseButtonActionPerformed(evt);
            }
        });

        gemsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gems.png"))); // NOI18N
        gemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemsButtonActionPerformed(evt);
            }
        });

        lifeelixirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lifeelixir.png"))); // NOI18N
        lifeelixirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifeelixirButtonActionPerformed(evt);
            }
        });

        manacrystalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manacrystal.png"))); // NOI18N
        manacrystalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manacrystalButtonActionPerformed(evt);
            }
        });

        philosopherstoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/philosopherstone.png"))); // NOI18N
        philosopherstoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                philosopherstoneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(incenseCount)
                .addGap(127, 127, 127)
                .addComponent(gemsCount)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lifeelixirCount)
                        .addGap(96, 96, 96)
                        .addComponent(manacrystalCount)
                        .addGap(97, 97, 97)
                        .addComponent(philosopherstoneCount)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mixButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(honeyCount)
                        .addGap(127, 127, 127)
                        .addComponent(herbsCount))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(honeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(herbsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lifeelixirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mineralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manacrystalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(clayCount)
                        .addGap(124, 124, 124)
                        .addComponent(mineralCount)
                        .addGap(128, 128, 128)
                        .addComponent(potionCount))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(philosopherstoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(potionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(honeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clayButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herbsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mineralButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(herbsCount)
                    .addComponent(clayCount)
                    .addComponent(potionCount)
                    .addComponent(mineralCount)
                    .addComponent(honeyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(incenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(incenseCount)
                            .addComponent(lifeelixirCount)
                            .addComponent(philosopherstoneCount)
                            .addComponent(manacrystalCount)
                            .addComponent(gemsCount))
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(philosopherstoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(manacrystalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(lifeelixirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mixButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backButton))
                            .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixButtonActionPerformed
        if(slot1.getIcon()!= null & slot2.getIcon() != null){
            int id1 = getIdFromIcon(slot1.getIcon().toString());
            int id2 = getIdFromIcon(slot2.getIcon().toString());
            MainMenuGUI.C.mixItem(id1,id2);
            alertDialog.setSize(170,100);
            alertDialog.setVisible(true);
            switch (MainMenuGUI.C.getStatus()) {
                case "ok":
                    alertLabel.setText("Mix Success");
                    try {
                        initLabelCount();
                    } catch (JSONException ex) {
                        Logger.getLogger(MixGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "fail":
                    alertLabel.setText(MainMenuGUI.C.getDescription());
                    break;
                case "error":
                    alertLabel.setText("Mix Error");
                    break;
            }
        }
        MainMenuGUI.C.inventory();
        try {
            initLabelCount();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_mixButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MapGUI map = new MapGUI();
        setVisible(false);
        map.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void honeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_honeyButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == honeyButton.getIcon()){
            slot1.setIcon(honeyButton.getIcon());
        }
        else{
            slot2.setIcon(honeyButton.getIcon());
        }
    }//GEN-LAST:event_honeyButtonActionPerformed

    private void gemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemsButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == gemsButton.getIcon()){
            slot1.setIcon(gemsButton.getIcon());
        }
        else{
            slot2.setIcon(gemsButton.getIcon());
        }
    }//GEN-LAST:event_gemsButtonActionPerformed

    private void herbsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herbsButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == herbsButton.getIcon()){
            slot1.setIcon(herbsButton.getIcon());
        }
        else{
            slot2.setIcon(herbsButton.getIcon());
        }
    }//GEN-LAST:event_herbsButtonActionPerformed

    private void clayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clayButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == clayButton.getIcon()){
            slot1.setIcon(clayButton.getIcon());
        }
        else{
            slot2.setIcon(clayButton.getIcon());
        }
    }//GEN-LAST:event_clayButtonActionPerformed

    private void mineralButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineralButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == mineralButton.getIcon()){
            slot1.setIcon(mineralButton.getIcon());
        }
        else{
            slot2.setIcon(mineralButton.getIcon());
        }
    }//GEN-LAST:event_mineralButtonActionPerformed

    private void potionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potionButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == potionButton.getIcon()){
            slot1.setIcon(potionButton.getIcon());
        }
        else{
            slot2.setIcon(potionButton.getIcon());
        }
    }//GEN-LAST:event_potionButtonActionPerformed

    private void incenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incenseButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == potionButton.getIcon()){
            slot1.setIcon(potionButton.getIcon());
        }
        else{
            slot2.setIcon(potionButton.getIcon());
        }
    }//GEN-LAST:event_incenseButtonActionPerformed

    private void lifeelixirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lifeelixirButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == lifeelixirButton.getIcon()){
            slot1.setIcon(lifeelixirButton.getIcon());
        }
        else{
            slot2.setIcon(lifeelixirButton.getIcon());
        }
    }//GEN-LAST:event_lifeelixirButtonActionPerformed

    private void manacrystalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manacrystalButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == manacrystalButton.getIcon()){
            slot1.setIcon(manacrystalButton.getIcon());
        }
        else{
            slot2.setIcon(manacrystalButton.getIcon());
        }
    }//GEN-LAST:event_manacrystalButtonActionPerformed

    private void philosopherstoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_philosopherstoneButtonActionPerformed
        if(slot1.getIcon() == null || slot1.getIcon() == philosopherstoneButton.getIcon()){
            slot1.setIcon(philosopherstoneButton.getIcon());
        }
        else{
            slot2.setIcon(philosopherstoneButton.getIcon());
        }
    }//GEN-LAST:event_philosopherstoneButtonActionPerformed

    private void slot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot1ActionPerformed
        if(slot1.getIcon() != null){
            slot1.setIcon(null); 
        }
    }//GEN-LAST:event_slot1ActionPerformed

    private void slot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot2ActionPerformed
        if(slot2.getIcon() != null){
            slot2.setIcon(null); 
        }
    }//GEN-LAST:event_slot2ActionPerformed

    private void okalertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okalertButtonActionPerformed
        alertDialog.setVisible(false);
    }//GEN-LAST:event_okalertButtonActionPerformed
    
    private void initLabelCount() throws JSONException{
        MainMenuGUI.C.inventory();
        honeyCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(0)));
        herbsCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(1)));
        clayCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(2)));
        mineralCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(3)));
        potionCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(4)));
        incenseCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(5)));
        gemsCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(6)));
        lifeelixirCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(7)));
        manacrystalCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(8)));
        philosopherstoneCount.setText(String.valueOf(MainMenuGUI.C.getInv().getInt(9)));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new MixGUI();
                } catch (JSONException ex) {
                    Logger.getLogger(MixGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog alertDialog;
    private javax.swing.JLabel alertLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clayButton;
    private javax.swing.JLabel clayCount;
    private javax.swing.JButton gemsButton;
    private javax.swing.JLabel gemsCount;
    private javax.swing.JButton herbsButton;
    private javax.swing.JLabel herbsCount;
    private javax.swing.JButton honeyButton;
    private javax.swing.JLabel honeyCount;
    private javax.swing.JButton incenseButton;
    private javax.swing.JLabel incenseCount;
    private javax.swing.JButton lifeelixirButton;
    private javax.swing.JLabel lifeelixirCount;
    private javax.swing.JButton manacrystalButton;
    private javax.swing.JLabel manacrystalCount;
    private javax.swing.JButton mineralButton;
    private javax.swing.JLabel mineralCount;
    private javax.swing.JButton mixButton;
    private javax.swing.JButton okalertButton;
    private javax.swing.JButton philosopherstoneButton;
    private javax.swing.JLabel philosopherstoneCount;
    private javax.swing.JButton potionButton;
    private javax.swing.JLabel potionCount;
    private javax.swing.JButton slot1;
    private javax.swing.JButton slot2;
    // End of variables declaration//GEN-END:variables
}
