package Receptionist;

import admin.adminDashboard;
import db_class.sqlite_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Onen
 */
public class login extends javax.swing.JFrame {

    private Statement stmt;
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

    //  Login
    private void Login() {
        try {
            if (email.getText().equals("") && password.getText().equals("")) {
                warning.setText("Please enter your username and password!");
                warning2.setText("");
                warning1.setText("");
                return;
            }
            if (email.getText().equals("")) {
                warning2.setText("Required!");
                warning1.setText("");
                warning.setText("");
                return;
            }
            if (password.getText().equals("")) {
                warning1.setText("Required!");
                warning2.setText("");
                warning.setText("");
                return;
            }

            db();
            String sql = "SELECT * FROM `admin` WHERE `username`='" + email.getText() + "' and `password`='" + password.getText() + "'";
            rs = con.prepareStatement(sql).executeQuery();
            if (rs.next()) {
                new adminDashboard().show();
                this.hide();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password!", "Invalid", 1);
                password.setText("");
                warning.setText("");
                warning1.setText("");
                warning2.setText("");
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(admin.login.class.getName()).log(Level.SEVERE, null, ex);
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
        adminLogin = new javax.swing.JLabel();
        bckBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        loginIcon = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        passwordIcon = new javax.swing.JLabel();
        frgtpsd = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        warning1 = new javax.swing.JLabel();
        warning2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(74, 179, 175));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoTxt.setFont(new java.awt.Font("BankGothic Lt BT", 0, 36)); // NOI18N
        logoTxt.setForeground(new java.awt.Color(240, 240, 240));
        logoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoTxt.setText("Hospital Management");
        logoPanel.add(logoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logo.png"))); // NOI18N
        logoPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 50));

        mainLayout.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 50));

        loginPanel.setBackground(new java.awt.Color(74, 179, 175));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        adminLogin.setForeground(new java.awt.Color(240, 240, 240));
        adminLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLogin.setText("ADMIN LOGIN PANEL");
        loginPanel.add(adminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 40));

        mainLayout.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, 40));

        bckBtn.setBackground(new java.awt.Color(250, 250, 250));
        bckBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bckBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/back_ico_01.png"))); // NOI18N
        bckBtn.setOpaque(true);
        bckBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bckBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bckBtnMouseEntered(evt);
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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
        });
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, 30));

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

        loginIcon.setBackground(new java.awt.Color(240, 240, 240));
        loginIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/login_email_ico.png"))); // NOI18N
        loginIcon.setOpaque(true);
        mainLayout.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 30, 30));

        email.setBackground(new java.awt.Color(240, 240, 240));
        email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 360, 30));

        password.setBackground(new java.awt.Color(240, 240, 240));
        password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(100, 100, 100));
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(74, 179, 175));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        mainLayout.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 360, 30));

        passwordIcon.setBackground(new java.awt.Color(240, 240, 240));
        passwordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/login_pwdfield_ico.png"))); // NOI18N
        passwordIcon.setOpaque(true);
        mainLayout.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 30, 30));

        frgtpsd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        frgtpsd.setForeground(new java.awt.Color(74, 179, 175));
        frgtpsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frgtpsd.setText("Forgot Password?");
        frgtpsd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frgtpsdMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                frgtpsdMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                frgtpsdMouseEntered(evt);
            }
        });
        mainLayout.add(frgtpsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 120, 30));

        warning.setBackground(new java.awt.Color(250, 250, 250));
        warning.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        warning.setForeground(new java.awt.Color(223, 77, 85));
        warning.setOpaque(true);
        mainLayout.add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 360, 20));

        warning1.setBackground(new java.awt.Color(250, 250, 250));
        warning1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        warning1.setForeground(new java.awt.Color(223, 77, 85));
        warning1.setOpaque(true);
        mainLayout.add(warning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 130, 30));

        warning2.setBackground(new java.awt.Color(250, 250, 250));
        warning2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        warning2.setForeground(new java.awt.Color(223, 77, 85));
        warning2.setOpaque(true);
        mainLayout.add(warning2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 130, 30));

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
        mainLayout.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 90, 30));

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
        new index.login().setVisible(true);
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

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_closeBtnMouseExited

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        Login();
    }//GEN-LAST:event_passwordActionPerformed

    private void frgtpsdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frgtpsdMouseClicked
        new forgotPassword().setVisible(true);
        dispose();
    }//GEN-LAST:event_frgtpsdMouseClicked

    private void frgtpsdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frgtpsdMouseEntered
        frgtpsd.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_frgtpsdMouseEntered

    private void frgtpsdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frgtpsdMouseExited
        frgtpsd.setForeground(new Color(74, 179, 175));
    }//GEN-LAST:event_frgtpsdMouseExited

    private void loginBtnregBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnregBtnMouseClicked
        Login();
    }//GEN-LAST:event_loginBtnregBtnMouseClicked

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_loginBtnMouseEntered

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLogin;
    private javax.swing.JLabel bckBtn;
    private javax.swing.JLabel closeBtn;
    protected static javax.swing.JTextField email;
    private javax.swing.JLabel frgtpsd;
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
    private javax.swing.JLabel warning;
    private javax.swing.JLabel warning1;
    private javax.swing.JLabel warning2;
    // End of variables declaration//GEN-END:variables
}
