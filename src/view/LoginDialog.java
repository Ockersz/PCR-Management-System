/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.LoginManagement;
import controler.MessageManagement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.Login;

/**
 *
 * @author lihin
 */
@SuppressWarnings("serial")
public class LoginDialog extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    /**
     * A return status code - returned if OK button has been pressed
     */
    /**
     * Creates new form LoginDialog
     */
    public LoginDialog() {

        initComponents();
        runLetters();
        

    }
        void runLetters() {

        Thread t = new Thread() {
            @Override
            public void run() {

                String names[] = {"B", " ", "E", " ", " ", "S", " ", "A", " ", "F", " ", "E", " ", ".", " ", ".", " ", ".", " "};

                while (true) {
                    String title = "";
                    for (int i = 0; i < names.length; i++) {

                        title = title + names[i];
                        try {
                            setTitle(title);
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            }
        };
        t.start();
    }
          

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        lblMicroScope = new javax.swing.JLabel();
        lblStaySafe = new javax.swing.JLabel();
        pnlLoginData = new javax.swing.JPanel();
        lplProfileIcon = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtLoginUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtLoginPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblRegisterUser = new javax.swing.JLabel();
        lblDivide = new javax.swing.JLabel();
        lblForgotPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLeft.setBackground(new java.awt.Color(47, 79, 79));

        lblMicroScope.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMicroScope.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesandicons/microscope_medical_10737.png"))); // NOI18N

        lblStaySafe.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        lblStaySafe.setForeground(new java.awt.Color(153, 153, 153));
        lblStaySafe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaySafe.setText("S T A Y  S A F E ! ! ");

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lblMicroScope, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStaySafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblMicroScope, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStaySafe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 580));

        pnlLoginData.setBackground(new java.awt.Color(0, 255, 255));

        lplProfileIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lplProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesandicons/profile.png"))); // NOI18N

        lblUserName.setForeground(new java.awt.Color(0, 0, 0));
        lblUserName.setText("Username :");

        txtLoginUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtLoginUsername.setForeground(new java.awt.Color(0, 0, 0));

        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password  :");

        txtLoginPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtLoginPassword.setForeground(new java.awt.Color(0, 0, 0));

        btnLogin.setBackground(new java.awt.Color(68, 214, 44));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin.setText("L O G I N");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRegisterUser.setForeground(new java.awt.Color(0, 0, 153));
        lblRegisterUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRegisterUser.setText("Register Now ");
        lblRegisterUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterUserMouseExited(evt);
            }
        });

        lblDivide.setForeground(new java.awt.Color(0, 0, 0));
        lblDivide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDivide.setText("|");

        lblForgotPass.setForeground(new java.awt.Color(0, 0, 153));
        lblForgotPass.setText("Forgot Password?");
        lblForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblForgotPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblForgotPassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginDataLayout = new javax.swing.GroupLayout(pnlLoginData);
        pnlLoginData.setLayout(pnlLoginDataLayout);
        pnlLoginDataLayout.setHorizontalGroup(
            pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginDataLayout.createSequentialGroup()
                .addGroup(pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLoginPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(txtLoginUsername, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(pnlLoginDataLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlLoginDataLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lplProfileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginDataLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlLoginDataLayout.setVerticalGroup(
            pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginDataLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(lplProfileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(160, 160, 160)
                .addGroup(pnlLoginDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisterUser)
                    .addComponent(lblForgotPass)
                    .addComponent(lblDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getRootPane().setDefaultButton(btnLogin);

        getContentPane().add(pnlLoginData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 350, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       
        
        if (txtLoginUsername.getText().length() == 0 || txtLoginPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Input Username And Password ", "Login Result ", JOptionPane.INFORMATION_MESSAGE);
        } else if (LoginManagement.checkLogin(txtLoginUsername.getText(), txtLoginPassword.getText())) {

            DashBoard dashboard = new DashBoard();
            
             Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
             int x = (int) ((dimension.getWidth() -  dashboard.getWidth()) / 2);
             int y = (int) ((dimension.getHeight() -  dashboard.getHeight()) / 2);
              dashboard.setLocation(x, y);
            
            dashboard.setVisible(true);
            Login login =new Login(txtLoginUsername.getText());
            LoginManagement sendLoginHistory = new LoginManagement(login);
            sendLoginHistory.sendLoginHistory();
            this.dispose();
            

        } else {
            JOptionPane.showMessageDialog(MessageManagement.getVisibleContent(), "Login Failed \n\r Username And Password Combination not found \n\rTry again with a valid Username and  Password\n\r Or Register to System", "Login Result", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setDefaultCloseOperation(LoginDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_closeDialog

    private void lblRegisterUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterUserMouseEntered
        // TODO add your handling code here:
        lblRegisterUser.setForeground(Color.RED);
    }//GEN-LAST:event_lblRegisterUserMouseEntered

    private void lblForgotPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPassMouseEntered
        // TODO add your handling code here:
        lblForgotPass.setForeground(Color.RED);
    }//GEN-LAST:event_lblForgotPassMouseEntered

    private void lblRegisterUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterUserMouseExited
        // TODO add your handling code here:
        lblRegisterUser.setForeground(new Color(0, 0, 153));
    }//GEN-LAST:event_lblRegisterUserMouseExited

    private void lblForgotPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPassMouseExited
        // TODO add your handling code here:
        lblForgotPass.setForeground(new Color(0, 0, 153));
    }//GEN-LAST:event_lblForgotPassMouseExited

    private void lblRegisterUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterUserMouseClicked
        // TODO add your handling code here:
        UserRegisterDialog registerform = new UserRegisterDialog();
        
         
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - registerform.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - registerform.getHeight()) / 2);
        registerform.setLocation(x, y);

        registerform.setVisible(true);
        
        registerform.setVisible(true);
        registerform.setAlwaysOnTop( true );


    }//GEN-LAST:event_lblRegisterUserMouseClicked

    private void lblForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPassMouseClicked
        // TODO add your handling code here:
        PasswordRecovery passrecoverform=new  PasswordRecovery();
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - passrecoverform.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - passrecoverform.getHeight()) / 2);
        passrecoverform.setLocation(x, y);

        
        
        passrecoverform.setVisible(true);
    }//GEN-LAST:event_lblForgotPassMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            LoginDialog dialog = new LoginDialog();
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblDivide;
    private javax.swing.JLabel lblForgotPass;
    private javax.swing.JLabel lblMicroScope;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegisterUser;
    private javax.swing.JLabel lblStaySafe;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lplProfileIcon;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLoginData;
    private javax.swing.JPasswordField txtLoginPassword;
    private javax.swing.JTextField txtLoginUsername;
    // End of variables declaration//GEN-END:variables

    private final int returnStatus = EXIT_ON_CLOSE;
}
