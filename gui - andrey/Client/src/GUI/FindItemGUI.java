/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Andrey
 */
public class FindItemGUI extends javax.swing.JFrame {

    /**
     * Creates new form FindItemGUI
     */
    public FindItemGUI() {
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

        slotButton = new javax.swing.JButton();
        honeyCount = new javax.swing.JLabel();
        philosopherstoneButton = new javax.swing.JButton();
        lifeelixirButton = new javax.swing.JButton();
        manacrystalButton = new javax.swing.JButton();
        herbsCount = new javax.swing.JLabel();
        clayCount = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        gemsButton = new javax.swing.JButton();
        findButton = new javax.swing.JButton();
        incenseButton = new javax.swing.JButton();
        potionButton = new javax.swing.JButton();
        mineralButton = new javax.swing.JButton();
        clayButton = new javax.swing.JButton();
        herbsButton = new javax.swing.JButton();
        honeyButton = new javax.swing.JButton();
        manacrystalCount = new javax.swing.JLabel();
        philosopherstoneCount = new javax.swing.JLabel();
        potionCount = new javax.swing.JLabel();
        incenseCount = new javax.swing.JLabel();
        gemsCount = new javax.swing.JLabel();
        lifeelixirCount = new javax.swing.JLabel();
        mineralCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        slotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotButtonActionPerformed(evt);
            }
        });

        philosopherstoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/philosopherstone.png"))); // NOI18N
        philosopherstoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                philosopherstoneButtonActionPerformed(evt);
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

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        gemsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gems.png"))); // NOI18N
        gemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemsButtonActionPerformed(evt);
            }
        });

        findButton.setText("Find");
        findButton.setPreferredSize(new java.awt.Dimension(55, 23));
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        incenseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incense.png"))); // NOI18N
        incenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incenseButtonActionPerformed(evt);
            }
        });

        potionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/potion.png"))); // NOI18N
        potionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potionButtonActionPerformed(evt);
            }
        });

        mineralButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mineral.png"))); // NOI18N
        mineralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineralButtonActionPerformed(evt);
            }
        });

        clayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clay.png"))); // NOI18N
        clayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clayButtonActionPerformed(evt);
            }
        });

        herbsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/herbs.png"))); // NOI18N
        herbsButton.setPreferredSize(new java.awt.Dimension(85, 85));
        herbsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herbsButtonActionPerformed(evt);
            }
        });

        honeyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/honey.png"))); // NOI18N
        honeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                honeyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(slotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(honeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(incenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(honeyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incenseCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(herbsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gemsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(herbsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gemsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lifeelixirCount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(clayCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lifeelixirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manacrystalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mineralCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mineralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(manacrystalCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(potionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(philosopherstoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potionCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(philosopherstoneCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(potionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(herbsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(honeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mineralButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(honeyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(incenseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(incenseCount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(potionCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(herbsCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clayCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mineralCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gemsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gemsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(manacrystalButton)
                                        .addComponent(philosopherstoneButton))
                                    .addComponent(lifeelixirButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(manacrystalCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lifeelixirCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(philosopherstoneCount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backButton)))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manacrystalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manacrystalButtonActionPerformed
        slotButton.setIcon(manacrystalButton.getIcon());
    }//GEN-LAST:event_manacrystalButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MapGUI map = new MapGUI();
        setVisible(false);
        map.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findButtonActionPerformed

    private void honeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_honeyButtonActionPerformed
        slotButton.setIcon(honeyButton.getIcon());
    }//GEN-LAST:event_honeyButtonActionPerformed

    private void herbsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herbsButtonActionPerformed
        slotButton.setIcon(herbsButton.getIcon());
    }//GEN-LAST:event_herbsButtonActionPerformed

    private void clayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clayButtonActionPerformed
        slotButton.setIcon(clayButton.getIcon());
    }//GEN-LAST:event_clayButtonActionPerformed

    private void mineralButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineralButtonActionPerformed
        slotButton.setIcon(mineralButton.getIcon());
    }//GEN-LAST:event_mineralButtonActionPerformed

    private void potionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potionButtonActionPerformed
        slotButton.setIcon(potionButton.getIcon());
    }//GEN-LAST:event_potionButtonActionPerformed

    private void incenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incenseButtonActionPerformed
        slotButton.setIcon(incenseButton.getIcon());
    }//GEN-LAST:event_incenseButtonActionPerformed

    private void gemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemsButtonActionPerformed
        slotButton.setIcon(gemsButton.getIcon());
    }//GEN-LAST:event_gemsButtonActionPerformed

    private void lifeelixirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lifeelixirButtonActionPerformed
        slotButton.setIcon(gemsButton.getIcon());
    }//GEN-LAST:event_lifeelixirButtonActionPerformed

    private void philosopherstoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_philosopherstoneButtonActionPerformed
        slotButton.setIcon(philosopherstoneButton.getIcon());
    }//GEN-LAST:event_philosopherstoneButtonActionPerformed

    private void slotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotButtonActionPerformed
        slotButton.setIcon(null);
    }//GEN-LAST:event_slotButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FindItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FindItemGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clayButton;
    private javax.swing.JLabel clayCount;
    private javax.swing.JButton findButton;
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
    private javax.swing.JButton philosopherstoneButton;
    private javax.swing.JLabel philosopherstoneCount;
    private javax.swing.JButton potionButton;
    private javax.swing.JLabel potionCount;
    private javax.swing.JButton slotButton;
    // End of variables declaration//GEN-END:variables
}
