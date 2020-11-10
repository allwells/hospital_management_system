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
 * @author Allwell Festus
 */
public class appointment extends javax.swing.JFrame {
    
    private Connection con;

    public appointment() {
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
    
    private void fix_appointment() {
        try{

            String sqlite = "INSERT INTO `appointment`(`name_of_doc`, `name_of_visitor`, `gender`,"
                    + " `phone`, `ward`, `date`, `time`, `purpose`) "
                    + "VALUES ('"+doctor.getText()+"', '"+visitor.getText()+"', '"+gender.getSelectedItem()+"',"
                    + " '"+purpose.getText()+"', '"+phone.getText()+"', '"+ward.getText()+"',"
                    + " '"+date.getText()+"', '"+time.getText()+"')";
            
            db();
            int check = con.prepareStatement(sqlite).executeUpdate();
            if(check == 1) {
                JOptionPane.showMessageDialog(null, "Appointment set successfully!");
                doctor.setText(""); visitor.setText(""); purpose.setText("");
                gender.setSelectedItem(""); date.setText(""); time.setText("");
                phone.setText(""); ward.setText("");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        patientDetails = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        visitor = new javax.swing.JTextField();
        purpose_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ward = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        doctor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        view_appointment = new javax.swing.JLabel();
        set_appointment = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        minimize = new javax.swing.JLabel();
        purpose = new javax.swing.JTextField();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setMaximumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/Calendar_50px_2.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 70));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Multiply_30px.png"))); // NOI18N
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

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pictures/New Moon_100px_1.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 90));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Fix Appointment");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 50));

        homeBtn.setBackground(new java.awt.Color(32, 178, 170));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home_25px.png"))); // NOI18N
        homeBtn.setToolTipText("");
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
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 50, 50));

        logoutBtn.setBackground(new java.awt.Color(32, 178, 170));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Export_25px.png"))); // NOI18N
        logoutBtn.setToolTipText("");
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
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 50, 50));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 1210, 50));

        jLabel1.setBackground(new java.awt.Color(74, 179, 175));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visitor:");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 150, 30));

        visitor.setBackground(new java.awt.Color(235, 235, 235));
        visitor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        visitor.setForeground(new java.awt.Color(100, 100, 100));
        visitor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        visitor.setBorder(null);
        mainLayout.add(visitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 260, 30));

        purpose_label.setBackground(new java.awt.Color(74, 179, 175));
        purpose_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        purpose_label.setForeground(new java.awt.Color(255, 255, 255));
        purpose_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purpose_label.setText("Purpose:");
        purpose_label.setToolTipText("");
        purpose_label.setOpaque(true);
        mainLayout.add(purpose_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 150, 30));

        jLabel4.setBackground(new java.awt.Color(74, 179, 175));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender:");
        jLabel4.setToolTipText("");
        jLabel4.setOpaque(true);
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 150, 30));

        date.setBackground(new java.awt.Color(235, 235, 235));
        date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        date.setForeground(new java.awt.Color(100, 100, 100));
        date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        date.setBorder(null);
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 260, 30));

        jLabel6.setBackground(new java.awt.Color(74, 179, 175));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date(dd/mm/yyyy):");
        jLabel6.setToolTipText("");
        jLabel6.setOpaque(true);
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 150, 30));

        phone.setBackground(new java.awt.Color(235, 235, 235));
        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        phone.setForeground(new java.awt.Color(100, 100, 100));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone.setBorder(null);
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 260, 30));

        jLabel10.setBackground(new java.awt.Color(74, 179, 175));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Phone No.:");
        jLabel10.setToolTipText("");
        jLabel10.setOpaque(true);
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 150, 30));

        jLabel14.setBackground(new java.awt.Color(74, 179, 175));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ward/Room No.:");
        jLabel14.setToolTipText("");
        jLabel14.setOpaque(true);
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 150, 30));

        ward.setBackground(new java.awt.Color(235, 235, 235));
        ward.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        ward.setForeground(new java.awt.Color(100, 100, 100));
        ward.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ward.setBorder(null);
        mainLayout.add(ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 260, 30));

        gender.setBackground(new java.awt.Color(235, 235, 235));
        gender.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(100, 100, 100));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Male", "Female" }));
        gender.setBorder(null);
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 260, 30));

        doctor.setBackground(new java.awt.Color(235, 235, 235));
        doctor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        doctor.setForeground(new java.awt.Color(100, 100, 100));
        doctor.setBorder(null);
        doctor.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 700, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Doctor:");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 30));

        jSeparator1.setBackground(new java.awt.Color(32, 178, 170));
        jSeparator1.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1270, 10));

        jSeparator2.setBackground(new java.awt.Color(32, 178, 170));
        jSeparator2.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1270, 10));

        view_appointment.setBackground(new java.awt.Color(32, 178, 170));
        view_appointment.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        view_appointment.setForeground(new java.awt.Color(32, 178, 170));
        view_appointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view_appointment.setText("View Appointment");
        view_appointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_appointmentMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                view_appointmentMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                view_appointmentMouseEntered(evt);
            }
        });
        mainLayout.add(view_appointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, 170, 40));

        set_appointment.setBackground(new java.awt.Color(32, 178, 170));
        set_appointment.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        set_appointment.setForeground(new java.awt.Color(255, 255, 255));
        set_appointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        set_appointment.setText("Set Appointment");
        set_appointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        set_appointment.setOpaque(true);
        set_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                set_appointmentMouseClicked(evt);
            }
        });
        mainLayout.add(set_appointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 150, 30));

        jLabel12.setBackground(new java.awt.Color(74, 179, 175));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Time:");
        jLabel12.setOpaque(true);
        mainLayout.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 150, 30));

        time.setBackground(new java.awt.Color(235, 235, 235));
        time.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        time.setForeground(new java.awt.Color(100, 100, 100));
        time.setBorder(null);
        time.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 260, 30));

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
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 40));

        purpose.setBackground(new java.awt.Color(235, 235, 235));
        purpose.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        purpose.setForeground(new java.awt.Color(100, 100, 100));
        purpose.setBorder(null);
        purpose.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(purpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 700, 30));

        back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(32, 178, 170));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        mainLayout.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64,169,165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(32,178,170));
    }//GEN-LAST:event_homeBtnMouseExited

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(64,169,165));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(32,178,170));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void set_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set_appointmentMouseClicked
        fix_appointment();
    }//GEN-LAST:event_set_appointmentMouseClicked

    private void view_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_appointmentMouseClicked
        new ViewAppointment().show();
        dispose();
    }//GEN-LAST:event_view_appointmentMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void view_appointmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_appointmentMouseEntered
        view_appointment.setForeground(new Color(230,230,230));
    }//GEN-LAST:event_view_appointmentMouseEntered

    private void view_appointmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_appointmentMouseExited
        view_appointment.setForeground(new Color(32,178,170));
    }//GEN-LAST:event_view_appointmentMouseExited

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_backMousePressed

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
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new appointment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JTextField doctor;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField purpose;
    private javax.swing.JLabel purpose_label;
    private javax.swing.JLabel set_appointment;
    private javax.swing.JTextField time;
    private javax.swing.JLabel view_appointment;
    private javax.swing.JTextField visitor;
    private javax.swing.JTextField ward;
    // End of variables declaration//GEN-END:variables
}
