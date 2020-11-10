package admin;

import db_class.connect;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Allwell Onen
 */
public class addPatient extends javax.swing.JFrame
{

    Connection con = null;
    PreparedStatement pst = null;
    JFileChooser choose = new JFileChooser();
    String s;
    int rndm;
    Random rand = new Random();

    /**
     * Creates new form addPatient
     */
    public addPatient() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = connect.connectDB();
        RandomNumberGen();
        id.enable(false);
    }

    private void RandomNumberGen() {
        rndm = rand.nextInt(992467);
        id.setText("PAT-" + rndm);
    }

    ////////Method To Resize The ImageIcon////////
    public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(imgView.getWidth(), imgView.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        addPat = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        delPat = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        patientDetails = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        viewPat = new javax.swing.JLabel();
        upPat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ward = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bed = new javax.swing.JTextField();
        brosweBtn = new javax.swing.JPanel();
        browse = new javax.swing.JLabel();
        imgView = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        add = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setPreferredSize(new java.awt.Dimension(1370, 770));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/add_user_ico.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 50));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/close_ico_02.png"))); // NOI18N
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 50));

        minimize.setBackground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/minimize.png"))); // NOI18N
        minimize.setOpaque(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 50, 50));

        addPat.setBackground(new java.awt.Color(32, 178, 170));
        addPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        addPat.setForeground(new java.awt.Color(255, 255, 255));
        addPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPat.setText("Add Patient");
        addPat.setOpaque(true);
        mainLayout.add(addPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/circle_bg_green.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 90));

        delPat.setBackground(new java.awt.Color(255, 255, 255));
        delPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        delPat.setForeground(new java.awt.Color(32, 178, 170));
        delPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delPat.setText("Delete Patient");
        delPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delPat.setOpaque(true);
        delPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delPatMouseClicked(evt);
            }
        });
        mainLayout.add(delPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 130, 50));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Add Patient");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        homeBtn.setBackground(new java.awt.Color(32, 178, 170));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/home_ico.png"))); // NOI18N
        homeBtn.setToolTipText("");
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
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/logout_ico_01.png"))); // NOI18N
        logoutBtn.setToolTipText("");
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

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1310, 40));

        viewPat.setBackground(new java.awt.Color(255, 255, 255));
        viewPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        viewPat.setForeground(new java.awt.Color(32, 178, 170));
        viewPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPat.setText("View Patient");
        viewPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPat.setOpaque(true);
        viewPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPatMouseClicked(evt);
            }
        });
        mainLayout.add(viewPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 140, 50));

        upPat.setBackground(new java.awt.Color(255, 255, 255));
        upPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        upPat.setForeground(new java.awt.Color(32, 178, 170));
        upPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upPat.setText("Update Patient");
        upPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upPat.setOpaque(true);
        upPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upPatMouseClicked(evt);
            }
        });
        mainLayout.add(upPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 50));

        jLabel1.setBackground(new java.awt.Color(32, 178, 170));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Name");
        jLabel1.setOpaque(true);
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, 30));

        fname.setBackground(new java.awt.Color(245, 245, 245));
        fname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        fname.setForeground(new java.awt.Color(51, 51, 51));
        fname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fname.setBorder(null);
        mainLayout.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 260, 30));

        jLabel2.setBackground(new java.awt.Color(32, 178, 170));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name");
        jLabel2.setOpaque(true);
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 100, 30));

        lname.setBackground(new java.awt.Color(245, 245, 245));
        lname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lname.setForeground(new java.awt.Color(51, 51, 51));
        lname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lname.setBorder(null);
        mainLayout.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 260, 30));

        jLabel3.setBackground(new java.awt.Color(32, 178, 170));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Age");
        jLabel3.setOpaque(true);
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 100, 30));

        age.setBackground(new java.awt.Color(245, 245, 245));
        age.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        age.setForeground(new java.awt.Color(51, 51, 51));
        age.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        age.setBorder(null);
        mainLayout.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 260, 30));

        jLabel4.setBackground(new java.awt.Color(32, 178, 170));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender");
        jLabel4.setOpaque(true);
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 100, 30));

        date.setBackground(new java.awt.Color(245, 245, 245));
        date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        date.setForeground(new java.awt.Color(51, 51, 51));
        date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        date.setBorder(null);
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 260, 30));

        jLabel5.setBackground(new java.awt.Color(32, 178, 170));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Marital Status");
        jLabel5.setOpaque(true);
        mainLayout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, 30));

        jLabel6.setBackground(new java.awt.Color(32, 178, 170));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date");
        jLabel6.setOpaque(true);
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 100, 30));

        jLabel7.setBackground(new java.awt.Color(32, 178, 170));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");
        jLabel7.setOpaque(true);
        mainLayout.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 100, 30));

        address.setBackground(new java.awt.Color(245, 245, 245));
        address.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        address.setForeground(new java.awt.Color(51, 51, 51));
        address.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        address.setBorder(null);
        mainLayout.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 680, 30));

        jLabel8.setBackground(new java.awt.Color(32, 178, 170));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("City");
        jLabel8.setOpaque(true);
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 100, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 179, 175));
        jLabel9.setText("(For Indoor Patient Only)");
        mainLayout.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 130, 30));

        phone.setBackground(new java.awt.Color(245, 245, 245));
        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        phone.setForeground(new java.awt.Color(51, 51, 51));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone.setBorder(null);
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 260, 30));

        jLabel10.setBackground(new java.awt.Color(32, 178, 170));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Phone No.");
        jLabel10.setOpaque(true);
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 100, 30));

        jLabel13.setBackground(new java.awt.Color(32, 178, 170));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Patient Type");
        jLabel13.setOpaque(true);
        mainLayout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 100, 30));

        jLabel14.setBackground(new java.awt.Color(32, 178, 170));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ward No.");
        jLabel14.setOpaque(true);
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 100, 30));

        ward.setBackground(new java.awt.Color(245, 245, 245));
        ward.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        ward.setForeground(new java.awt.Color(51, 51, 51));
        ward.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ward.setBorder(null);
        mainLayout.add(ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 260, 30));

        jLabel15.setBackground(new java.awt.Color(32, 178, 170));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Bed No.");
        jLabel15.setOpaque(true);
        mainLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 100, 30));

        bed.setBackground(new java.awt.Color(245, 245, 245));
        bed.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        bed.setForeground(new java.awt.Color(51, 51, 51));
        bed.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bed.setBorder(null);
        mainLayout.add(bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 260, 30));

        brosweBtn.setBackground(new java.awt.Color(74, 179, 175));
        brosweBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMouseClicked(evt);
            }
        });
        brosweBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        browse.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browse.setText("Browse...");
        browse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMouseClicked(evt);
            }
        });
        brosweBtn.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        mainLayout.add(brosweBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, 130, 40));

        imgView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/default_dp.png"))); // NOI18N
        imgView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        mainLayout.add(imgView, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, 310, 330));

        city.setBackground(new java.awt.Color(245, 245, 245));
        city.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        city.setForeground(new java.awt.Color(51, 51, 51));
        city.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        city.setBorder(null);
        mainLayout.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 260, 30));

        type.setBackground(new java.awt.Color(245, 245, 245));
        type.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(51, 51, 51));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indoor", "Outdoor" }));
        type.setBorder(null);
        mainLayout.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 260, 30));

        gender.setBackground(new java.awt.Color(245, 245, 245));
        gender.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(51, 51, 51));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gender.setBorder(null);
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 260, 30));

        status.setBackground(new java.awt.Color(245, 245, 245));
        status.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        status.setForeground(new java.awt.Color(51, 51, 51));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        status.setBorder(null);
        mainLayout.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 260, 30));

        id.setBackground(new java.awt.Color(245, 245, 245));
        id.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        id.setForeground(new java.awt.Color(51, 51, 51));
        id.setBorder(null);
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 30));

        jLabel11.setBackground(new java.awt.Color(32, 178, 170));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 30, 30));

        jSeparator1.setBackground(new java.awt.Color(32, 178, 170));
        jSeparator1.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 1370, 10));

        jSeparator2.setBackground(new java.awt.Color(32, 178, 170));
        jSeparator2.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1370, 10));

        add.setBackground(new java.awt.Color(32, 178, 170));
        add.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("Add");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        mainLayout.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 110, 100, 30));

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

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new login().show();
        dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminDashboard().show();
        dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void upPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upPatMouseClicked
        new updatePatient().show();
        dispose();
    }//GEN-LAST:event_upPatMouseClicked

    private void viewPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPatMouseClicked
        new viewPat().show();
        dispose();
    }//GEN-LAST:event_viewPatMouseClicked

    private void delPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delPatMouseClicked
        new deletePatient().show();
        dispose();
    }//GEN-LAST:event_delPatMouseClicked
/////////////////////Insert Image Into the Database///////////////////////
    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        try {
            String query = "INSERT INTO `patient`(`Patient_ID`, `First_Name`, `Last_Name`, `Age`, `Gender`, `Marital_Status`, `Date`, `Address`, `City`, `Phone`, `Patient_Type`, `Ward_No.`, `Bed_No.`, `Image`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            //String query="INSERT INTO `patient`(`Patient_ID`, `First_Name`, `Last_Name`, `Age`, `Gender`, `Marital_Status`, `Date`, `Address`, `City`, `Phone`, `Patient_Type`, `Ward_No.`, `Bed_No.`, `Image`) VALUES ('"+id+"', '"+fname+"', '"+lname+"', '"+age+"', '"+gender+"', '"+status+"', '"+date+"', '"+address+"', '"+city+"', '"+phone+"', '"+type+"', '"+ward+"', '"+bed+"', '"+image+"')";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "");
            pst = con.prepareStatement(query);
            InputStream is = new FileInputStream(new File(s));
            pst.setString(1, id.getText());
            pst.setString(2, fname.getText());
            pst.setString(3, lname.getText());
            pst.setString(4, age.getText());
            pst.setString(5, (String) gender.getSelectedItem());
            pst.setString(6, (String) status.getSelectedItem());
            pst.setString(7, date.getText());
            pst.setString(8, address.getText());
            pst.setString(9, city.getText());
            pst.setString(10, phone.getText());
            pst.setString(11, (String) type.getSelectedItem());
            pst.setString(12, ward.getText());
            pst.setString(13, bed.getText());
            pst.setBlob(14, is);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, fname.getText() + " " + lname.getText() + " added successfully!");
            RandomNumberGen();
            id.enable(false);
            fname.setText("");
            lname.setText("");
            age.setText("");
            gender.setSelectedItem("");
            status.setSelectedItem("");
            date.setText("");
            address.setText("");
            city.setText("");
            phone.setText("");
            type.setSelectedItem("");
            ward.setText("");
            bed.setText("");
        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(addPatient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addMouseClicked
//////////////Browse image into JLabel///////////////
    private void browseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            imgView.setIcon(ResizeImage(path));
            s = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Data!");
        }
    }//GEN-LAST:event_browseMouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64, 169, 165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(32, 178, 170));
    }//GEN-LAST:event_homeBtnMouseExited

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
        minimize.setBackground(new Color(255, 255, 255));
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addPatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel addPat;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField bed;
    private javax.swing.JPanel brosweBtn;
    private javax.swing.JLabel browse;
    private javax.swing.JTextField city;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JLabel delPat;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imgView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JLabel upPat;
    private javax.swing.JLabel viewPat;
    private javax.swing.JTextField ward;
    // End of variables declaration//GEN-END:variables
}
