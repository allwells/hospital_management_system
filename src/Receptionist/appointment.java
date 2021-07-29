package Receptionist;

import db_class.sqlite_connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Onen
 */
public class appointment extends javax.swing.JFrame {

    private Connection con;
    private int rndm;
    private Random rand = new Random();

    public appointment() {
        initComponents();
        this.setLocationRelativeTo(null);
//        RandomNumberGen();
//        time.enable(false);
    }

    private void close() {
        System.exit(0);
    }

    private void db() {
        con = sqlite_connection.connection();
    }

    private void RandomNumberGen() {
        rndm = rand.nextInt(992467);
        time.setText("APP-" + rndm);
    }

    private void setAppointment() {
        try {
            String query = "INSERT INTO `appointment`(`Doctor`, `Visitor`, `Gender`, `Age`, `Phone`, `Ward`, `Date`, `Time`) "
                    + "VALUES ('" + doc.getText() + "', '" + name.getText() + "', '" + gender.getSelectedItem() + "', '" + age.getText()
                    + "', '" + phone.getText() + "', '" + ward.getText() + "', '" + date.getText() + "', '" + time.getText() + "')";
            db();
            int check = con.createStatement().executeUpdate(query);
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Appointment set successfully!");
                doc.setText("");
                name.setText("");
                age.setText("");
                gender.setSelectedItem(null);
                date.setText("");
                time.setText("");
                phone.setText("");
                ward.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Operation failed!", "Failed", 0);
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
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
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ward = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        time = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        doc = new javax.swing.JTextField();
        minimize = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        set_appointment = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        view_appointment = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setPreferredSize(new java.awt.Dimension(1370, 770));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/appointment_ico.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 50));

        closeBtn.setBackground(new java.awt.Color(250, 250, 250));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 40, 40));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 90));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Set Appointment");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 50));

        homeBtn.setBackground(new java.awt.Color(32, 178, 170));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/home_ico.png"))); // NOI18N
        homeBtn.setToolTipText("");
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 50, 50));

        logoutBtn.setBackground(new java.awt.Color(32, 178, 170));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logout_ico_01.png"))); // NOI18N
        logoutBtn.setToolTipText("");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 50));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 1020, 50));

        jLabel1.setBackground(new java.awt.Color(74, 179, 175));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 100));
        jLabel1.setText("Name");
        jLabel1.setToolTipText("");
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 40, 30));

        name.setBackground(new java.awt.Color(245, 245, 245));
        name.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        name.setForeground(new java.awt.Color(100, 100, 100));
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.setBorder(null);
        mainLayout.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 330, 30));

        jLabel3.setBackground(new java.awt.Color(74, 179, 175));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setText("Age");
        jLabel3.setToolTipText("");
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 30, 30));

        age.setBackground(new java.awt.Color(245, 245, 245));
        age.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        age.setForeground(new java.awt.Color(100, 100, 100));
        age.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        age.setBorder(null);
        mainLayout.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 330, 30));

        jLabel4.setBackground(new java.awt.Color(74, 179, 175));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setText("Gender");
        jLabel4.setToolTipText("");
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 50, 30));

        date.setBackground(new java.awt.Color(245, 245, 245));
        date.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        date.setForeground(new java.awt.Color(100, 100, 100));
        date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        date.setBorder(null);
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 330, 30));

        jLabel6.setBackground(new java.awt.Color(74, 179, 175));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(100, 100, 100));
        jLabel6.setText("Date");
        jLabel6.setToolTipText("");
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 40, 30));

        phone.setBackground(new java.awt.Color(245, 245, 245));
        phone.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        phone.setForeground(new java.awt.Color(100, 100, 100));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone.setBorder(null);
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 330, 30));

        jLabel10.setBackground(new java.awt.Color(74, 179, 175));
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(100, 100, 100));
        jLabel10.setText("Phone No.");
        jLabel10.setToolTipText("");
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 70, 30));

        jLabel14.setBackground(new java.awt.Color(74, 179, 175));
        jLabel14.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(100, 100, 100));
        jLabel14.setText("Ward No.");
        jLabel14.setToolTipText("");
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, 30));

        ward.setBackground(new java.awt.Color(245, 245, 245));
        ward.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        ward.setForeground(new java.awt.Color(100, 100, 100));
        ward.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ward.setBorder(null);
        mainLayout.add(ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 330, 30));

        gender.setBackground(new java.awt.Color(245, 245, 245));
        gender.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        gender.setForeground(new java.awt.Color(100, 100, 100));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Male", "Female" }));
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 340, 30));

        time.setBackground(new java.awt.Color(245, 245, 245));
        time.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        time.setForeground(new java.awt.Color(100, 100, 100));
        time.setBorder(null);
        time.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 330, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(100, 100, 100));
        jLabel11.setText("Time");
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 40, 30));

        jSeparator2.setBackground(new java.awt.Color(32, 178, 170));
        jSeparator2.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1080, 10));

        jLabel12.setBackground(new java.awt.Color(74, 179, 175));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(100, 100, 100));
        jLabel12.setText("Doctor");
        mainLayout.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 50, 30));

        doc.setBackground(new java.awt.Color(245, 245, 245));
        doc.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        doc.setForeground(new java.awt.Color(100, 100, 100));
        doc.setBorder(null);
        doc.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 740, 30));

        minimize.setBackground(new java.awt.Color(250, 250, 250));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/minimize.png"))); // NOI18N
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
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 40, 40));

        footer.setBackground(new java.awt.Color(245, 245, 245));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(100, 100, 100));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Copyright © 2021");
        footer.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 160, 40));

        mainLayout.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1090, 40));

        set_appointment.setBackground(new java.awt.Color(52, 198, 190));
        set_appointment.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        set_appointment.setForeground(new java.awt.Color(255, 255, 255));
        set_appointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        set_appointment.setText("Set Appointment");
        set_appointment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 168, 160), 2));
        set_appointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        set_appointment.setOpaque(true);
        set_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                set_appointmentMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                set_appointmentMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                set_appointmentMouseEntered(evt);
            }
        });
        mainLayout.add(set_appointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 340, 30));

        jLabel25.setBackground(new java.awt.Color(245, 245, 245));
        jLabel25.setOpaque(true);
        mainLayout.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 10, 30));

        jLabel23.setBackground(new java.awt.Color(245, 245, 245));
        jLabel23.setOpaque(true);
        mainLayout.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 10, 30));

        jLabel20.setBackground(new java.awt.Color(245, 245, 245));
        jLabel20.setOpaque(true);
        mainLayout.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 10, 30));

        jLabel19.setBackground(new java.awt.Color(245, 245, 245));
        jLabel19.setOpaque(true);
        mainLayout.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 10, 30));

        jLabel21.setBackground(new java.awt.Color(245, 245, 245));
        jLabel21.setOpaque(true);
        mainLayout.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 10, 30));

        jLabel22.setBackground(new java.awt.Color(245, 245, 245));
        jLabel22.setOpaque(true);
        mainLayout.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 10, 30));

        back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(32, 178, 170));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        mainLayout.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, 30));

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
        mainLayout.add(view_appointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 140, 30));

        jLabel24.setBackground(new java.awt.Color(245, 245, 245));
        jLabel24.setOpaque(true);
        mainLayout.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 10, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_closeBtnMouseExited

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new RecepDashboard().show();
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

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void set_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set_appointmentMouseClicked
        setAppointment();
    }//GEN-LAST:event_set_appointmentMouseClicked

    private void set_appointmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set_appointmentMouseExited
        set_appointment.setBackground(new Color(52, 198, 190));
    }//GEN-LAST:event_set_appointmentMouseExited

    private void set_appointmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set_appointmentMouseEntered
        set_appointment.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_set_appointmentMouseEntered

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        new RecepDashboard().show();
        dispose();
    }//GEN-LAST:event_backMousePressed

    private void view_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_appointmentMouseClicked
        new admin.ViewAppointment().show();
        dispose();
    }//GEN-LAST:event_view_appointmentMouseClicked

    private void view_appointmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_appointmentMouseExited
        view_appointment.setForeground(new Color(32, 178, 170));
    }//GEN-LAST:event_view_appointmentMouseExited

    private void view_appointmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_appointmentMouseEntered
        view_appointment.setForeground(new Color(230, 230, 230));
    }//GEN-LAST:event_view_appointmentMouseEntered

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
    private javax.swing.JTextField age;
    private javax.swing.JLabel back;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JTextField doc;
    private javax.swing.JPanel footer;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField name;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel set_appointment;
    private javax.swing.JTextField time;
    private javax.swing.JLabel view_appointment;
    private javax.swing.JTextField ward;
    // End of variables declaration//GEN-END:variables
}
