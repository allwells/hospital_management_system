package admin;

import db_class.sqlite_connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Festus
 */
public class updatePatient extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public updatePatient() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void db() {
        con = sqlite_connection.connection();
    }

    private void Search() {
        try {
            String query = "SELECT * FROM `patient` WHERE Patient_ID='" + id.getText() + "'";
            db();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            if (rs.next()) {
                id.enable(false);
                fname.setText(rs.getString("Firstname"));
                lname.setText(rs.getString("Lastname"));
                dob.setText(rs.getString("DOB"));
                gender.setSelectedItem(rs.getString("Gender"));
                status.setSelectedItem(rs.getString("Status"));
                date.setText(rs.getString("Date"));
                address.setText(rs.getString("Address"));
                city.setText(rs.getString("City"));
                phone.setText(rs.getString("Phone"));
                type.setSelectedItem(rs.getString("PatientType"));
                ward.setText(rs.getString("Ward"));
                bed.setText(rs.getString("Bed"));
            } else {
                JOptionPane.showMessageDialog(null, "Data not found!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void updatePatient() {
        try {
            String sql = "UPDATE `patient` SET `ID`='" + id.getText() + "', `Firstname`='" + fname.getText() + "',"
                    + " `Lastname`='" + lname.getText() + "',`DOB`='" + dob.getText() + "',"
                    + "`Gender`='" + (String) gender.getSelectedItem() + "',`Status`='" + (String) status.getSelectedItem() + "',"
                    + "`Date`='" + date.getText() + "',`Address`='" + address.getText() + "',`City`='" + city.getText() + "',"
                    + "`Phone`='" + phone.getText() + "',`PatientType`='" + (String) type.getSelectedItem() + "',"
                    + "`Ward`='" + ward.getText() + "',`Bed`='" + bed.getText() + "' WHERE `ID`='" + id.getText() + "'";

            db();
            JOptionPane.showMessageDialog(null, fname.getText() + " " + lname.getText() + " updated successfully!");
            id.enable(true);
            id.setText("");
            fname.setText("");
            lname.setText("");
            dob.setText("");
            gender.setSelectedItem("");
            status.setSelectedItem("");
            date.setText("");
            address.setText("");
            city.setText("");
            phone.setText("");
            type.setSelectedItem("");
            ward.setText("");
            bed.setText("");
        } catch (HeadlessException e) {
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
        closeBtn = new javax.swing.JLabel();
        addPat = new javax.swing.JLabel();
        delPat = new javax.swing.JLabel();
        viewPat = new javax.swing.JLabel();
        upPat = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        footer = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        ward = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bed = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setPreferredSize(new java.awt.Dimension(1370, 770));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/edit_user_ico_01.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 60));

        icon1.setBackground(new java.awt.Color(255, 255, 255));
        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 80));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Update Patient");
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
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 50, 40));

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
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 40));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 1020, 40));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
        closeBtn.setOpaque(true);
        closeBtn.setPreferredSize(new java.awt.Dimension(1300, 700));
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

        addPat.setBackground(new java.awt.Color(255, 255, 255));
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

        delPat.setBackground(new java.awt.Color(255, 255, 255));
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

        viewPat.setBackground(new java.awt.Color(255, 255, 255));
        viewPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewPat.setForeground(new java.awt.Color(74, 179, 175));
        viewPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPat.setText("View Patient");
        viewPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPat.setOpaque(true);
        viewPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPatMouseClicked(evt);
            }
        });
        mainLayout.add(viewPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 50));

        upPat.setBackground(new java.awt.Color(32, 178, 170));
        upPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        upPat.setForeground(new java.awt.Color(255, 255, 255));
        upPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upPat.setText("Update Patient");
        upPat.setOpaque(true);
        mainLayout.add(upPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 50));

        id.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 260, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 30, 30));

        jLabel16.setBackground(new java.awt.Color(74, 179, 175));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(74, 179, 175));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Search ID");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 179, 175)));
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        mainLayout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 90, 30));

        jSeparator2.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1090, 10));

        footer.setBackground(new java.awt.Color(245, 245, 245));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(100, 100, 100));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Copyright © 2021");
        footer.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 160, 40));

        mainLayout.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1090, 40));

        lname.setBackground(new java.awt.Color(245, 245, 245));
        lname.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        lname.setBorder(null);
        mainLayout.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 330, 30));

        jLabel1.setBackground(new java.awt.Color(32, 178, 170));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 100));
        jLabel1.setText("First Name");
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 80, 30));

        jLabel25.setBackground(new java.awt.Color(245, 245, 245));
        jLabel25.setOpaque(true);
        mainLayout.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 10, 30));

        jLabel3.setBackground(new java.awt.Color(32, 178, 170));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setText("Date of Birth (dd-mm-yyyy)");
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 200, 30));

        fname.setBackground(new java.awt.Color(245, 245, 245));
        fname.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        fname.setBorder(null);
        mainLayout.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 330, 30));

        dob.setBackground(new java.awt.Color(245, 245, 245));
        dob.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        dob.setBorder(null);
        mainLayout.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 330, 30));

        jLabel23.setBackground(new java.awt.Color(245, 245, 245));
        jLabel23.setOpaque(true);
        mainLayout.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 10, 30));

        jLabel7.setBackground(new java.awt.Color(32, 178, 170));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(100, 100, 100));
        jLabel7.setText("Address");
        mainLayout.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 60, 30));

        address.setBackground(new java.awt.Color(245, 245, 245));
        address.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        address.setBorder(null);
        mainLayout.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 330, 30));

        jLabel20.setBackground(new java.awt.Color(245, 245, 245));
        jLabel20.setOpaque(true);
        mainLayout.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 10, 30));

        jLabel19.setBackground(new java.awt.Color(245, 245, 245));
        jLabel19.setOpaque(true);
        mainLayout.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 10, 30));

        city.setBackground(new java.awt.Color(245, 245, 245));
        city.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        city.setBorder(null);
        mainLayout.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 330, 30));

        jLabel8.setBackground(new java.awt.Color(32, 178, 170));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(100, 100, 100));
        jLabel8.setText("City");
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 30, 30));

        jLabel13.setBackground(new java.awt.Color(32, 178, 170));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(100, 100, 100));
        jLabel13.setText("Patient Type");
        mainLayout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 90, 30));

        type.setBackground(new java.awt.Color(245, 245, 245));
        type.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indoor", "Outdoor" }));
        mainLayout.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 340, 30));

        jLabel14.setBackground(new java.awt.Color(32, 178, 170));
        jLabel14.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(100, 100, 100));
        jLabel14.setText("Ward No.");
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 70, 30));

        ward.setBackground(new java.awt.Color(245, 245, 245));
        ward.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        ward.setBorder(null);
        mainLayout.add(ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 150, 30));

        jLabel24.setBackground(new java.awt.Color(245, 245, 245));
        jLabel24.setOpaque(true);
        mainLayout.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 10, 30));

        jLabel21.setBackground(new java.awt.Color(245, 245, 245));
        jLabel21.setOpaque(true);
        mainLayout.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 10, 30));

        bed.setBackground(new java.awt.Color(245, 245, 245));
        bed.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        bed.setBorder(null);
        mainLayout.add(bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 150, 30));

        jLabel15.setBackground(new java.awt.Color(32, 178, 170));
        jLabel15.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(100, 100, 100));
        jLabel15.setText("Bed No.");
        mainLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 60, 30));

        phone.setBackground(new java.awt.Color(245, 245, 245));
        phone.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        phone.setBorder(null);
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 330, 30));

        jLabel18.setBackground(new java.awt.Color(245, 245, 245));
        jLabel18.setOpaque(true);
        mainLayout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 10, 30));

        jLabel10.setBackground(new java.awt.Color(32, 178, 170));
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(100, 100, 100));
        jLabel10.setText("Phone No.");
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 80, 30));

        jLabel22.setBackground(new java.awt.Color(245, 245, 245));
        jLabel22.setOpaque(true);
        mainLayout.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 10, 30));

        date.setBackground(new java.awt.Color(245, 245, 245));
        date.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        date.setBorder(null);
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 330, 30));

        jLabel6.setBackground(new java.awt.Color(32, 178, 170));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(100, 100, 100));
        jLabel6.setText("Date (dd-mm-yyyy)");
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 140, 30));

        gender.setBackground(new java.awt.Color(245, 245, 245));
        gender.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 160, 30));

        status.setBackground(new java.awt.Color(245, 245, 245));
        status.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        mainLayout.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 160, 30));

        jLabel5.setBackground(new java.awt.Color(32, 178, 170));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(100, 100, 100));
        jLabel5.setText("Marital Status");
        mainLayout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 100, 30));

        jLabel4.setBackground(new java.awt.Color(32, 178, 170));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setText("Gender");
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 60, 30));

        jLabel26.setBackground(new java.awt.Color(245, 245, 245));
        jLabel26.setOpaque(true);
        mainLayout.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 10, 30));

        jLabel2.setBackground(new java.awt.Color(32, 178, 170));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 100, 100));
        jLabel2.setText("Last Name");
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 80, 30));

        add.setBackground(new java.awt.Color(52, 198, 190));
        add.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 168, 160), 2));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
        });
        mainLayout.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 340, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void delPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delPatMouseClicked
        new deletePatient().show();
        dispose();
    }//GEN-LAST:event_delPatMouseClicked

    private void viewPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPatMouseClicked
        new viewPatient().show();
        dispose();
    }//GEN-LAST:event_viewPatMouseClicked

    private void addPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPatMouseClicked
        new addPatient().show();
        dispose();
    }//GEN-LAST:event_addPatMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Search();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(74, 179, 175));
    }//GEN-LAST:event_homeBtnMouseExited

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(74, 179, 175));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        updatePatient();
    }//GEN-LAST:event_addMouseClicked

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(new Color(52, 198, 190));
    }//GEN-LAST:event_addMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_addMouseEntered

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
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel addPat;
    private javax.swing.JTextField address;
    private javax.swing.JTextField bed;
    private javax.swing.JTextField city;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JLabel delPat;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField fname;
    private javax.swing.JPanel footer;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JLabel upPat;
    private javax.swing.JLabel viewPat;
    private javax.swing.JTextField ward;
    // End of variables declaration//GEN-END:variables
}
