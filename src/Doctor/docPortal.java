package Doctor;

import db_class.sqlite_connection;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Allwell Onen
 */
public class docPortal extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;

    private final String login_username = login.email.getText();
    private final String login_password = login.password.getText();

    public docPortal() {
        initComponents();
        setLocationRelativeTo(null);
        doc_profile_name();
        doc_profile_img();
    }

    private void db() {
        con = sqlite_connection.connection();
    }

    private void close() {
        System.exit(0);
    }

    private void doc_profile_name() {
        try {
            String sqlite = "SELECT `fname` and `lname` FROM `doctor` "
                    + "WHERE `username`='" + login_username + "' "
                    + "and `password`='" + login_password + "'";

            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if (rs.next()) {
                name.setText(rs.getString("fname") + " " + rs.getString("lname"));
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(docPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void doc_profile_img() {
        try {
            String sqlite = "SELECT `img` FROM `doctor` "
                    + "WHERE `username`='" + login_username + "' "
                    + "and `password`='" + login_password + "'";

            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if (rs.next()) {
                byte[] image = rs.getBytes("img");
                ImageIcon imge = new ImageIcon(image);
                Image im = imge.getImage();
                Image myimg = im.getScaledInstance(imgView.getWidth(), imgView.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon NewImage = new ImageIcon(myimg);
                imgView.setIcon(NewImage);
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(docPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        doc_icon = new javax.swing.JLabel();
        doc_profile_pic = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        pro = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        profile_ico = new javax.swing.JLabel();
        app = new javax.swing.JPanel();
        appoint = new javax.swing.JLabel();
        appoint_ico = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        imgView = new javax.swing.JLabel();
        bg_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1270, 670));
        setMinimumSize(new java.awt.Dimension(1270, 670));
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setMaximumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doc_icon.setBackground(new java.awt.Color(85, 125, 245));
        doc_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/doc_dash_ico.png"))); // NOI18N
        mainLayout.add(doc_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 34, 70, 70));

        doc_profile_pic.setBackground(new java.awt.Color(85, 125, 245));
        doc_profile_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc_profile_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/profile_ico_bg_blue.png"))); // NOI18N
        mainLayout.add(doc_profile_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 120));

        crossoverPanel.setBackground(new java.awt.Color(0, 146, 180));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Doctors Portal");
        crossoverPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        logoutBtn.setBackground(new java.awt.Color(1, 149, 180));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logout_ico_01.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 50, 40));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 490, 40));

        pro.setBackground(new java.awt.Color(0, 142, 178));
        pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        pro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        profile.setForeground(new java.awt.Color(176, 207, 253));
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setText("Profile");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        pro.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 60));

        profile_ico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/doc_user_ico.png"))); // NOI18N
        profile_ico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        pro.add(profile_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 80, 80));

        mainLayout.add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 270, 140));

        app.setBackground(new java.awt.Color(0, 144, 181));
        app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appoint_icoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appoint_icoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appoint_icoMouseExited(evt);
            }
        });
        app.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appoint.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        appoint.setForeground(new java.awt.Color(176, 207, 253));
        appoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appoint.setText("Appointment");
        appoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appoint_icoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appoint_icoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appoint_icoMouseExited(evt);
            }
        });
        app.add(appoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 60));

        appoint_ico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appoint_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/doc_calender_ico.png"))); // NOI18N
        appoint_ico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appoint_icoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appoint_icoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appoint_icoMouseExited(evt);
            }
        });
        app.add(appoint_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 80, 80));

        mainLayout.add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 270, 140));

        closeBtn.setBackground(new java.awt.Color(0, 144, 181));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_01.png"))); // NOI18N
        closeBtn.setToolTipText("Close");
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 40, 40));
        mainLayout.add(imgView, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 140));

        bg_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/doctor_dashboard_bg.jpg"))); // NOI18N
        bg_image.setMaximumSize(new java.awt.Dimension(1270, 670));
        bg_image.setMinimumSize(new java.awt.Dimension(1270, 670));
        bg_image.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.add(bg_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(1, 135, 170));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(0, 144, 181));
    }//GEN-LAST:event_closeBtnMouseExited

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new profile().show();
        dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        pro.setBackground(new Color(0, 105, 137));
        profile.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        pro.setBackground(new Color(0, 142, 178));
        profile.setForeground(new Color(176, 207, 253));
    }//GEN-LAST:event_profileMouseExited

    private void appoint_icoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appoint_icoMouseClicked
        new appointment().show();
        dispose();
    }//GEN-LAST:event_appoint_icoMouseClicked

    private void appoint_icoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appoint_icoMouseEntered
        app.setBackground(new Color(0, 108, 139));
        appoint.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_appoint_icoMouseEntered

    private void appoint_icoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appoint_icoMouseExited
        app.setBackground(new Color(0, 144, 181));
        appoint.setForeground(new Color(176, 207, 253));
    }//GEN-LAST:event_appoint_icoMouseExited

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
            java.util.logging.Logger.getLogger(docPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new docPortal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel app;
    private javax.swing.JLabel appoint;
    private javax.swing.JLabel appoint_ico;
    private javax.swing.JLabel bg_image;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JLabel doc_icon;
    private javax.swing.JLabel doc_profile_pic;
    private javax.swing.JLabel imgView;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel name;
    private javax.swing.JPanel pro;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel profile_ico;
    // End of variables declaration//GEN-END:variables
}
