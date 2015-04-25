/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;

/**
 *
 * @author Andrey
 */
public class InventoryGUI extends javax.swing.JFrame {

    /**
     * Creates new form InventoryGUI
     */
    public InventoryGUI() throws IOException, JSONException {
        initComponents();
        honeyCount.setText(String.valueOf(MapGUI.C.getInv().getInt(0)));
        herbsCount.setText(String.valueOf(MapGUI.C.getInv().getInt(1)));
        clayCount.setText(String.valueOf(MapGUI.C.getInv().getInt(2)));
        mineralCount.setText(String.valueOf(MapGUI.C.getInv().getInt(3)));
        potionCount.setText(String.valueOf(MapGUI.C.getInv().getInt(4)));
        incenseCount.setText(String.valueOf(MapGUI.C.getInv().getInt(5)));
        gemsCount.setText(String.valueOf(MapGUI.C.getInv().getInt(6)));
        lifeelixirCount.setText(String.valueOf(MapGUI.C.getInv().getInt(7)));
        manacrystalCount.setText(String.valueOf(MapGUI.C.getInv().getInt(8)));
        philosopherstoneCount.setText(String.valueOf(MapGUI.C.getInv().getInt(9)));
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clayCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mineralCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(lifeelixirCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(herbsImage)
                            .addComponent(honeyImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(honeyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(herbsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mineralImage)
                            .addComponent(clayImage))
                        .addGap(11, 11, 11))
                    .addComponent(manacrystalImage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(clayCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(mineralCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manacrystalCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(potionImage)
                    .addComponent(incenseImage)
                    .addComponent(philosopherstoneImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(incenseCount, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                        .addGap(169, 169, 169))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(philosopherstoneCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75)
                                .addComponent(backButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(potionCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(gemsImage)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gemsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
//        MapGUI map = new MapGUI();
        setVisible(false);
        dispose();
//        map.setVisible(true);
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
                    new InventoryGUI();
                } catch (IOException ex) {
                    Logger.getLogger(InventoryGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JSONException ex) {
                    Logger.getLogger(InventoryGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButton;
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
