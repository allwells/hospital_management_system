package Doctor;

import db_class.sqlite_connection;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Allwell Festus
 */
public class profile extends javax.swing.JFrame
{

    private static Connection con;
    private static ResultSet rs;

    private final String login_username = login.email.getText();
    private final String login_password = login.password.getText();

    public profile() {
        initComponents();
        setLocationRelativeTo(null);
        Search();
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
            String sqlite = "SELECT * FROM `doctor` WHERE `username`='" + login_username + "' and `password`='" + login_password + "'";

            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if (rs.next()) {
                id.setText(rs.getString("id"));
                fname.setText(rs.getString("fname"));
                lname.setText(rs.getString("lname"));
                age.setText(rs.getString("age"));
                gender.setText(rs.getString("gender"));
                status.setText(rs.getString("status"));
                date.setText(rs.getString("date"));
                email.setText(rs.getString("email"));
                phone.setText(rs.getString("phone"));
                username.setText(rs.getString("username"));
                blood.setText(rs.getString("blood"));
                department.setText(rs.getString("dept"));
                room.setText(rs.getString("room"));
                byte[] image = rs.getBytes("img");
                ImageIcon img;
                img = new ImageIcon(image);
                Image im = img.getImage();
                Image myimg = im.getScaledInstance(imgView.getWidth(), imgView.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon NewImage = new ImageIcon(myimg);
                imgView.setIcon(NewImage);
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        patientDetails = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        blood = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edit_profile = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        department = new javax.swing.JTextField();
        icon1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        minimize = new javax.swing.JLabel();
        imgView = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setMaximumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/neutral_user_ico.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 50));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Profile");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 50));

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
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 50, 50));

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
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 50, 50));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 1210, 50));

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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 40, 40));

        jLabel1.setBackground(new java.awt.Color(74, 179, 175));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Name:");
        jLabel1.setOpaque(true);
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, 30));

        fname.setEditable(false);
        fname.setBackground(new java.awt.Color(240, 240, 240));
        fname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        fname.setForeground(new java.awt.Color(100, 100, 100));
        fname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fname.setBorder(null);
        fname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 300, 30));

        age.setEditable(false);
        age.setBackground(new java.awt.Color(240, 240, 240));
        age.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        age.setForeground(new java.awt.Color(100, 100, 100));
        age.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        age.setBorder(null);
        age.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 300, 30));

        jLabel2.setBackground(new java.awt.Color(74, 179, 175));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name:");
        jLabel2.setOpaque(true);
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 150, 30));

        lname.setEditable(false);
        lname.setBackground(new java.awt.Color(240, 240, 240));
        lname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        lname.setForeground(new java.awt.Color(100, 100, 100));
        lname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lname.setBorder(null);
        lname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 300, 30));

        jLabel3.setBackground(new java.awt.Color(74, 179, 175));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Age:");
        jLabel3.setOpaque(true);
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 150, 30));

        jLabel5.setBackground(new java.awt.Color(74, 179, 175));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Marital Status:");
        jLabel5.setOpaque(true);
        mainLayout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 150, 30));

        jLabel6.setBackground(new java.awt.Color(74, 179, 175));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date(dd/mm/yyyy):");
        jLabel6.setOpaque(true);
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 150, 30));

        date.setEditable(false);
        date.setBackground(new java.awt.Color(240, 240, 240));
        date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        date.setForeground(new java.awt.Color(100, 100, 100));
        date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        date.setBorder(null);
        date.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 300, 30));

        jLabel4.setBackground(new java.awt.Color(74, 179, 175));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender:");
        jLabel4.setOpaque(true);
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 150, 30));

        jLabel8.setBackground(new java.awt.Color(74, 179, 175));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email:");
        jLabel8.setOpaque(true);
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 150, 30));

        email.setEditable(false);
        email.setBackground(new java.awt.Color(240, 240, 240));
        email.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 300, 30));

        jLabel10.setBackground(new java.awt.Color(74, 179, 175));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Phone No.:");
        jLabel10.setOpaque(true);
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 150, 30));

        phone.setEditable(false);
        phone.setBackground(new java.awt.Color(240, 240, 240));
        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        phone.setForeground(new java.awt.Color(100, 100, 100));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone.setBorder(null);
        phone.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 300, 30));

        jLabel14.setBackground(new java.awt.Color(74, 179, 175));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Username:");
        jLabel14.setOpaque(true);
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 150, 30));

        username.setEditable(false);
        username.setBackground(new java.awt.Color(240, 240, 240));
        username.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 300, 30));

        jLabel15.setBackground(new java.awt.Color(74, 179, 175));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Department:");
        jLabel15.setOpaque(true);
        mainLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 150, 30));

        blood.setEditable(false);
        blood.setBackground(new java.awt.Color(240, 240, 240));
        blood.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        blood.setForeground(new java.awt.Color(100, 100, 100));
        blood.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        blood.setBorder(null);
        blood.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 300, 30));

        jSeparator1.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator1.setForeground(new java.awt.Color(74, 179, 175));
        mainLayout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1270, 10));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(240, 240, 240));
        id.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(100, 100, 100));
        id.setBorder(null);
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 30, 30));

        edit_profile.setBackground(new java.awt.Color(32, 178, 170));
        edit_profile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        edit_profile.setForeground(new java.awt.Color(255, 255, 255));
        edit_profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_profile.setText("Edit Profile");
        edit_profile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 179, 175), 1, true));
        edit_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_profile.setOpaque(true);
        edit_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_profileMouseClicked(evt);
            }
        });
        mainLayout.add(edit_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 120, 30));

        room.setEditable(false);
        room.setBackground(new java.awt.Color(240, 240, 240));
        room.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        room.setForeground(new java.awt.Color(100, 100, 100));
        room.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        room.setBorder(null);
        room.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 300, 30));

        jLabel17.setBackground(new java.awt.Color(74, 179, 175));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Blood Group:");
        jLabel17.setOpaque(true);
        mainLayout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 150, 30));

        jLabel18.setBackground(new java.awt.Color(74, 179, 175));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Room No.:");
        jLabel18.setOpaque(true);
        mainLayout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 150, 30));

        status.setEditable(false);
        status.setBackground(new java.awt.Color(240, 240, 240));
        status.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        status.setForeground(new java.awt.Color(100, 100, 100));
        status.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        status.setBorder(null);
        status.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 300, 30));

        gender.setEditable(false);
        gender.setBackground(new java.awt.Color(240, 240, 240));
        gender.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        gender.setForeground(new java.awt.Color(100, 100, 100));
        gender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gender.setBorder(null);
        gender.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 300, 30));

        department.setEditable(false);
        department.setBackground(new java.awt.Color(240, 240, 240));
        department.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        department.setForeground(new java.awt.Color(100, 100, 100));
        department.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        department.setBorder(null);
        department.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 300, 30));

        icon1.setBackground(new java.awt.Color(255, 255, 255));
        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 80, 80));

        jSeparator2.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator2.setForeground(new java.awt.Color(74, 179, 175));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1270, 10));

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
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 40));

        imgView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/default_dp.png"))); // NOI18N
        imgView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        mainLayout.add(imgView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 220, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new docPortal().show();
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

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void edit_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_profileMouseClicked
        new editProfile().show();
        dispose();
    }//GEN-LAST:event_edit_profileMouseClicked

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField blood;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JTextField department;
    private javax.swing.JLabel edit_profile;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imgView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField room;
    private javax.swing.JTextField status;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
