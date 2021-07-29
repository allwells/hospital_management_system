package admin;

import db_class.sqlite_connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwell Festus
 */
public class updateReceptionist extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public updateReceptionist() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void db() {
        con = sqlite_connection.connection();
    }

    private void updateReceptionist() {
        try {
            String sql = "UPDATE `receptionist` SET `ID`=?, `Firstname`=?,`Lastname`=?,`Age`=?,`Gender`=?,`Status`=?,`Date`=?,`Address`=?,`Email`=?,`Phone`=?, `Username`=?  WHERE `ID`='" + id.getText() + "'";

            pst = con.prepareStatement(sql);
            pst.setString(1, id.getText());
            pst.setString(2, fname.getText());
            pst.setString(3, lname.getText());
            pst.setString(4, dob.getText());
            pst.setString(5, (String) gender.getSelectedItem());
            pst.setString(6, (String) status.getSelectedItem());
            pst.setString(7, date.getText());
            pst.setString(8, address.getText());
            pst.setString(9, email.getText());
            pst.setString(10, phone.getText());
            pst.setString(11, username.getText());
            pst.executeUpdate();

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
            email.setText("");
            phone.setText("");
            username.setText("");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void Search() {
        try {
            String query = "SELECT * FROM `receptionist` WHERE `ID`='" + id.getText() + "'";
            db();
//            con = DriverManager.getConnection("jdbc:sqlite:src/db/hospital_management_system.db");
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
                email.setText(rs.getString("Email"));
                phone.setText(rs.getString("Phone"));
                username.setText(rs.getString("Username"));
            } else {
                JOptionPane.showMessageDialog(null, "Data not found!");
            }
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
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        footer = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        add_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLayout.setBackground(new java.awt.Color(250, 250, 250));
        mainLayout.setMinimumSize(new java.awt.Dimension(1320, 700));
        mainLayout.setPreferredSize(new java.awt.Dimension(1370, 770));
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
        patientDetails.setText("Update Receptionist");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

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

        closeBtn.setBackground(new java.awt.Color(250, 250, 250));
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

        addPat.setBackground(new java.awt.Color(250, 250, 250));
        addPat.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        addPat.setForeground(new java.awt.Color(74, 179, 175));
        addPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPat.setText("Add Receptionist");
        addPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPat.setOpaque(true);
        addPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPatMouseClicked(evt);
            }
        });
        mainLayout.add(addPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        delPat.setBackground(new java.awt.Color(250, 250, 250));
        delPat.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        delPat.setForeground(new java.awt.Color(74, 179, 175));
        delPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delPat.setText("Delete Receptionist");
        delPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delPat.setOpaque(true);
        delPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delPatMouseClicked(evt);
            }
        });
        mainLayout.add(delPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 130, 50));

        viewPat.setBackground(new java.awt.Color(250, 250, 250));
        viewPat.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        viewPat.setForeground(new java.awt.Color(74, 179, 175));
        viewPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPat.setText("View Receptionist");
        viewPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPat.setOpaque(true);
        viewPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPatMouseClicked(evt);
            }
        });
        mainLayout.add(viewPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 50));

        upPat.setBackground(new java.awt.Color(32, 178, 170));
        upPat.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        upPat.setForeground(new java.awt.Color(255, 255, 255));
        upPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upPat.setText("Update Receptionist");
        upPat.setOpaque(true);
        mainLayout.add(upPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 140, 50));

        id.setBackground(new java.awt.Color(250, 250, 250));
        id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 260, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 30, 30));

        jLabel16.setBackground(new java.awt.Color(74, 179, 175));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
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
        mainLayout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 90, 30));

        jSeparator2.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1090, 10));

        jLabel1.setBackground(new java.awt.Color(32, 178, 170));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 100));
        jLabel1.setText("First Name");
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 80, 30));

        fname.setBackground(new java.awt.Color(245, 245, 245));
        fname.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        fname.setForeground(new java.awt.Color(100, 100, 100));
        fname.setBorder(null);
        mainLayout.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 330, 30));

        jLabel25.setBackground(new java.awt.Color(245, 245, 245));
        jLabel25.setOpaque(true);
        mainLayout.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 10, 30));

        jLabel23.setBackground(new java.awt.Color(245, 245, 245));
        jLabel23.setOpaque(true);
        mainLayout.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 10, 30));

        dob.setBackground(new java.awt.Color(245, 245, 245));
        dob.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        dob.setForeground(new java.awt.Color(100, 100, 100));
        dob.setBorder(null);
        mainLayout.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 330, 30));

        jLabel3.setBackground(new java.awt.Color(32, 178, 170));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setText("Date of Birth (dd-mm-yyyy)");
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 200, 30));

        jLabel7.setBackground(new java.awt.Color(32, 178, 170));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(100, 100, 100));
        jLabel7.setText("Address");
        mainLayout.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 60, 30));

        jLabel20.setBackground(new java.awt.Color(245, 245, 245));
        jLabel20.setOpaque(true);
        mainLayout.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 10, 30));

        address.setBackground(new java.awt.Color(245, 245, 245));
        address.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        address.setForeground(new java.awt.Color(100, 100, 100));
        address.setBorder(null);
        mainLayout.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 330, 30));

        jLabel13.setBackground(new java.awt.Color(32, 178, 170));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(100, 100, 100));
        jLabel13.setText("City");
        mainLayout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 30, 30));

        jLabel22.setBackground(new java.awt.Color(245, 245, 245));
        jLabel22.setOpaque(true);
        mainLayout.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 10, 30));

        city.setBackground(new java.awt.Color(245, 245, 245));
        city.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        city.setForeground(new java.awt.Color(100, 100, 100));
        city.setBorder(null);
        mainLayout.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 330, 30));

        jLabel8.setBackground(new java.awt.Color(32, 178, 170));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(100, 100, 100));
        jLabel8.setText("Email");
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 40, 30));

        jLabel19.setBackground(new java.awt.Color(245, 245, 245));
        jLabel19.setOpaque(true);
        mainLayout.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 10, 30));

        email.setBackground(new java.awt.Color(245, 245, 245));
        email.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setBorder(null);
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 330, 30));

        username.setBackground(new java.awt.Color(245, 245, 245));
        username.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(null);
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 330, 30));

        jLabel17.setBackground(new java.awt.Color(245, 245, 245));
        jLabel17.setOpaque(true);
        mainLayout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 10, 30));

        jLabel15.setBackground(new java.awt.Color(32, 178, 170));
        jLabel15.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(100, 100, 100));
        jLabel15.setText("Username");
        mainLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 100, 30));

        jLabel21.setBackground(new java.awt.Color(245, 245, 245));
        jLabel21.setOpaque(true);
        mainLayout.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 10, 30));

        phone.setBackground(new java.awt.Color(245, 245, 245));
        phone.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        phone.setForeground(new java.awt.Color(100, 100, 100));
        phone.setBorder(null);
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 330, 30));

        jLabel10.setBackground(new java.awt.Color(32, 178, 170));
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(100, 100, 100));
        jLabel10.setText("Phone No.");
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 80, 30));

        jLabel18.setBackground(new java.awt.Color(245, 245, 245));
        jLabel18.setOpaque(true);
        mainLayout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 10, 30));

        date.setBackground(new java.awt.Color(245, 245, 245));
        date.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        date.setForeground(new java.awt.Color(100, 100, 100));
        date.setBorder(null);
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 330, 30));

        jLabel6.setBackground(new java.awt.Color(32, 178, 170));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(100, 100, 100));
        jLabel6.setText("Date (dd-mm-yyyy)");
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 140, 30));

        gender.setBackground(new java.awt.Color(245, 245, 245));
        gender.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 160, 30));

        jLabel4.setBackground(new java.awt.Color(32, 178, 170));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setText("Gender");
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 60, 30));

        lname.setBackground(new java.awt.Color(245, 245, 245));
        lname.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        lname.setForeground(new java.awt.Color(100, 100, 100));
        lname.setBorder(null);
        mainLayout.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 330, 30));

        jLabel2.setBackground(new java.awt.Color(32, 178, 170));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 100, 100));
        jLabel2.setText("Last Name");
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 80, 30));

        jLabel24.setBackground(new java.awt.Color(245, 245, 245));
        jLabel24.setOpaque(true);
        mainLayout.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 10, 30));

        jLabel5.setBackground(new java.awt.Color(32, 178, 170));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(100, 100, 100));
        jLabel5.setText("Marital Status");
        mainLayout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 100, 30));

        status.setBackground(new java.awt.Color(245, 245, 245));
        status.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        mainLayout.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 160, 30));

        footer.setBackground(new java.awt.Color(245, 245, 245));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(100, 100, 100));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Copyright © 2021");
        footer.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 160, 40));

        mainLayout.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1090, 40));

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
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 50, 50));

        add_btn.setBackground(new java.awt.Color(52, 198, 190));
        add_btn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_btn.setText("Update");
        add_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 168, 160), 2));
        add_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_btn.setOpaque(true);
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_btnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_btnMouseEntered(evt);
            }
        });
        mainLayout.add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 340, 30));

        getContentPane().add(mainLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

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
        new addReceptionist().show();
        dispose();
    }//GEN-LAST:event_addPatMouseClicked

    private void delPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delPatMouseClicked
        new deleteReceptionist().show();
        dispose();
    }//GEN-LAST:event_delPatMouseClicked

    private void viewPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPatMouseClicked
        new viewReceptionist().show();
        dispose();
    }//GEN-LAST:event_viewPatMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Search();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_homeBtnMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(250, 250, 250));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        updateReceptionist();
    }//GEN-LAST:event_add_btnMouseClicked

    private void add_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseExited
        add_btn.setBackground(new Color(52, 198, 190));
    }//GEN-LAST:event_add_btnMouseExited

    private void add_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseEntered
        add_btn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_add_btnMouseEntered

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
            java.util.logging.Logger.getLogger(updateReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new updateReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPat;
    private javax.swing.JLabel add_btn;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JLabel delPat;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel upPat;
    private javax.swing.JTextField username;
    private javax.swing.JLabel viewPat;
    // End of variables declaration//GEN-END:variables
}
