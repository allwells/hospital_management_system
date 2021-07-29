package admin;

import db_class.sqlite_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Onen
 */
public class profile extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;

    private final String login_username = login.username.getText();
    private final String login_password = login.password.getText();

    public profile() {
        initComponents();
        this.setLocationRelativeTo(null);
        Search();
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
            String query = "SELECT * FROM `admin` WHERE `Username`='" + login_username + "' and `Password`='" + login_password + "'";

            db();
            rs = con.prepareStatement(query).executeQuery();
            if (rs.next()) {
                id.setText(rs.getString("ID"));
                name.setText(rs.getString("Name"));
                email.setText(rs.getString("Email"));
                username.setText(rs.getString("Username"));
            } else {
                JOptionPane.showMessageDialog(null, "Not found!");
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        patientDetails = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        edit_btn = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        profile_picture = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        back_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1091, 670));
        setMinimumSize(new java.awt.Dimension(1091, 670));
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setMaximumSize(new java.awt.Dimension(1091, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1091, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1091, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/neutral_user_ico.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 90));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Profile");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 50));

        homeBtn.setBackground(new java.awt.Color(32, 178, 170));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/home_ico.png"))); // NOI18N
        homeBtn.setToolTipText("Home");
        homeBtn.setOpaque(true);
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
        });
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 50));

        logoutBtn.setBackground(new java.awt.Color(32, 178, 170));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logout_ico_01.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");
        logoutBtn.setOpaque(true);
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
        });
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 50, 50));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1070, 50));

        closeBtn.setBackground(new java.awt.Color(250, 250, 250));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
        closeBtn.setOpaque(true);
        closeBtn.setPreferredSize(new java.awt.Dimension(1300, 700));
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 40, 40));

        jLabel1.setBackground(new java.awt.Color(74, 179, 175));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 179, 175));
        jLabel1.setText("Name");
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 50, 30));

        jLabel8.setBackground(new java.awt.Color(74, 179, 175));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 179, 175));
        jLabel8.setText("Email");
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 50, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, 30));

        jLabel17.setBackground(new java.awt.Color(74, 179, 175));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(74, 179, 175));
        jLabel17.setText("Username");
        mainLayout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 80, 30));

        edit_btn.setBackground(new java.awt.Color(32, 178, 170));
        edit_btn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(32, 178, 170));
        edit_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_btn.setText("Edit Profile");
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_btnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit_btnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit_btnMouseEntered(evt);
            }
        });
        mainLayout.add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 90, 20));

        icon1.setBackground(new java.awt.Color(255, 255, 255));
        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 90));

        jSeparator2.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator2.setForeground(new java.awt.Color(74, 179, 175));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1370, 10));

        profile_picture.setForeground(new java.awt.Color(100, 100, 100));
        profile_picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile_picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/default_dp.png"))); // NOI18N
        profile_picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));
        mainLayout.add(profile_picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 190));

        footer.setBackground(new java.awt.Color(240, 240, 240));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 100, 100));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Copyright © 2021");
        footer.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 160, 30));

        mainLayout.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1090, 30));

        minimize.setBackground(new java.awt.Color(250, 250, 250));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/minimize.png"))); // NOI18N
        minimize.setOpaque(true);
        minimize.setPreferredSize(new java.awt.Dimension(1300, 700));
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
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setEditable(false);
        name.setBackground(new java.awt.Color(240, 240, 240));
        name.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(100, 100, 100));
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.setBorder(null);
        name.setCaretColor(new java.awt.Color(74, 179, 175));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 640, 30));

        mainLayout.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 660, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setEditable(false);
        email.setBackground(new java.awt.Color(240, 240, 240));
        email.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 640, 30));

        mainLayout.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 660, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setEditable(false);
        username.setBackground(new java.awt.Color(240, 240, 240));
        username.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(74, 179, 175));
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 640, 30));

        mainLayout.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 660, 30));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(250, 250, 250));
        id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(100, 100, 100));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 179, 175)));
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, 30));

        back_btn.setBackground(new java.awt.Color(32, 178, 170));
        back_btn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(100, 100, 100));
        back_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back_btn.setText("Back");
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back_btnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back_btnMouseEntered(evt);
            }
        });
        mainLayout.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_homeBtnMouseExited

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_closeBtnMouseExited

    private void edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseClicked
        new editProfile().show();
        dispose();
    }//GEN-LAST:event_edit_btnMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void edit_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseEntered
        edit_btn.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_edit_btnMouseEntered

    private void edit_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseExited
        edit_btn.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_edit_btnMouseExited

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        new adminDashboard().show();
        this.dispose();
    }//GEN-LAST:event_back_btnMouseClicked

    private void back_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseExited
        back_btn.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_back_btnMouseExited

    private void back_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseEntered
        back_btn.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_back_btnMouseEntered

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new profile().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_btn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JLabel edit_btn;
    private javax.swing.JTextField email;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField name;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JLabel profile_picture;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
