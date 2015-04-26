package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Andrey
 */
public class MainMenuGUI extends javax.swing.JFrame {
    //param
    public static Client C;
    private String username;
    private String password;
    private String ip;
    private int port;
    private JPanel serverPort;
    
    /**
     * Creates new form MainMenuGUI
     */
    public MainMenuGUI() {
        //add(serverPort,BorderLayout.NORTH);
        username = "";
        password = "";
        ip ="127.0.0.1";
        port = 2000;
        C =  new Client(ip,port);
        initComponents();
        setVisible(true);
        alertDialog.setBounds(600,300,200,175);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serverDialog = new javax.swing.JDialog();
        ipLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        ipTextField = new javax.swing.JTextField();
        portTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        alertDialog = new javax.swing.JDialog();
        alertLabel = new javax.swing.JLabel();
        okalertButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        server = new javax.swing.JButton();

        serverDialog.setTitle("Server");

        ipLabel.setText("IP: ");

        portLabel.setText("Port:");

        cancelButton.setText("Cancel");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout serverDialogLayout = new javax.swing.GroupLayout(serverDialog.getContentPane());
        serverDialog.getContentPane().setLayout(serverDialogLayout);
        serverDialogLayout.setHorizontalGroup(
            serverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(serverDialogLayout.createSequentialGroup()
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addGroup(serverDialogLayout.createSequentialGroup()
                        .addGroup(serverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portLabel)
                            .addComponent(ipLabel))
                        .addGap(18, 18, 18)
                        .addGroup(serverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ipTextField)
                            .addComponent(portTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        serverDialogLayout.setVerticalGroup(
            serverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipLabel)
                    .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(serverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portLabel)
                    .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(serverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        alertDialog.setTitle("Alert");

        okalertButton.setText("OK");
        okalertButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        setTitle("Main Menu");

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        server.setText("Server");
        server.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serverMouseClicked(evt);
            }
        });
        server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTextField)
                            .addComponent(usernameTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addComponent(server)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(server)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(signUpButton))
                .addContainerGap(395, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        username = usernameTextField.getText();
        password = passwordTextField.getText();
        C.logIn(username, password);
        if(C.getStatus().equals("ok"))
        {   
            MapGUI map = new MapGUI();
            setVisible(false);
        }
        else{
            alertDialog.setVisible(true);
            if(C.getStatus().equals("fail")){
                alertLabel.setText(C.getDescription());
            }
            else{
                alertLabel.setText("Error!");
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        username = usernameTextField.getText();
        password = passwordTextField.getText();
        C.signUp(username, password);
        alertDialog.setVisible(true);
        switch (C.getStatus()) {
            case "ok":
                alertLabel.setText("Sign Up Success");
                break;
            case "fail":
                alertLabel.setText(C.getDescription());
                break;
            case "error":
                alertLabel.setText("Error!");
                break;
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void serverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serverMouseClicked

    }//GEN-LAST:event_serverMouseClicked

    private void serverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverActionPerformed
        ipTextField.setText(ip);
        portTextField.setText(String.valueOf(port));
        serverDialog.setBounds(600,300,200,175);
        serverDialog.setVisible(true);
    }//GEN-LAST:event_serverActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        ip = ipTextField.getText().toString();
        port = Integer.valueOf(portTextField.getText());
        C.setIp(ip);
        C.setPort(port);
        serverDialog.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void okalertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okalertButtonActionPerformed
        alertDialog.setVisible(false);
    }//GEN-LAST:event_okalertButtonActionPerformed
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /*
         * Create and display the form
         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenuGUI().setVisible(true);
//            }
//        });
        new MainMenuGUI();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog alertDialog;
    private javax.swing.JLabel alertLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JTextField ipTextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton okButton;
    private javax.swing.JButton okalertButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JTextField portTextField;
    private javax.swing.JButton server;
    private javax.swing.JDialog serverDialog;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
