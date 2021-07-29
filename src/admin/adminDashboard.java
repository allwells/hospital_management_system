package admin;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Allwell Onen
 */
public class adminDashboard extends javax.swing.JFrame {

    public adminDashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        profileImage = new javax.swing.JLabel();
        backgroundIcon = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        adminPortal = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        patientDetails = new javax.swing.JPanel();
        patDetails = new javax.swing.JLabel();
        app = new javax.swing.JPanel();
        appointTxt = new javax.swing.JLabel();
        Recep = new javax.swing.JPanel();
        recepTxt = new javax.swing.JLabel();
        docDetails = new javax.swing.JPanel();
        docTxt = new javax.swing.JLabel();
        new_admin = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1091, 670));
        setMinimumSize(new java.awt.Dimension(1091, 670));
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setAutoscrolls(true);
        mainLayout.setMaximumSize(new java.awt.Dimension(1091, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1091, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1091, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileImage.setBackground(new java.awt.Color(85, 125, 245));
        profileImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/admin_ico.png"))); // NOI18N
        mainLayout.add(profileImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        backgroundIcon.setBackground(new java.awt.Color(85, 125, 245));
        backgroundIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(backgroundIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPortal.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        adminPortal.setForeground(new java.awt.Color(255, 255, 255));
        adminPortal.setText("Dashboard");
        crossoverPanel.add(adminPortal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logout_ico_01.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, 40));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 510, 40));

        patientDetails.setBackground(new java.awt.Color(240, 240, 240));
        patientDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patDetailsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patDetailsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patDetailsMouseEntered(evt);
            }
        });
        patientDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patDetails.setBackground(new java.awt.Color(255, 255, 255));
        patDetails.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        patDetails.setForeground(new java.awt.Color(100, 100, 100));
        patDetails.setText("Patient Details");
        patDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patDetailsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patDetailsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patDetailsMouseEntered(evt);
            }
        });
        patientDetails.add(patDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 50));

        mainLayout.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 390, 150));

        app.setBackground(new java.awt.Color(240, 240, 240));
        app.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointTxtMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appointTxtMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appointTxtMouseEntered(evt);
            }
        });
        app.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointTxt.setBackground(new java.awt.Color(255, 255, 255));
        appointTxt.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        appointTxt.setForeground(new java.awt.Color(100, 100, 100));
        appointTxt.setText("Set Appointment");
        appointTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointTxtMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appointTxtMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appointTxtMouseEntered(evt);
            }
        });
        app.add(appointTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 50));

        mainLayout.add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 390, 150));

        Recep.setBackground(new java.awt.Color(240, 240, 240));
        Recep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Recep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecepMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RecepMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RecepMouseEntered(evt);
            }
        });
        Recep.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recepTxt.setBackground(new java.awt.Color(255, 255, 255));
        recepTxt.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        recepTxt.setForeground(new java.awt.Color(100, 100, 100));
        recepTxt.setText("Receptionist Details");
        recepTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recepTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecepMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RecepMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RecepMouseEntered(evt);
            }
        });
        Recep.add(recepTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 50));

        mainLayout.add(Recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 390, 150));

        docDetails.setBackground(new java.awt.Color(240, 240, 240));
        docDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docIconMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                docIconMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docIconMouseEntered(evt);
            }
        });
        docDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        docTxt.setBackground(new java.awt.Color(255, 255, 255));
        docTxt.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        docTxt.setForeground(new java.awt.Color(100, 100, 100));
        docTxt.setText("Doctor Details");
        docTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docIconMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                docIconMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docIconMouseEntered(evt);
            }
        });
        docDetails.add(docTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 50));

        mainLayout.add(docDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 390, 150));

        new_admin.setBackground(new java.awt.Color(250, 250, 250));
        new_admin.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        new_admin.setForeground(new java.awt.Color(0, 153, 153));
        new_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_admin.setText("Add Admin");
        new_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        new_admin.setOpaque(true);
        new_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_adminMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new_adminMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                new_adminMouseEntered(evt);
            }
        });
        mainLayout.add(new_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 100, 20));

        closeBtn.setBackground(new java.awt.Color(161, 190, 196));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        minimize.setBackground(new java.awt.Color(161, 190, 196));
        minimize.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/minimize.png"))); // NOI18N
        minimize.setToolTipText("");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        profile.setBackground(new java.awt.Color(250, 250, 250));
        profile.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        profile.setForeground(new java.awt.Color(0, 153, 153));
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setText("Profile");
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.setOpaque(true);
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
        mainLayout.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 20));

        footer.setBackground(new java.awt.Color(240, 240, 240));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 100));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright © 2021");
        footer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 160, 40));

        mainLayout.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1090, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(156, 185, 191));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(161, 190, 196));
    }//GEN-LAST:event_closeBtnMouseExited

    private void docIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docIconMouseClicked
        new addDoctor().show();
        dispose();
    }//GEN-LAST:event_docIconMouseClicked

    private void docIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docIconMouseEntered
        docTxt.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_docIconMouseEntered

    private void docIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docIconMouseExited
        docTxt.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_docIconMouseExited

    private void RecepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecepMouseClicked
        new addReceptionist().show();
        dispose();
    }//GEN-LAST:event_RecepMouseClicked

    private void RecepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecepMouseEntered
        recepTxt.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_RecepMouseEntered

    private void RecepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecepMouseExited
        recepTxt.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_RecepMouseExited

    private void appointTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointTxtMouseClicked
        new appointment().show();
        dispose();
    }//GEN-LAST:event_appointTxtMouseClicked

    private void appointTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointTxtMouseEntered
        appointTxt.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_appointTxtMouseEntered

    private void appointTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointTxtMouseExited
        appointTxt.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_appointTxtMouseExited

    private void patDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patDetailsMouseClicked
        new addPatient().show();
        dispose();
    }//GEN-LAST:event_patDetailsMouseClicked

    private void patDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patDetailsMouseEntered
        patDetails.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_patDetailsMouseEntered

    private void patDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patDetailsMouseExited
        patDetails.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_patDetailsMouseExited

    private void new_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_adminMouseClicked
        new addAdmin().show();
        dispose();
    }//GEN-LAST:event_new_adminMouseClicked

    private void new_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_adminMouseEntered
        new_admin.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_new_adminMouseEntered

    private void new_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_adminMouseExited
        new_admin.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_new_adminMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(156, 185, 191));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(161, 190, 196));
    }//GEN-LAST:event_minimizeMouseExited

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new profile().show();
        dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profile.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_profileMouseExited

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new adminDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Recep;
    private javax.swing.JLabel adminPortal;
    private javax.swing.JPanel app;
    private javax.swing.JLabel appointTxt;
    private javax.swing.JLabel backgroundIcon;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JPanel docDetails;
    private javax.swing.JLabel docTxt;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel new_admin;
    private javax.swing.JLabel patDetails;
    private javax.swing.JPanel patientDetails;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel profileImage;
    private javax.swing.JLabel recepTxt;
    // End of variables declaration//GEN-END:variables
}
