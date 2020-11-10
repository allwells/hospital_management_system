package admin;

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
 * @author Allwell Festus
 */
public class reset extends javax.swing.JFrame {
    
    private Connection con;
    private ResultSet rs;
    
    private final String login_username = login.username.getText();
    private final String login_password = login.password.getText();

    public reset() {
        initComponents();
        this.setLocationRelativeTo(null);
        warning(false);
    }
    
    private void db() {
        con = sqlite_connection.connection();
    }
    
    private void Close() {
        System.exit(0);
    }
    
    private void warning(Boolean choice) {
        warning.setVisible(choice);
        warning.setText("Password mismatch!");
        warning1.setVisible(choice);
        warning1.setText("Password mismatch!");
    }
    
    private void reset() {
        try{
            String sqlite = "UPDATE `admin` SET `password`='"+new_password.getText()+"' "
                    + "WHERE `username`='"+login_username+"' "
                    + "and `password`='"+login_password+"'";
            
            String query = "SELECT `password` FROM `admin` "
                    + "WHERE `username`='"+login_username+"' "
                    + "and `password`='"+login_password+"'";
            
            if(new_password.getText().equals(confirm_password.getText())) {
                db();
                rs = con.prepareStatement(query).executeQuery();
                if(rs.next()) {
                    if(old_password.getText().equals(rs.getString("password"))) {
                        int check = con.prepareStatement(sqlite).executeUpdate();
                        if(check == 1) {
                            JOptionPane.showMessageDialog(null, "Reset successfully!", "Success", 1);
                            new adminDashboard().show();
                            dispose();
                        }
                        con.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect old password!", "Incorrect", 0);
                        old_password.setText("");
                        warning(false);
                    }
                }
                con.close();
            } else {
                warning(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
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
        back = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        old_password = new javax.swing.JPasswordField();
        lblCnfrmPsd = new javax.swing.JLabel();
        lblUsr = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        reset = new javax.swing.JLabel();
        confirm_password = new javax.swing.JPasswordField();
        new_password = new javax.swing.JPasswordField();
        warning = new javax.swing.JLabel();
        warning1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(74, 179, 175));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoTxt.setFont(new java.awt.Font("BankGothic Lt BT", 0, 36)); // NOI18N
        logoTxt.setForeground(new java.awt.Color(240, 240, 240));
        logoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoTxt.setText("HarryLand Hospital");
        logoPanel.add(logoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Hospital 3_35px.png"))); // NOI18N
        logoPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 50, 50));

        mainLayout.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 50));

        loginPanel.setBackground(new java.awt.Color(74, 179, 175));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        adminLogin.setForeground(new java.awt.Color(240, 240, 240));
        adminLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLogin.setText("PASSWORD RESET");
        loginPanel.add(adminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 170, 40));

        mainLayout.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, 40));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Back_25px_3.png"))); // NOI18N
        back.setOpaque(true);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        mainLayout.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Multiply_30px.png"))); // NOI18N
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        mainLayout.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        old_password.setBackground(new java.awt.Color(240, 240, 240));
        old_password.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        old_password.setForeground(new java.awt.Color(100, 100, 100));
        old_password.setToolTipText("Confrim Password");
        old_password.setBorder(null);
        old_password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(old_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 340, 30));

        lblCnfrmPsd.setBackground(new java.awt.Color(74, 179, 175));
        lblCnfrmPsd.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lblCnfrmPsd.setForeground(new java.awt.Color(255, 255, 255));
        lblCnfrmPsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCnfrmPsd.setText("Confirm Password");
        lblCnfrmPsd.setOpaque(true);
        mainLayout.add(lblCnfrmPsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 120, 30));

        lblUsr.setBackground(new java.awt.Color(74, 179, 175));
        lblUsr.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lblUsr.setForeground(new java.awt.Color(255, 255, 255));
        lblUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsr.setText("Old Password");
        lblUsr.setOpaque(true);
        mainLayout.add(lblUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, 30));

        lblEmail.setBackground(new java.awt.Color(74, 179, 175));
        lblEmail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("New Password");
        lblEmail.setOpaque(true);
        mainLayout.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 30));

        reset.setBackground(new java.awt.Color(74, 179, 175));
        reset.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        reset.setForeground(new java.awt.Color(240, 240, 240));
        reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset.setText("Reset");
        reset.setOpaque(true);
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetregBtnMouseClicked(evt);
            }
        });
        mainLayout.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 100, 30));

        confirm_password.setBackground(new java.awt.Color(240, 240, 240));
        confirm_password.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        confirm_password.setForeground(new java.awt.Color(100, 100, 100));
        confirm_password.setToolTipText("Confrim Password");
        confirm_password.setBorder(null);
        confirm_password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 340, 30));

        new_password.setBackground(new java.awt.Color(240, 240, 240));
        new_password.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        new_password.setForeground(new java.awt.Color(100, 100, 100));
        new_password.setToolTipText("Confrim Password");
        new_password.setBorder(null);
        new_password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(new_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 340, 30));

        warning.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 51, 51));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warning.setText("Password mismatch!");
        mainLayout.add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 130, 30));

        warning1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        warning1.setForeground(new java.awt.Color(255, 51, 51));
        warning1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warning1.setText("Password mismatch!");
        mainLayout.add(warning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 130, 30));

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_backMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        Close();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_closeMouseExited

    private void resetregBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetregBtnMouseClicked
        reset();
    }//GEN-LAST:event_resetregBtnMouseClicked

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
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new reset().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLogin;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JLabel lblCnfrmPsd;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblUsr;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoTxt;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JPasswordField new_password;
    private javax.swing.JPasswordField old_password;
    private javax.swing.JLabel reset;
    private javax.swing.JLabel warning;
    private javax.swing.JLabel warning1;
    // End of variables declaration//GEN-END:variables
}
