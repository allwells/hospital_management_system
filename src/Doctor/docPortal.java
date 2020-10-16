package Doctor;

import db_class.sqlite_connection;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Allwell Festus
 */
public class docPortal extends javax.swing.JFrame {
    
    Connection con;
    ResultSet rs;
    
    JFileChooser choose=new JFileChooser();
    
    private final String login_username = login.username.getText();
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
    
    private void doc_profile_name(){
        try{
            String sqlite = "SELECT `fname` and `lname` FROM `doctor` "
                    + "WHERE `username`='"+login_username+"' "
                    + "and `password`='"+login_password+"'";
            
            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if(rs.next()){
                name.setText(rs.getString("fname")+" "+rs.getString("lname"));
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(docPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void doc_profile_img(){
        try{
            String sqlite = "SELECT `img` FROM `doctor` "
                    + "WHERE `username`='"+login_username+"' "
                    + "and `password`='"+login_password+"'";
            
            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if(rs.next()){
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
        patIcon4 = new javax.swing.JLabel();
        app = new javax.swing.JPanel();
        appoint = new javax.swing.JLabel();
        patIcon = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        Wel = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        adminPtl = new javax.swing.JLabel();
        imgView = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        doc_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Businessman_80px.png"))); // NOI18N
        mainLayout.add(doc_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 34, 70, 70));

        doc_profile_pic.setBackground(new java.awt.Color(85, 125, 245));
        doc_profile_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc_profile_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doctor/doc_profile_icon_background.png"))); // NOI18N
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
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Export_25px.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 50, 40));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 600, 40));

        pro.setBackground(new java.awt.Color(0, 142, 178));
        pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
        });
        pro.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 60));

        patIcon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/User_75px.png"))); // NOI18N
        patIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
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
        pro.add(patIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 80, 80));

        mainLayout.add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 300, 140));

        app.setBackground(new java.awt.Color(0, 144, 181));
        app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patIconMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patIconMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patIconMouseEntered(evt);
            }
        });
        app.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appoint.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        appoint.setForeground(new java.awt.Color(176, 207, 253));
        appoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appoint.setText("Appointment");
        appoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patIconMouseExited(evt);
            }
        });
        app.add(appoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 60));

        patIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Tear Off Calendar_75px.png"))); // NOI18N
        patIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patIconMouseExited(evt);
            }
        });
        app.add(patIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 80, 80));

        mainLayout.add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 300, 140));

        closeBtn.setBackground(new java.awt.Color(0, 144, 181));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Delete_30px.png"))); // NOI18N
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 50, 40));

        Wel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        Wel.setForeground(new java.awt.Color(255, 255, 255));
        Wel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wel.setText("Welcome");
        mainLayout.add(Wel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 40));

        to.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        to.setForeground(new java.awt.Color(255, 255, 255));
        to.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        to.setText("to");
        mainLayout.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 30, 40));

        adminPtl.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        adminPtl.setForeground(new java.awt.Color(255, 255, 255));
        adminPtl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminPtl.setText("Doctors Portal");
        mainLayout.add(adminPtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, -1));
        mainLayout.add(imgView, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, 130));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doctor/doc_background.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1270, 670));
        jLabel1.setMinimumSize(new java.awt.Dimension(1270, 670));
        jLabel1.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 670));

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
        closeBtn.setBackground(new Color(1,135,170));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(0,144,181));
    }//GEN-LAST:event_closeBtnMouseExited

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new profile().show();
        dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        pro.setBackground(new Color(0, 105, 137));
        profile.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        pro.setBackground(new Color(0,142,178));
        profile.setForeground(new Color(176,207,253));
    }//GEN-LAST:event_profileMouseExited

    private void patIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIconMouseClicked
        new appointment().show();
        dispose();
    }//GEN-LAST:event_patIconMouseClicked

    private void patIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIconMouseEntered
        app.setBackground(new Color(0, 108, 139));
        appoint.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_patIconMouseEntered

    private void patIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIconMouseExited
        app.setBackground(new Color(0,144,181));
        appoint.setForeground(new Color(176,207,253));
    }//GEN-LAST:event_patIconMouseExited

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
    private javax.swing.JLabel Wel;
    private javax.swing.JLabel adminPtl;
    private javax.swing.JPanel app;
    private javax.swing.JLabel appoint;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JLabel doc_icon;
    private javax.swing.JLabel doc_profile_pic;
    private javax.swing.JLabel imgView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel name;
    private javax.swing.JLabel patIcon;
    private javax.swing.JLabel patIcon4;
    private javax.swing.JPanel pro;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel to;
    // End of variables declaration//GEN-END:variables
}
