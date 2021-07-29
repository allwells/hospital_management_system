package Doctor;

import db_class.sqlite_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Onen
 */
public class login extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;

    public login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void db() {
        con = sqlite_connection.connection();
    }

    private void close() {
        System.exit(0);
    }

    private void minimize() {
        this.setState(JFrame.ICONIFIED);
    }

    private void Login() {
        try {
            String sqlite = "SELECT * FROM `doctor` "
                    + "WHERE `username`='" + email.getText() + "' "
                    + "and `password`='" + password.getText() + "'";

            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if (rs.next()) {
                new docPortal().show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password!");
                email.setText("");
                password.setText("");
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        logoTxt = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        doc_login_label = new javax.swing.JLabel();
        bckBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        loginIcon = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        passwordIcon = new javax.swing.JLabel();
        forgot = new javax.swing.JLabel();
        loginBtn = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(32, 178, 170));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoTxt.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        logoTxt.setForeground(new java.awt.Color(240, 240, 240));
        logoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoTxt.setText("Hospital Management");
        logoPanel.add(logoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logo.png"))); // NOI18N
        logoPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 50, 50));

        mainLayout.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 50));

        loginPanel.setBackground(new java.awt.Color(32, 178, 170));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doc_login_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        doc_login_label.setForeground(new java.awt.Color(240, 240, 240));
        doc_login_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc_login_label.setText("DOCTOR LOGIN PANEL");
        loginPanel.add(doc_login_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 40));

        mainLayout.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, 40));

        bckBtn.setBackground(new java.awt.Color(250, 250, 250));
        bckBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bckBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/back_ico_01.png"))); // NOI18N
        bckBtn.setOpaque(true);
        bckBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bckBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bckBtnMouseExited(evt);
            }
        });
        mainLayout.add(bckBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        closeBtn.setBackground(new java.awt.Color(250, 250, 250));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
        closeBtn.setOpaque(true);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
        });
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 30));

        loginIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/login_email_ico.png"))); // NOI18N
        loginIcon.setOpaque(true);
        mainLayout.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 30));

        email.setBackground(new java.awt.Color(240, 240, 240));
        email.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 360, 30));

        password.setBackground(new java.awt.Color(240, 240, 240));
        password.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(100, 100, 100));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 360, 30));

        passwordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/login_pwdfield_ico.png"))); // NOI18N
        passwordIcon.setOpaque(true);
        mainLayout.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 30, 30));

        forgot.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        forgot.setForeground(new java.awt.Color(32, 178, 170));
        forgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgot.setText("Forgot Password?");
        forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotMouseEntered(evt);
            }
        });
        mainLayout.add(forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, 30));

        loginBtn.setBackground(new java.awt.Color(250, 250, 250));
        loginBtn.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(100, 100, 100));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("Login");
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 179, 175)));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setOpaque(true);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnregBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
        });
        mainLayout.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 90, 30));

        minimize.setBackground(new java.awt.Color(250, 250, 250));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/minimize.png"))); // NOI18N
        minimize.setOpaque(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
        });
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bckBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckBtnMouseClicked
        new index.login().show();
        dispose();
    }//GEN-LAST:event_bckBtnMouseClicked

    private void bckBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckBtnMouseEntered
        bckBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_bckBtnMouseEntered

    private void bckBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckBtnMouseExited
        bckBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_bckBtnMouseExited

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_closeBtnMouseExited

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
        new forgotPassword().show();
        dispose();
    }//GEN-LAST:event_forgotMouseClicked

    private void forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseEntered
        forgot.setForeground(new Color(150, 150, 150));
    }//GEN-LAST:event_forgotMouseEntered

    private void forgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseExited
        forgot.setForeground(new Color(74, 179, 175));
    }//GEN-LAST:event_forgotMouseExited

    private void loginBtnregBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnregBtnMouseClicked
        Login();
    }//GEN-LAST:event_loginBtnregBtnMouseClicked

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bckBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel doc_login_label;
    protected static javax.swing.JTextField email;
    private javax.swing.JLabel forgot;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JLabel loginIcon;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoTxt;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    protected static javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordIcon;
    // End of variables declaration//GEN-END:variables
}
