package admin;

import db_class.sqlite_connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Onen
 */
public class updateDoctor extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;

    public updateDoctor() {
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

    private void Search() {
        try {
            String sqlite = "SELECT * FROM `doctor` WHERE `ID`='" + id.getText() + "'";

            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if (rs.next()) {
                id.enable(false);
                fname.setText(rs.getString("Firstname"));
                lname.setText(rs.getString("Lastname"));
                dob.setText(rs.getString("DOB"));
                gender.setSelectedItem(rs.getString("Gender"));
                status.setSelectedItem(rs.getString("Status"));
                date.setText(rs.getString("Date"));
                email.setText(rs.getString("Email"));
                phone.setText(rs.getString("Phone"));
                username.setText(rs.getString("Username"));
                department.setSelectedItem(rs.getString("Department"));
                room.setText(rs.getString("Room"));
            } else {
                JOptionPane.showMessageDialog(null, "Data not found!", "Not found", 1);
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(updateDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateDoc() {
        try {
            String sqlite = "UPDATE `doctor` SET `ID`='" + id.getText() + "',`Firstname`='" + fname.getText() + "',`Lastname`='" + lname.getText() + "',"
                    + "`DOB`='" + dob.getText() + "',`Gender`='" + gender.getSelectedItem() + "',`Status`='" + status.getSelectedItem() + "',"
                    + "`Date`='" + date.getText() + "',`Email`='" + email.getText() + "',`Phone`='" + phone.getText() + "',"
                    + "`Username`='" + username.getText() + "',`Department`='" + department.getSelectedItem() + "',"
                    + "`Room`='" + room.getText() + " WHERE `ID`='" + id.getText() + "'";

            db();
            int check = con.prepareStatement(sqlite).executeUpdate();
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Updated successfully!", "Success", 1);
                id.enable(true);
                id.setText("");
                fname.setText("");
                lname.setText("");
                dob.setText("");
                gender.setSelectedItem("");
                status.setSelectedItem("");
                email.setText("");
                phone.setText("");
                date.setText("");
                username.setText("");
                department.setSelectedItem("");
                room.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Operation failed!", "Failed", 0);
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        patientDetails = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        addPat = new javax.swing.JLabel();
        delPat = new javax.swing.JLabel();
        viewPat = new javax.swing.JLabel();
        upPat = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        search_btn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        minimize = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update_btn = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1270, 670));
        setMinimumSize(new java.awt.Dimension(1270, 670));
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setFocusable(false);
        mainLayout.setMaximumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setBackground(new java.awt.Color(255, 255, 255));
        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/edit_user_ico_01.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 60));

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 80));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Update Doctor");
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
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 40));

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
        addPat.setText("Add Doctor");
        addPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPat.setOpaque(true);
        addPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPatMouseClicked(evt);
            }
        });
        mainLayout.add(addPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        delPat.setBackground(new java.awt.Color(255, 255, 255));
        delPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        delPat.setForeground(new java.awt.Color(74, 179, 175));
        delPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delPat.setText("Delete Doctor");
        delPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delPat.setOpaque(true);
        delPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delPatMouseClicked(evt);
            }
        });
        mainLayout.add(delPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 130, 50));

        viewPat.setBackground(new java.awt.Color(255, 255, 255));
        viewPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewPat.setForeground(new java.awt.Color(74, 179, 175));
        viewPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPat.setText("View Doctor");
        viewPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPat.setOpaque(true);
        viewPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPatMouseClicked(evt);
            }
        });
        mainLayout.add(viewPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 130, 50));

        upPat.setBackground(new java.awt.Color(32, 178, 170));
        upPat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        upPat.setForeground(new java.awt.Color(255, 255, 255));
        upPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upPat.setText("Update Doctor");
        upPat.setOpaque(true);
        mainLayout.add(upPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 130, 50));

        id.setBackground(new java.awt.Color(250, 250, 250));
        id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(100, 100, 100));
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 179, 175)));
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 210, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 40, 30));

        search_btn.setBackground(new java.awt.Color(74, 179, 175));
        search_btn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        search_btn.setForeground(new java.awt.Color(74, 179, 175));
        search_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_btn.setText("Search ID");
        search_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 179, 175)));
        search_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                search_btnMousePressed(evt);
            }
        });
        mainLayout.add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 90, 30));

        jSeparator2.setBackground(new java.awt.Color(32, 178, 170));
        jSeparator2.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1090, 10));

        minimize.setBackground(new java.awt.Color(255, 255, 255));
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

        fname.setBackground(new java.awt.Color(245, 245, 245));
        fname.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        fname.setForeground(new java.awt.Color(100, 100, 100));
        fname.setBorder(null);
        mainLayout.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 330, 30));

        jLabel1.setBackground(new java.awt.Color(32, 178, 170));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 100));
        jLabel1.setText("First Name");
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 80, 30));

        jLabel25.setBackground(new java.awt.Color(245, 245, 245));
        jLabel25.setOpaque(true);
        mainLayout.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 10, 30));

        jLabel23.setBackground(new java.awt.Color(245, 245, 245));
        jLabel23.setOpaque(true);
        mainLayout.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 10, 30));

        dob.setBackground(new java.awt.Color(245, 245, 245));
        dob.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        dob.setForeground(new java.awt.Color(100, 100, 100));
        dob.setBorder(null);
        mainLayout.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 330, 30));

        jLabel3.setBackground(new java.awt.Color(32, 178, 170));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setText("Date of Birth (dd-mm-yyyy)");
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 30));

        jLabel12.setBackground(new java.awt.Color(32, 178, 170));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(100, 100, 100));
        jLabel12.setText("Address");
        mainLayout.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 60, 30));

        jLabel20.setBackground(new java.awt.Color(245, 245, 245));
        jLabel20.setOpaque(true);
        mainLayout.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 10, 30));

        address.setBackground(new java.awt.Color(245, 245, 245));
        address.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        address.setForeground(new java.awt.Color(100, 100, 100));
        address.setBorder(null);
        mainLayout.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 330, 30));

        jLabel14.setBackground(new java.awt.Color(32, 178, 170));
        jLabel14.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(100, 100, 100));
        jLabel14.setText("City");
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 30, 30));

        jLabel22.setBackground(new java.awt.Color(245, 245, 245));
        jLabel22.setOpaque(true);
        mainLayout.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 10, 30));

        city.setBackground(new java.awt.Color(245, 245, 245));
        city.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        city.setForeground(new java.awt.Color(100, 100, 100));
        city.setBorder(null);
        mainLayout.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 330, 30));

        jLabel8.setBackground(new java.awt.Color(32, 178, 170));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(100, 100, 100));
        jLabel8.setText("Email");
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 40, 30));

        jLabel28.setBackground(new java.awt.Color(245, 245, 245));
        jLabel28.setOpaque(true);
        mainLayout.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 10, 30));

        email.setBackground(new java.awt.Color(245, 245, 245));
        email.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setBorder(null);
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 330, 30));

        jLabel15.setBackground(new java.awt.Color(74, 179, 175));
        jLabel15.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(100, 100, 100));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Room No.");
        mainLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 70, 30));

        jLabel19.setBackground(new java.awt.Color(245, 245, 245));
        jLabel19.setOpaque(true);
        mainLayout.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 10, 30));

        room.setBackground(new java.awt.Color(245, 245, 245));
        room.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        room.setForeground(new java.awt.Color(100, 100, 100));
        room.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        room.setBorder(null);
        room.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 330, 30));

        jLabel18.setBackground(new java.awt.Color(245, 245, 245));
        jLabel18.setOpaque(true);
        mainLayout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 10, 30));

        username.setBackground(new java.awt.Color(245, 245, 245));
        username.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(null);
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 330, 30));

        jLabel17.setBackground(new java.awt.Color(32, 178, 170));
        jLabel17.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(100, 100, 100));
        jLabel17.setText("Username");
        mainLayout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 100, 30));

        department.setBackground(new java.awt.Color(245, 245, 245));
        department.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        department.setForeground(new java.awt.Color(100, 100, 100));
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Accident and emergency (A&E)", "Anaesthetics", "Breast Screening", "Cardiology", "Chaplaincy", "Critical Care", "Diagnostic Imaging", "Discharge Lounge", "Ear, Nose and Throat (ENT)", "Elderly Services Department", "Gastroenterology", "General Surgery", "Gynaecology", "Haematology", "Maternity Departments", "Microbiology", "Neonatal Unit", "Nephrology", "Neurology", "Nutrition and Dietetics", "Obstetrics and Gynaecology Units", "Occupational Therapy", "Oncology", "Ophthalmology", "Orthopaedics", "Pain Management Clinics", "Pharmacy", "Physiotherapy", "Radiotheraphy", "Renal Uniit", "Rheumatology", "Urology" }));
        mainLayout.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 340, 30));

        jLabel13.setBackground(new java.awt.Color(74, 179, 175));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(100, 100, 100));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Department");
        mainLayout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 80, 30));

        jLabel21.setBackground(new java.awt.Color(245, 245, 245));
        jLabel21.setOpaque(true);
        mainLayout.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 10, 30));

        phone.setBackground(new java.awt.Color(245, 245, 245));
        phone.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        phone.setForeground(new java.awt.Color(100, 100, 100));
        phone.setBorder(null);
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 330, 30));

        jLabel10.setBackground(new java.awt.Color(32, 178, 170));
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(100, 100, 100));
        jLabel10.setText("Phone No.");
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 80, 30));

        jLabel16.setBackground(new java.awt.Color(245, 245, 245));
        jLabel16.setOpaque(true);
        mainLayout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 10, 30));

        date.setBackground(new java.awt.Color(245, 245, 245));
        date.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        date.setForeground(new java.awt.Color(100, 100, 100));
        date.setBorder(null);
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 330, 30));

        jLabel6.setBackground(new java.awt.Color(32, 178, 170));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(100, 100, 100));
        jLabel6.setText("Date (dd-mm-yyyy)");
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 140, 30));

        gender.setBackground(new java.awt.Color(245, 245, 245));
        gender.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 160, 30));

        status.setBackground(new java.awt.Color(245, 245, 245));
        status.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        mainLayout.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 160, 30));

        jLabel5.setBackground(new java.awt.Color(32, 178, 170));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(100, 100, 100));
        jLabel5.setText("Marital Status");
        mainLayout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 100, 30));

        jLabel4.setBackground(new java.awt.Color(32, 178, 170));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setText("Gender");
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 60, 30));

        lname.setBackground(new java.awt.Color(245, 245, 245));
        lname.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        lname.setForeground(new java.awt.Color(100, 100, 100));
        lname.setBorder(null);
        mainLayout.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 330, 30));

        jLabel24.setBackground(new java.awt.Color(245, 245, 245));
        jLabel24.setOpaque(true);
        mainLayout.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 10, 30));

        jLabel2.setBackground(new java.awt.Color(32, 178, 170));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 100, 100));
        jLabel2.setText("Last Name");
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 80, 30));

        update_btn.setBackground(new java.awt.Color(52, 198, 190));
        update_btn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_btn.setText("Update");
        update_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 168, 160), 2));
        update_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_btn.setOpaque(true);
        update_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_btnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update_btnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update_btnMouseEntered(evt);
            }
        });
        mainLayout.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 340, 30));

        footer.setBackground(new java.awt.Color(245, 245, 245));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(100, 100, 100));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Copyright © 2021");
        footer.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 160, 40));

        mainLayout.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1090, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPatMouseClicked
        new viewDoctor().show();
        dispose();
    }//GEN-LAST:event_viewPatMouseClicked

    private void delPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delPatMouseClicked
        new deleteDoctor().show();
        dispose();
    }//GEN-LAST:event_delPatMouseClicked

    private void addPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPatMouseClicked
        new addDoctor().show();
        dispose();
    }//GEN-LAST:event_addPatMouseClicked

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_closeBtnMouseExited

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_homeBtnMouseExited

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void search_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMousePressed
        Search();
    }//GEN-LAST:event_search_btnMousePressed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        Search();
    }//GEN-LAST:event_idActionPerformed

    private void update_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_btnMouseClicked
        updateDoc();
    }//GEN-LAST:event_update_btnMouseClicked

    private void update_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_btnMouseExited
        update_btn.setBackground(new Color(52, 198, 190));
    }//GEN-LAST:event_update_btnMouseExited

    private void update_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_btnMouseEntered
        update_btn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_update_btnMouseEntered

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
            java.util.logging.Logger.getLogger(updateDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new updateDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPat;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JLabel delPat;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
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
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField room;
    private javax.swing.JLabel search_btn;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel upPat;
    private javax.swing.JLabel update_btn;
    private javax.swing.JTextField username;
    private javax.swing.JLabel viewPat;
    // End of variables declaration//GEN-END:variables
}
