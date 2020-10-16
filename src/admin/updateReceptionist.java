package admin;

import db_class.connect;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Allwell Festus
 */
public class updateReceptionist extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String s;

    /**
     * Creates new form updateReceptionist
     */
    public updateReceptionist() {
        initComponents();
        this.setLocationRelativeTo(null);
        con=connect.connectDB();
    }
    
    
    public void Search(){
        try{
            String query="SELECT * FROM `receptionist` WHERE Receptionist_ID='"+id.getText()+"'";
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            pst=con.prepareStatement(query);
            rs=pst.executeQuery();
            if(rs.next()){
                id.enable(false);
                fname.setText(rs.getString("First_Name"));
                lname.setText(rs.getString("Last_Name"));
                age.setText(rs.getString("Age"));
                gender.setSelectedItem(rs.getString("Gender"));
                status.setSelectedItem(rs.getString("Marital_Status"));
                date.setText(rs.getString("Date"));
                address.setText(rs.getString("Address"));
                email.setText(rs.getString("Email"));
                phone.setText(rs.getString("Phone"));
                username.setText(rs.getString("Username"));
                blood.setText(rs.getString("Blood_Group"));
                byte[] image=rs.getBytes("Image");
                ImageIcon img =new ImageIcon(image);
                Image im=img.getImage();
                Image myimg=im.getScaledInstance(imgView.getWidth(), imgView.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon NewImage=new ImageIcon(myimg);
                imgView.setIcon(NewImage);
            }else{
                JOptionPane.showMessageDialog(null, "Data not found!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    
    ////////Method To Resize The ImageIcon////////
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(imgView.getWidth(), imgView.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
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
        icon1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        crossoverPanel = new javax.swing.JPanel();
        patientDetails = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        addPat = new javax.swing.JLabel();
        delPat = new javax.swing.JLabel();
        viewPat = new javax.swing.JLabel();
        upPat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        imgView = new javax.swing.JLabel();
        browse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setMinimumSize(new java.awt.Dimension(1320, 700));
        mainLayout.setPreferredSize(new java.awt.Dimension(1370, 770));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setBackground(new java.awt.Color(255, 255, 255));
        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/Edit User Male_50px.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 80));

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pictures/New Moon_100px_1.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 80));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Update Receptionist");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

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
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 50, 40));

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
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 50, 40));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 1300, 40));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/Multiply_30px.png"))); // NOI18N
        closeBtn.setOpaque(true);
        closeBtn.setPreferredSize(new java.awt.Dimension(1300, 700));
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 40, 30));

        addPat.setBackground(new java.awt.Color(255, 255, 255));
        addPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
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

        delPat.setBackground(new java.awt.Color(255, 255, 255));
        delPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
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
        mainLayout.add(delPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 130, 50));

        viewPat.setBackground(new java.awt.Color(255, 255, 255));
        viewPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
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
        mainLayout.add(viewPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 130, 50));

        upPat.setBackground(new java.awt.Color(32, 178, 170));
        upPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        upPat.setForeground(new java.awt.Color(255, 255, 255));
        upPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upPat.setText("Update Receptionist");
        upPat.setOpaque(true);
        mainLayout.add(upPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 130, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 179, 175));
        jLabel1.setText("First Name");
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 30));

        fname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(51, 51, 51));
        fname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 260, 30));

        age.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(51, 51, 51));
        age.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        age.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 260, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 179, 175));
        jLabel2.setText("Last Name");
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, 30));

        lname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(51, 51, 51));
        lname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 260, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 179, 175));
        jLabel3.setText("Age");
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 179, 175));
        jLabel5.setText("Marital Status");
        mainLayout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, 30));

        status.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        status.setForeground(new java.awt.Color(51, 51, 51));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mainLayout.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 260, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 179, 175));
        jLabel6.setText("Date");
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, 30));

        date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(51, 51, 51));
        date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        date.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 260, 30));

        gender.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(51, 51, 51));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 260, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 179, 175));
        jLabel4.setText("Gender");
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, 30));

        address.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(51, 51, 51));
        address.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        address.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 790, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 179, 175));
        jLabel7.setText("Address");
        mainLayout.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 179, 175));
        jLabel8.setText("Email");
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, 30));

        email.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(51, 51, 51));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 260, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 179, 175));
        jLabel10.setText("Phone No.");
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, -1, 30));

        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(51, 51, 51));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 260, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(74, 179, 175));
        jLabel14.setText("Username");
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, -1, 30));

        username.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 260, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(74, 179, 175));
        jLabel15.setText("Blood Group");
        mainLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, 30));

        blood.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        blood.setForeground(new java.awt.Color(51, 51, 51));
        blood.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        blood.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 260, 30));

        jSeparator1.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1370, 10));

        id.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(51, 51, 51));
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 260, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 179, 175));
        jLabel11.setText("Receptionist ID");
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 30));

        jLabel12.setBackground(new java.awt.Color(32, 178, 170));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Update");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 179, 175), 1, true));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        mainLayout.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 110, 120, 30));

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
        mainLayout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 90, 30));

        jSeparator2.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1370, 10));

        imgView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/User_100px_1.png"))); // NOI18N
        imgView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
        mainLayout.add(imgView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 280, 350));

        browse.setBackground(new java.awt.Color(32, 178, 170));
        browse.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browse.setText("Browse");
        browse.setOpaque(true);
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                browseMousePressed(evt);
            }
        });
        mainLayout.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 600, 130, 40));

        getContentPane().add(mainLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminPortal().show();
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

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        try{
            String sql="UPDATE `receptionist` SET `Receptionist_ID`=?, `First_Name`=?,`Last_Name`=?,`Age`=?,`Gender`=?,`Marital_Status`=?,`Date`=?,`Address`=?,`Email`=?,`Phone`=?, `Blood_Group`=?, `Username`=?,`Image`=?  WHERE `Receptionist_ID`='"+id.getText()+"'";
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            pst=con.prepareStatement(sql);
            InputStream is=new FileInputStream(new File (s));
            pst.setString(1, id.getText());
            pst.setString(2, fname.getText());
            pst.setString(3, lname.getText());
            pst.setString(4, age.getText());
            pst.setString(5, (String) gender.getSelectedItem());
            pst.setString(6, (String) status.getSelectedItem());
            pst.setString(7, date.getText());
            pst.setString(8, address.getText());
            pst.setString(9, email.getText());
            pst.setString(10, phone.getText());
            pst.setString(11, blood.getText());
            pst.setString(12, username.getText());
            pst.setBlob(13, is);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, fname.getText()+" "+lname.getText()+" updated successfully!");
            id.enable(true); id.setText(""); fname.setText(""); lname.setText("");
            age.setText(""); gender.setSelectedItem(""); status.setSelectedItem(""); date.setText("");
            address.setText(""); email.setText(""); phone.setText(""); blood.setText(""); username.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Search();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(64,169,165));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(32,178,170));
    }//GEN-LAST:event_homeBtnMouseExited

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(64,169,165));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(32,178,170));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void browseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMousePressed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            imgView.setIcon(ResizeImage(path));
            s = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Data!");
        }
    }//GEN-LAST:event_browseMousePressed

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
            java.util.logging.Logger.getLogger(updateReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateReceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPat;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField blood;
    private javax.swing.JLabel browse;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JLabel delPat;
    private javax.swing.JTextField email;
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel upPat;
    private javax.swing.JTextField username;
    private javax.swing.JLabel viewPat;
    // End of variables declaration//GEN-END:variables
}
