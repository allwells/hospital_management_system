package Receptionist;

import java.awt.Color;

/**
 *
 * @author Allwell Onen
 */
public class RecepDashboard extends javax.swing.JFrame
{

    /**
     * Creates new form RecepDashboard
     */
    public RecepDashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        adminIcon = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        adminPortal = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        patientDetails = new javax.swing.JPanel();
        set = new javax.swing.JLabel();
        patIcon = new javax.swing.JLabel();
        patientDetails1 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        patIcon1 = new javax.swing.JLabel();
        patientDetails2 = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        patIcon2 = new javax.swing.JLabel();
        patientDetails4 = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        patIcon4 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        adminIcon1 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setPreferredSize(new java.awt.Dimension(1370, 770));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminIcon.setBackground(new java.awt.Color(85, 125, 245));
        adminIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/receptionist_ico.png"))); // NOI18N
        mainLayout.add(adminIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 60));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPortal.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        adminPortal.setForeground(new java.awt.Color(240, 240, 240));
        adminPortal.setText("Receptionist Portal");
        crossoverPanel.add(adminPortal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logout_ico_01.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 40, 40));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 540, 40));

        patientDetails.setBackground(new java.awt.Color(32, 178, 170));
        patientDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 3, new java.awt.Color(227, 210, 194)));
        patientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
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
        patientDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        set.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        set.setForeground(new java.awt.Color(255, 255, 255));
        set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        set.setText("Set Appointment");
        set.addMouseListener(new java.awt.event.MouseAdapter() {
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
        patientDetails.add(set, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 60));

        patIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/appointment_ico.png"))); // NOI18N
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
        patientDetails.add(patIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 80));

        mainLayout.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 300, 100));

        patientDetails1.setBackground(new java.awt.Color(32, 178, 170));
        patientDetails1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 3, new java.awt.Color(227, 210, 194)));
        patientDetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientDetails1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientDetails1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientDetails1MouseExited(evt);
            }
        });
        patientDetails1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("Add Patient");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientDetails1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientDetails1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientDetails1MouseExited(evt);
            }
        });
        patientDetails1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 60));

        patIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/add_user_ico.png"))); // NOI18N
        patIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientDetails1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientDetails1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientDetails1MouseExited(evt);
            }
        });
        patientDetails1.add(patIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 80));

        mainLayout.add(patientDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 300, 100));

        patientDetails2.setBackground(new java.awt.Color(32, 178, 170));
        patientDetails2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 3, new java.awt.Color(227, 210, 194)));
        patientDetails2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        patientDetails2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("Update Patient");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        patientDetails2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 60));

        patIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/edit_user_ico_01.png"))); // NOI18N
        patIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        patientDetails2.add(patIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 80));

        mainLayout.add(patientDetails2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 300, 100));

        patientDetails4.setBackground(new java.awt.Color(32, 178, 170));
        patientDetails4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 3, new java.awt.Color(227, 210, 194)));
        patientDetails4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patIcon4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patIcon4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patIcon4MouseExited(evt);
            }
        });
        patientDetails4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setFont(new java.awt.Font("Segoe UI Semilight", 2, 24)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setText("Profile");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patIcon4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patIcon4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patIcon4MouseExited(evt);
            }
        });
        patientDetails4.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 60));

        patIcon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/neutral_user_ico.png"))); // NOI18N
        patIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patIcon4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patIcon4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patIcon4MouseExited(evt);
            }
        });
        patientDetails4.add(patIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 80));

        mainLayout.add(patientDetails4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 300, 100));

        closeBtn.setBackground(new java.awt.Color(96, 83, 74));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
        closeBtn.setToolTipText("");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 40, 40));

        adminIcon1.setBackground(new java.awt.Color(85, 125, 245));
        adminIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(adminIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 80));

        backgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/recep_dashboard_bg.jpg"))); // NOI18N
        mainLayout.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(226, 226, 226));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(236, 236, 236));
    }//GEN-LAST:event_closeBtnMouseExited

    private void patientDetails1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientDetails1MouseEntered
        add.setForeground(new Color(32, 178, 170));
        patientDetails1.setBackground(new Color(230, 230, 230));
    }//GEN-LAST:event_patientDetails1MouseEntered

    private void patientDetails1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientDetails1MouseExited
        add.setForeground(new Color(255, 255, 255));
        patientDetails1.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_patientDetails1MouseExited

    private void patientDetails1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientDetails1MouseClicked
        new addPatient().show();
        dispose();
    }//GEN-LAST:event_patientDetails1MouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setForeground(new Color(32, 178, 170));
        patientDetails2.setBackground(new Color(230, 230, 230));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setForeground(new Color(255, 255, 255));
        patientDetails2.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_updateMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        new updatePatient().show();
        dispose();
    }//GEN-LAST:event_updateMouseClicked

    private void patIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIconMouseEntered
        set.setForeground(new Color(32, 178, 170));
        patientDetails.setBackground(new Color(230, 230, 230));
    }//GEN-LAST:event_patIconMouseEntered

    private void patIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIconMouseExited
        set.setForeground(new Color(255, 255, 255));
        patientDetails.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_patIconMouseExited

    private void patIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIconMouseClicked
        new appointment().show();
        dispose();
    }//GEN-LAST:event_patIconMouseClicked

    private void patIcon4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIcon4MouseEntered
        profile.setForeground(new Color(32, 178, 170));
        patientDetails4.setBackground(new Color(230, 230, 230));
    }//GEN-LAST:event_patIcon4MouseEntered

    private void patIcon4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIcon4MouseExited
        profile.setForeground(new Color(255, 255, 255));
        patientDetails4.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_patIcon4MouseExited

    private void patIcon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patIcon4MouseClicked
        new profile().show();
        dispose();
    }//GEN-LAST:event_patIcon4MouseClicked

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
            java.util.logging.Logger.getLogger(RecepDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecepDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecepDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecepDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new RecepDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel adminIcon1;
    private javax.swing.JLabel adminPortal;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel patIcon;
    private javax.swing.JLabel patIcon1;
    private javax.swing.JLabel patIcon2;
    private javax.swing.JLabel patIcon4;
    private javax.swing.JPanel patientDetails;
    private javax.swing.JPanel patientDetails1;
    private javax.swing.JPanel patientDetails2;
    private javax.swing.JPanel patientDetails4;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel set;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
