package admin;

import db_class.connect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Allwell Festus
 */
public class viewPat extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form viewPatient
     */
    public viewPat() {
        initComponents();
        setLocationRelativeTo(null);
        con=connect.connectDB();
        Select();
    }
    
    public void Select(){
        try{
            String query="select * from patient";
            pst=con.prepareStatement(query);
            rs=pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void Search(){
        try{
            String sql="SELECT `Patient_ID`, `First_Name`, `Last_Name`, `Age`, `Gender`, `Marital_Status`, `Date`, `Address`, `City`, `Phone`, `Patient_Type`, `Ward_No.`, `Bed_No.` FROM `patient` WHERE `First_Name`='"+search.getText()+"' or Patient_ID='"+search.getText()+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setPreferredSize(new java.awt.Dimension(1370, 770));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/User Menu Male_50px.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 80));

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pictures/New Moon_100px_1.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 80));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("View Patient ");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        homeBtn.setBackground(new java.awt.Color(32, 178, 170));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home_25px.png"))); // NOI18N
        homeBtn.setToolTipText("Home");
        homeBtn.setOpaque(true);
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
        });
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 50, 40));

        logoutBtn.setBackground(new java.awt.Color(32, 178, 170));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Export_25px.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");
        logoutBtn.setOpaque(true);
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 50, 40));

        search.setBackground(new java.awt.Color(240, 240, 240));
        search.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(71, 71, 71));
        search.setBorder(null);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        crossoverPanel.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 230, 20));

        searchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_20px_2.png"))); // NOI18N
        crossoverPanel.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 30, 20));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1310, 40));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Multiply_30px.png"))); // NOI18N
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, -1, 30));

        addPat.setBackground(new java.awt.Color(255, 255, 255));
        addPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
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

        delPat.setBackground(new java.awt.Color(255, 255, 255));
        delPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
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
        viewPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        viewPat.setForeground(new java.awt.Color(255, 255, 255));
        viewPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPat.setText("View Patient");
        viewPat.setOpaque(true);
        mainLayout.add(viewPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 50));

        upPat.setBackground(new java.awt.Color(255, 255, 255));
        upPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
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
        table.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
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

        mainLayout.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1370, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void delPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delPatMouseClicked
        new deletePatient().show();
        dispose();
    }//GEN-LAST:event_delPatMouseClicked

    private void upPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upPatMouseClicked
        new updatePatient().show();
        dispose();
    }//GEN-LAST:event_upPatMouseClicked

    private void addPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPatMouseClicked
        new addPatient().show();
        dispose();
    }//GEN-LAST:event_addPatMouseClicked

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        Search();
    }//GEN-LAST:event_searchKeyTyped

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(64,169,165));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(74,179,175));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64,169,165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(74,179,175));
    }//GEN-LAST:event_homeBtnMouseExited

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
            java.util.logging.Logger.getLogger(viewPat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewPat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewPat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPat;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JLabel delPat;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JTable table;
    private javax.swing.JLabel upPat;
    private javax.swing.JLabel viewPat;
    // End of variables declaration//GEN-END:variables
}
