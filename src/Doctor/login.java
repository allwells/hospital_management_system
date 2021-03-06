package Doctor;

import db_class.sqlite_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Onen
 */
public class login extends javax.swing.JFrame
{

    Connection con;
    ResultSet rs;

    /**
     * Creates new form Login
     */
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

    private void login() {
        try {
            String sqlite = "SELECT * FROM `doctor` "
                    + "WHERE `username`='" + username.getText() + "' "
                    + "and `password`='" + password.getText() + "'";

            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if (rs.next()) {
                new docPortal().show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect input");
                username.setText("");
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
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        passwordIcon = new javax.swing.JLabel();
        forgot = new javax.swing.JLabel();
        loginTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(32, 178, 170));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoTxt.setFont(new java.awt.Font("BankGothic Lt BT", 0, 36)); // NOI18N
        logoTxt.setForeground(new java.awt.Color(240, 240, 240));
        logoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoTxt.setText("HarryLand Hospital");
        logoPanel.add(logoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logo.png"))); // NOI18N
        logoPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 50, 50));

        mainLayout.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 50));

        loginPanel.setBackground(new java.awt.Color(32, 178, 170));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doc_login_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        doc_login_label.setForeground(new java.awt.Color(240, 240, 240));
        doc_login_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc_login_label.setText("DOCTOR LOGIN PANEL");
        loginPanel.add(doc_login_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 40));

        mainLayout.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, 40));

        bckBtn.setBackground(new java.awt.Color(255, 255, 255));
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

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
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
        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/login_txtfield_ico_01.png"))); // NOI18N
        mainLayout.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 30));

        username.setBackground(new java.awt.Color(240, 240, 240));
        username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 360, 30));

        password.setBackground(new java.awt.Color(240, 240, 240));
        password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(100, 100, 100));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 360, 30));

        passwordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/login_pwdfield_ico.png"))); // NOI18N
        mainLayout.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 30, 30));

        forgot.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
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
        mainLayout.add(forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 120, 30));

        loginTxt.setBackground(new java.awt.Color(32, 178, 170));
        loginTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(240, 240, 240));
        loginTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTxt.setText("Login");
        loginTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginTxt.setOpaque(true);
        loginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTxtMouseClicked(evt);
            }
        });
        mainLayout.add(loginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, 30));

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
        bckBtn.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_bckBtnMouseExited

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255, 255, 255));
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

    private void loginTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseClicked
        login();
    }//GEN-LAST:event_loginTxtMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bckBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel doc_login_label;
    private javax.swing.JLabel forgot;
    private javax.swing.JLabel loginIcon;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoTxt;
    private javax.swing.JPanel mainLayout;
    protected static javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordIcon;
    protected static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
