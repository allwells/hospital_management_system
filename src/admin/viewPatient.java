package admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Allwell Onen
 */
public class viewPatient extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public viewPatient() {
        initComponents();
        this.setLocationRelativeTo(null);
        Select();
    }

    private void minimize() {
        this.setState(JFrame.ICONIFIED);
    }

    private void Select() {
        try {
            String query = "SELECT * FROM `patient`";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void Search() {
        try {
            String sql = "SELECT `ID`, `Firstname`, `Lastname`, `DOB`, `Gender`, `Status`, `Date`, `Address`, `City`, `Phone`, `PatientType`, `Ward`, `Bed` FROM `patient` WHERE `Firstname`='" + search.getText() + "' or `ID`='" + search.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        patientDetails = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        addPat = new javax.swing.JLabel();
        delPat = new javax.swing.JLabel();
        viewPat = new javax.swing.JLabel();
        upPat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        minimize = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/User Menu Male_50px.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 60));

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 80));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("View Patient ");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

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
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 50, 40));

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
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 50, 40));

        search.setBackground(new java.awt.Color(250, 250, 250));
        search.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        search.setForeground(new java.awt.Color(71, 71, 71));
        search.setBorder(null);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        crossoverPanel.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 230, 20));

        searchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_20px_2.png"))); // NOI18N
        crossoverPanel.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 30, 20));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1030, 40));

        closeBtn.setBackground(new java.awt.Color(250, 250, 250));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 50, 50));

        addPat.setBackground(new java.awt.Color(250, 250, 250));
        addPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addPat.setForeground(new java.awt.Color(74, 179, 175));
        addPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPat.setText("Add Patient");
        addPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPat.setOpaque(true);
        addPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPatMouseClicked(evt);
            }
        });
        mainLayout.add(addPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        delPat.setBackground(new java.awt.Color(250, 250, 250));
        delPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        delPat.setForeground(new java.awt.Color(74, 179, 175));
        delPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delPat.setText("Delete Patient");
        delPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delPat.setOpaque(true);
        delPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delPatMouseClicked(evt);
            }
        });
        mainLayout.add(delPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 130, 50));

        viewPat.setBackground(new java.awt.Color(32, 178, 170));
        viewPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewPat.setForeground(new java.awt.Color(255, 255, 255));
        viewPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPat.setText("View Patient");
        viewPat.setOpaque(true);
        mainLayout.add(viewPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 50));

        upPat.setBackground(new java.awt.Color(250, 250, 250));
        upPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        upPat.setForeground(new java.awt.Color(74, 179, 175));
        upPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upPat.setText("Update Patient");
        upPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upPat.setOpaque(true);
        upPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upPatMouseClicked(evt);
            }
        });
        mainLayout.add(upPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 50));

        table.setAutoCreateRowSorter(true);
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 231, 241)));
        table.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(128, 128, 128));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "Age", "Gender", "Marital Status", "Date", "Address", "City", "Phone", "Patient Type", "Ward Number", "Bed Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(223, 231, 241));
        jScrollPane1.setViewportView(table);

        mainLayout.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1090, 520));

        minimize.setBackground(new java.awt.Color(250, 250, 250));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/minimize.png"))); // NOI18N
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
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 50, 50));

        footer.setBackground(new java.awt.Color(245, 245, 245));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(100, 100, 100));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Copyright © 2021");
        footer.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 160, 40));

        mainLayout.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1090, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        homeBtn.setBackground(new Color(74, 179, 175));
    }//GEN-LAST:event_homeBtnMouseExited

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(74, 179, 175));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        Search();
    }//GEN-LAST:event_searchKeyTyped

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void addPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPatMouseClicked
        new addPatient().show();
        dispose();
    }//GEN-LAST:event_addPatMouseClicked

    private void delPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delPatMouseClicked
        new deletePatient().show();
        dispose();
    }//GEN-LAST:event_delPatMouseClicked

    private void upPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upPatMouseClicked
        new updatePatient().show();
        dispose();
    }//GEN-LAST:event_upPatMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

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
            java.util.logging.Logger.getLogger(viewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPat;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JLabel delPat;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JTable table;
    private javax.swing.JLabel upPat;
    private javax.swing.JLabel viewPat;
    // End of variables declaration//GEN-END:variables
}
