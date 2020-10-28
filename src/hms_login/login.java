package hms_login;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Allwell Festus
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        logoTxt = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        loginTxt = new javax.swing.JLabel();
        loginIcon = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        adminIcon = new javax.swing.JLabel();
        docIcon = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        recepIcon = new javax.swing.JLabel();
        receptionist = new javax.swing.JLabel();
        adminIcon1 = new javax.swing.JLabel();
        docIcon1 = new javax.swing.JLabel();
        recepIcon1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(32, 178, 170));
        logoPanel.setForeground(new java.awt.Color(32, 178, 170));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoTxt.setFont(new java.awt.Font("BankGothic Lt BT", 0, 36)); // NOI18N
        logoTxt.setForeground(new java.awt.Color(240, 240, 240));
        logoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoTxt.setText("HarryLand Hospital");
        logoPanel.add(logoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/logo.png"))); // NOI18N
        logoPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 50));

        mainLayout.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 50));

        login.setBackground(new java.awt.Color(32, 178, 170));
        login.setForeground(new java.awt.Color(32, 178, 170));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(240, 240, 240));
        loginTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTxt.setText("Login portal");
        login.add(loginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        loginIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/login.png"))); // NOI18N
        login.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 30, 40));

        mainLayout.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 120, 40));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/close.png"))); // NOI18N
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, -1));

        minimize.setBackground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/minimize.png"))); // NOI18N
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

        admin.setBackground(new java.awt.Color(32, 178, 170));
        admin.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        admin.setForeground(new java.awt.Color(32, 178, 170));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("Admin");
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        mainLayout.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 90, 20));

        adminIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/admin.png"))); // NOI18N
        adminIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        mainLayout.add(adminIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 110, 100));

        docIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/doctor.png"))); // NOI18N
        docIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docIconMouseClicked(evt);
            }
        });
        mainLayout.add(docIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 110, 100));

        doc.setBackground(new java.awt.Color(32, 178, 170));
        doc.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        doc.setForeground(new java.awt.Color(32, 178, 170));
        doc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc.setText("Doctor");
        doc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docIconMouseClicked(evt);
            }
        });
        mainLayout.add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 90, 20));

        recepIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recepIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/receptionist.png"))); // NOI18N
        recepIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recepIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionistMouseClicked(evt);
            }
        });
        mainLayout.add(recepIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, 100));

        receptionist.setBackground(new java.awt.Color(32, 178, 170));
        receptionist.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        receptionist.setForeground(new java.awt.Color(32, 178, 170));
        receptionist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receptionist.setText("Receptionist");
        receptionist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        receptionist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionistMouseClicked(evt);
            }
        });
        mainLayout.add(receptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 90, 20));

        adminIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/background.png"))); // NOI18N
        adminIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        mainLayout.add(adminIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 110, -1));

        docIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/background.png"))); // NOI18N
        docIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docIconMouseClicked(evt);
            }
        });
        mainLayout.add(docIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 110, 100));

        recepIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recepIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_login/icons/background.png"))); // NOI18N
        recepIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recepIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionistMouseClicked(evt);
            }
        });
        mainLayout.add(recepIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, 100));

        getContentPane().add(mainLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        new admin.login().show();
        dispose();
    }//GEN-LAST:event_adminMouseClicked

    private void docIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docIconMouseClicked
        new Doctor.login().show();
        dispose();
    }//GEN-LAST:event_docIconMouseClicked

    private void receptionistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionistMouseClicked
        new Receptionist.login().show();
        dispose();
    }//GEN-LAST:event_receptionistMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_minimizeMouseExited

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
    private javax.swing.JLabel admin;
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel adminIcon1;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel doc;
    private javax.swing.JLabel docIcon;
    private javax.swing.JLabel docIcon1;
    private javax.swing.JPanel login;
    private javax.swing.JLabel loginIcon;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoTxt;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel recepIcon;
    private javax.swing.JLabel recepIcon1;
    private javax.swing.JLabel receptionist;
    // End of variables declaration//GEN-END:variables
}
