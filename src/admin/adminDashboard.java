package admin;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Allwell Onen
 */
public class adminDashboard extends javax.swing.JFrame
{

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
        Wel = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        adminPtl = new javax.swing.JLabel();
        new_admin = new javax.swing.JLabel();
        reset_password = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1270, 670));
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setAutoscrolls(true);
        mainLayout.setMaximumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileImage.setBackground(new java.awt.Color(85, 125, 245));
        profileImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/admin.png"))); // NOI18N
        mainLayout.add(profileImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        backgroundIcon.setBackground(new java.awt.Color(85, 125, 245));
        backgroundIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pictures/New Moon_100px_1.png"))); // NOI18N
        mainLayout.add(backgroundIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPortal.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        adminPortal.setForeground(new java.awt.Color(255, 255, 255));
        adminPortal.setText("Admin Portal");
        crossoverPanel.add(adminPortal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Export_25px.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, 40));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 510, 40));

        patientDetails.setBackground(new java.awt.Color(255, 255, 255));
        patientDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 2, new java.awt.Color(32, 178, 170)));
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
        patDetails.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        patDetails.setForeground(new java.awt.Color(32, 178, 170));
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
        patientDetails.add(patDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 50));

        mainLayout.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 300, 110));

        app.setBackground(new java.awt.Color(255, 255, 255));
        app.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 2, new java.awt.Color(32, 178, 170)));
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
        appointTxt.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        appointTxt.setForeground(new java.awt.Color(32, 178, 170));
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
        app.add(appointTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 50));

        mainLayout.add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 300, 110));

        Recep.setBackground(new java.awt.Color(255, 255, 255));
        Recep.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 2, new java.awt.Color(32, 178, 170)));
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
        recepTxt.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        recepTxt.setForeground(new java.awt.Color(32, 178, 170));
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
        Recep.add(recepTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 50));

        mainLayout.add(Recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 300, 110));

        docDetails.setBackground(new java.awt.Color(255, 255, 255));
        docDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 2, new java.awt.Color(32, 178, 170)));
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
        docTxt.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        docTxt.setForeground(new java.awt.Color(32, 178, 170));
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
        docDetails.add(docTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 50));

        mainLayout.add(docDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 300, 110));

        Wel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        Wel.setForeground(new java.awt.Color(255, 255, 255));
        Wel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wel.setText("Welcome");
        mainLayout.add(Wel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 40));

        to.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        to.setForeground(new java.awt.Color(255, 255, 255));
        to.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        to.setText("to");
        mainLayout.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, 30));

        adminPtl.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        adminPtl.setForeground(new java.awt.Color(255, 255, 255));
        adminPtl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminPtl.setText("Admin Portal");
        mainLayout.add(adminPtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, -1));

        new_admin.setBackground(new java.awt.Color(0, 153, 153));
        new_admin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        new_admin.setForeground(new java.awt.Color(255, 255, 255));
        new_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_admin.setText("Add new Admin");
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
        mainLayout.add(new_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 160, 40));

        reset_password.setBackground(new java.awt.Color(0, 153, 153));
        reset_password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        reset_password.setForeground(new java.awt.Color(255, 255, 255));
        reset_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset_password.setText("Reset Password");
        reset_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_password.setOpaque(true);
        reset_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset_passwordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reset_passwordMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reset_passwordMouseEntered(evt);
            }
        });
        mainLayout.add(reset_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 160, 40));

        closeBtn.setBackground(new java.awt.Color(161, 190, 196));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Multiply_30px.png"))); // NOI18N
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 40, 40));

        minimize.setBackground(new java.awt.Color(161, 190, 196));
        minimize.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/minimize.png"))); // NOI18N
        minimize.setToolTipText("");
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
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 40));

        profile.setBackground(new java.awt.Color(0, 153, 153));
        profile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
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
        mainLayout.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 160, 40));

        backgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pictures/docPortal2.jpg"))); // NOI18N
        backgroundImage.setAutoscrolls(true);
        backgroundImage.setMaximumSize(new java.awt.Dimension(1270, 670));
        backgroundImage.setMinimumSize(new java.awt.Dimension(1270, 670));
        backgroundImage.setOpaque(true);
        backgroundImage.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void docIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docIconMouseClicked
        new addDoctor().show();
        dispose();
    }//GEN-LAST:event_docIconMouseClicked

    private void docIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docIconMouseEntered
        docTxt.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_docIconMouseEntered

    private void docIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docIconMouseExited
        docTxt.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_docIconMouseExited

    private void RecepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecepMouseClicked
        new addReceptionist().show();
        dispose();
    }//GEN-LAST:event_RecepMouseClicked

    private void RecepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecepMouseEntered
        recepTxt.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_RecepMouseEntered

    private void RecepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecepMouseExited
        recepTxt.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_RecepMouseExited

    private void appointTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointTxtMouseClicked
        new appointment().show();
        dispose();
    }//GEN-LAST:event_appointTxtMouseClicked

    private void appointTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointTxtMouseEntered
        appointTxt.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_appointTxtMouseEntered

    private void appointTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointTxtMouseExited
        appointTxt.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_appointTxtMouseExited

    private void patDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patDetailsMouseClicked
        new addPatient().show();
        dispose();
    }//GEN-LAST:event_patDetailsMouseClicked

    private void patDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patDetailsMouseEntered
        patDetails.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_patDetailsMouseEntered

    private void patDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patDetailsMouseExited
        patDetails.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_patDetailsMouseExited

    private void reset_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_passwordMouseClicked
        new reset().show();
        dispose();
    }//GEN-LAST:event_reset_passwordMouseClicked

    private void reset_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_passwordMouseEntered
        reset_password.setForeground(new Color(100, 100, 100));
        reset_password.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_reset_passwordMouseEntered

    private void reset_passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_passwordMouseExited
        reset_password.setForeground(new Color(255, 255, 255));
        reset_password.setBackground(new Color(0, 153, 153));;
    }//GEN-LAST:event_reset_passwordMouseExited

    private void new_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_adminMouseClicked
        new addAdmin().show();
        dispose();
    }//GEN-LAST:event_new_adminMouseClicked

    private void new_adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_adminMouseEntered
        new_admin.setForeground(new Color(100, 100, 100));
        new_admin.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_new_adminMouseEntered

    private void new_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_adminMouseExited
        new_admin.setForeground(new Color(255, 255, 255));
        new_admin.setBackground(new Color(0, 153, 153));
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
        profile.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setForeground(new Color(255, 255, 255));
        profile.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_profileMouseExited

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
    private javax.swing.JLabel Wel;
    private javax.swing.JLabel adminPortal;
    private javax.swing.JLabel adminPtl;
    private javax.swing.JPanel app;
    private javax.swing.JLabel appointTxt;
    private javax.swing.JLabel backgroundIcon;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JPanel docDetails;
    private javax.swing.JLabel docTxt;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel new_admin;
    private javax.swing.JLabel patDetails;
    private javax.swing.JPanel patientDetails;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel profileImage;
    private javax.swing.JLabel recepTxt;
    private javax.swing.JLabel reset_password;
    private javax.swing.JLabel to;
    // End of variables declaration//GEN-END:variables
}
