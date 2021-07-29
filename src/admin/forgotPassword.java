package admin;

import db_class.sqlite_connection;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Onen
 */
public class forgotPassword extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
//    messageDialogBox msg = new messageDialogBox();

    public forgotPassword() {
        initComponents();
        this.setLocationRelativeTo(null);
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

    private void Search() {
        try {
            String sql = "SELECT * FROM `admin` WHERE `email`='" + email.getText() + "'";

            db();
            rs = con.prepareStatement(sql).executeQuery();
            if (rs.next()) {
//                new messageDialogBox().show();
//                dispose();
//                msg.username.setText(rs.getString("Username"));
//                msg.password.setText(rs.getString("Password"));
                JOptionPane.showMessageDialog(null, "Login details: \n\n" + "Username: " + rs.getString("Username") + "\n" + "Password:  " + rs.getString("Password"));
                new login().show();
                dispose();
                //password.setText(rs.getString("Password"));
            } else {
                JOptionPane.showMessageDialog(null, "Data not found!");
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(forgotPassword.class.getName()).log(Level.SEVERE, null, ex);
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
        loginIcon = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(74, 179, 175));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoTxt.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
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

        adminLogin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adminLogin.setForeground(new java.awt.Color(240, 240, 240));
        adminLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLogin.setText("FIND PASSWORD");
        loginPanel.add(adminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 40));

        mainLayout.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, 40));

        bckBtn.setBackground(new java.awt.Color(250, 250, 250));
        bckBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bckBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/back_ico_01.png"))); // NOI18N
        bckBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        loginIcon.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        loginIcon.setForeground(new java.awt.Color(74, 179, 175));
        loginIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginIcon.setText("Enter Email here");
        mainLayout.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 110, 30));

        email.setBackground(new java.awt.Color(240, 240, 240));
        email.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 350, 40));

        search.setBackground(new java.awt.Color(245, 245, 245));
        search.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        search.setForeground(new java.awt.Color(100, 100, 100));
        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 2));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.setOpaque(true);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
        });
        mainLayout.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 360, 40));

        minimize.setBackground(new java.awt.Color(250, 250, 250));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/minimize.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setOpaque(true);
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 10, 40));

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
        new login().show();
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

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        Search();
    }//GEN-LAST:event_searchMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        Search();
    }//GEN-LAST:event_emailActionPerformed

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_searchMouseExited

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
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new forgotPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLogin;
    private javax.swing.JLabel bckBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginIcon;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoTxt;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel search;
    // End of variables declaration//GEN-END:variables
}
