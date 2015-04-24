/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrey
 */
public class InventoryGUI extends javax.swing.JFrame {

    /**
     * Creates new form InventoryGUI
     */
    public InventoryGUI() throws IOException {
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

        honeyImage = new javax.swing.JLabel();
        herbsImage = new javax.swing.JLabel();
        clayImage = new javax.swing.JLabel();
        mineralImage = new javax.swing.JLabel();
        potionImage = new javax.swing.JLabel();
        incenseImage = new javax.swing.JLabel();
        gemsImage = new javax.swing.JLabel();
        lifeelixirImage = new javax.swing.JLabel();
        manacrystalImage = new javax.swing.JLabel();
        philosopherstoneImage = new javax.swing.JLabel();
        honeyCount = new javax.swing.JLabel();
        herbsCount = new javax.swing.JLabel();
        mineralCount = new javax.swing.JLabel();
        clayCount = new javax.swing.JLabel();
        incenseCount = new javax.swing.JLabel();
        potionCount = new javax.swing.JLabel();
        gemsCount = new javax.swing.JLabel();
        philosopherstoneCount = new javax.swing.JLabel();
        manacrystalCount = new javax.swing.JLabel();
        lifeelixirCount = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory");
        setPreferredSize(new java.awt.Dimension(800, 600));

        honeyImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/honey.png"))); // NOI18N

        herbsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/herbs.png"))); // NOI18N

        clayImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clay.png"))); // NOI18N

        mineralImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mineral.png"))); // NOI18N

        potionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/potion.png"))); // NOI18N

        incenseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incense.png"))); // NOI18N

        gemsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gems.png"))); // NOI18N

        lifeelixirImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lifeelixir.png"))); // NOI18N

        manacrystalImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manacrystal.png"))); // NOI18N

        philosopherstoneImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/philosopherstone.png"))); // NOI18N

        honeyCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        herbsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mineralCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        clayCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        incenseCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        potionCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        gemsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        philosopherstoneCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        manacrystalCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lifeelixirCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(potionCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gemsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mineralCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(clayImage)
                                        .addGap(18, 18, 18)
                                        .addComponent(mineralImage))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(honeyImage)
                                            .addComponent(honeyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(herbsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(herbsImage)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(potionImage)
                                            .addComponent(gemsImage))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(incenseCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(incenseImage)))))
                            .addComponent(clayCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lifeelixirImage)
                                    .addComponent(manacrystalImage)
                                    .addComponent(philosopherstoneImage)
                                    .addComponent(philosopherstoneCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manacrystalCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lifeelixirCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(backButton)))))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lifeelixirImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lifeelixirCount, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manacrystalImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(herbsImage)
                            .addComponent(honeyImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(honeyCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(herbsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clayImage)
                            .addComponent(mineralImage))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clayCount, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mineralCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manacrystalCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(potionImage)
                    .addComponent(incenseImage)
                    .addComponent(philosopherstoneImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(incenseCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(philosopherstoneCount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(potionCount, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(gemsImage)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gemsCount)
                        .addGap(65, 65, 65))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MapGUI map = new MapGUI();
        setVisible(false);
        map.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new InventoryGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InventoryGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel clayCount;
    private javax.swing.JLabel clayImage;
    private javax.swing.JLabel gemsCount;
    private javax.swing.JLabel gemsImage;
    private javax.swing.JLabel herbsCount;
    private javax.swing.JLabel herbsImage;
    private javax.swing.JLabel honeyCount;
    private javax.swing.JLabel honeyImage;
    private javax.swing.JLabel incenseCount;
    private javax.swing.JLabel incenseImage;
    private javax.swing.JLabel lifeelixirCount;
    private javax.swing.JLabel lifeelixirImage;
    private javax.swing.JLabel manacrystalCount;
    private javax.swing.JLabel manacrystalImage;
    private javax.swing.JLabel mineralCount;
    private javax.swing.JLabel mineralImage;
    private javax.swing.JLabel philosopherstoneCount;
    private javax.swing.JLabel philosopherstoneImage;
    private javax.swing.JLabel potionCount;
    private javax.swing.JLabel potionImage;
    // End of variables declaration//GEN-END:variables
}