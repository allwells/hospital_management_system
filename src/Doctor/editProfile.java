package Doctor;

import db_class.sqlite_connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Allwell Festus
 */
public class editProfile extends javax.swing.JFrame {
    
    Connection con;
    ResultSet rs;
    
    private final String login_username = login.username.getText();
    private final String login_password = login.password.getText();
    private String s = null;

    public editProfile() {
        initComponents();
        this.setLocationRelativeTo(null);
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
    
    ////////Method To Resize The ImageIcon////////
    private ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(imgView.getWidth(), imgView.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
    private void Browse() {
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
    }
    
    private void Search(){
        try{
            String sqlite = "SELECT * FROM `doctor` "
                    + "WHERE `username`='"+login_username+"' "
                    + "and `password`='"+login_password+"'";
            
            db();
            rs = con.prepareStatement(sqlite).executeQuery();
            if(rs.next()){
                id.setText(rs.getString("id"));
                fname.setText(rs.getString("fname"));
                lname.setText(rs.getString("lname"));
                age.setText(rs.getString("age"));
                gender.setSelectedItem(rs.getString("gender"));
                status.setSelectedItem(rs.getString("status"));
                date.setText(rs.getString("date"));
                email.setText(rs.getString("email"));
                phone.setText(rs.getString("phone"));
                username.setText(rs.getString("username"));
                blood.setText(rs.getString("blood"));
                department.setSelectedItem(rs.getString("dept"));
                ward.setText(rs.getString("room"));
                password.setText(rs.getString("password"));
                byte[] image=rs.getBytes("img");
                ImageIcon img =new ImageIcon(image);
                Image im=img.getImage();
                Image myimg=im.getScaledInstance(imgView.getWidth(), imgView.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon NewImage=new ImageIcon(myimg);
                imgView.setIcon(NewImage);
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(editProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Save() {
        try{
            InputStream is = new FileInputStream(new File(s));
            String sqlite = "UPDATE `doctor` SET `id`='"+id.getText()+"',`fname`='"+fname.getText()+
                    "',`lname`='"+lname.getText()+"',`age`='"+age.getText()+"',`gender`='"+gender.getSelectedItem()+
                    "',`status`='"+status.getSelectedItem()+"',`date`='"+date.getText()+"',`email`='"+email.getText()+
                    "',`phone`='"+phone.getText()+"',`blood`='"+blood.getText()+"',`username`='"+username.getText()+
                    "',`password`='"+password.getText()+"',`dept`='"+department.getSelectedItem()+
                    "',`room`='"+ward.getText()+"', `img`='"+is+"' WHERE `username`='"+login_username+"' and `password`='"+login_password+"'";
            
            db();
            int check = con.prepareStatement(sqlite).executeUpdate();
            if(check == 1) {
                JOptionPane.showMessageDialog(null, "Saved Successfullly!", "Success", 1);
                new profile().show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Operation failed!", "Failed", 0);
            }
            rs.close();
            con.close();
        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(editProfile.class.getName()).log(Level.SEVERE, null, ex);
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
        status = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
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
        browse = new javax.swing.JLabel();
        ward = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        password = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        imgView = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        save = new javax.swing.JLabel();

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
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/Edit User Male_50px.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 90));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Edit Profile");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 50));

        homeBtn.setBackground(new java.awt.Color(32, 178, 170));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home_25px.png"))); // NOI18N
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
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Export_25px.png"))); // NOI18N
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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 40, 40));

        jLabel1.setBackground(new java.awt.Color(74, 179, 175));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Name:");
        jLabel1.setOpaque(true);
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, 30));

        fname.setBackground(java.awt.Color.white);
        fname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(100, 100, 100));
        fname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        fname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 300, 30));

        age.setBackground(java.awt.Color.white);
        age.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(100, 100, 100));
        age.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        age.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 300, 30));

        jLabel2.setBackground(new java.awt.Color(74, 179, 175));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name:");
        jLabel2.setOpaque(true);
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 150, 30));

        lname.setBackground(java.awt.Color.white);
        lname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(100, 100, 100));
        lname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        lname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 300, 30));

        jLabel3.setBackground(new java.awt.Color(74, 179, 175));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Age:");
        jLabel3.setOpaque(true);
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 150, 30));

        jLabel5.setBackground(new java.awt.Color(74, 179, 175));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Marital Status:");
        jLabel5.setOpaque(true);
        mainLayout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 30));

        status.setBackground(java.awt.Color.white);
        status.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        status.setForeground(new java.awt.Color(100, 100, 100));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Single", "Married", "Divorced" }));
        status.setBorder(null);
        mainLayout.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 300, 30));

        jLabel6.setBackground(new java.awt.Color(74, 179, 175));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date(dd/mm/yyyy):");
        jLabel6.setOpaque(true);
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 150, 30));

        date.setBackground(java.awt.Color.white);
        date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(100, 100, 100));
        date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        date.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 300, 30));

        gender.setBackground(java.awt.Color.white);
        gender.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(100, 100, 100));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Male", "Female" }));
        gender.setBorder(null);
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 300, 30));

        jLabel4.setBackground(new java.awt.Color(74, 179, 175));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender:");
        jLabel4.setOpaque(true);
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 150, 30));

        jLabel8.setBackground(new java.awt.Color(74, 179, 175));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email:");
        jLabel8.setOpaque(true);
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 150, 30));

        email.setBackground(java.awt.Color.white);
        email.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 300, 30));

        jLabel10.setBackground(new java.awt.Color(74, 179, 175));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Phone No.:");
        jLabel10.setOpaque(true);
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 150, 30));

        phone.setBackground(java.awt.Color.white);
        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(100, 100, 100));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        phone.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 300, 30));

        jLabel14.setBackground(new java.awt.Color(74, 179, 175));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Password:");
        jLabel14.setOpaque(true);
        mainLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 150, 30));

        username.setBackground(java.awt.Color.white);
        username.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        username.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 300, 30));

        jLabel15.setBackground(new java.awt.Color(74, 179, 175));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Department:");
        jLabel15.setOpaque(true);
        mainLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 150, 30));

        blood.setBackground(java.awt.Color.white);
        blood.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        blood.setForeground(new java.awt.Color(100, 100, 100));
        blood.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        blood.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        blood.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 300, 30));

        jSeparator1.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator1.setForeground(new java.awt.Color(74, 179, 175));
        mainLayout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1270, 10));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(100, 100, 100));
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 179, 175)));
        id.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 104, 410, 30));

        jLabel11.setBackground(new java.awt.Color(74, 179, 175));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID");
        jLabel11.setOpaque(true);
        mainLayout.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 104, 40, 30));

        browse.setBackground(new java.awt.Color(32, 178, 170));
        browse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browse.setText("Browse");
        browse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 179, 175), 1, true));
        browse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse.setOpaque(true);
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMouseClicked(evt);
            }
        });
        mainLayout.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 110, 30));

        ward.setBackground(java.awt.Color.white);
        ward.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        ward.setForeground(new java.awt.Color(100, 100, 100));
        ward.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ward.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        ward.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 300, 30));

        jLabel17.setBackground(new java.awt.Color(74, 179, 175));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Blood Group:");
        jLabel17.setOpaque(true);
        mainLayout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 150, 30));

        jLabel18.setBackground(new java.awt.Color(74, 179, 175));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Room No.:");
        jLabel18.setOpaque(true);
        mainLayout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 150, 30));

        department.setBackground(java.awt.Color.white);
        department.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        department.setForeground(new java.awt.Color(100, 100, 100));
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Accident and emergency (A&E)", "Anaesthetics", "Breast Screening", "Cardiology", "Chaplaincy", "Critical Care", "Diagnostic Imaging", "Discharge Lounge", "Ear, Nose and Throat (ENT)", "Elderly Services Department", "Gastroenterology", "General Surgery", "Gynaecology", "Haematology", "Maternity Departments", "Microbiology", "Neonatal Unit", "Nephrology", "Neurology", "Nutrition and Dietetics", "Obstetrics and Gynaecology Units", "Occupational Therapy", "Oncology", "Ophthalmology", "Orthopaedics", "Pain Management Clinics", "Pharmacy", "Physiotherapy", "Radiotheraphy", "Renal Uniit", "Rheumatology", "Urology" }));
        department.setBorder(null);
        mainLayout.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 300, 30));

        password.setBackground(java.awt.Color.white);
        password.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(100, 100, 100));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 300, 30));

        jLabel19.setBackground(new java.awt.Color(74, 179, 175));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Username:");
        jLabel19.setOpaque(true);
        mainLayout.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 150, 30));

        icon1.setBackground(new java.awt.Color(255, 255, 255));
        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pictures/New Moon_100px_1.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 90));

        imgView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/User_100px_1.png"))); // NOI18N
        imgView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        imgView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgViewMouseClicked(evt);
            }
        });
        mainLayout.add(imgView, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 240, 270));

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

        jSeparator2.setBackground(new java.awt.Color(74, 179, 175));
        jSeparator2.setForeground(new java.awt.Color(74, 179, 175));
        mainLayout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1270, 10));

        save.setBackground(new java.awt.Color(32, 178, 170));
        save.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("Save");
        save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 179, 175), 1, true));
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setOpaque(true);
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        mainLayout.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 620, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new docPortal().show();
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

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        close();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_closeBtnMouseExited

    private void browseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseClicked
        Browse();
    }//GEN-LAST:event_browseMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_minimizeMouseEntered

    private void imgViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgViewMouseClicked
        Browse();
    }//GEN-LAST:event_imgViewMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        Save();
    }//GEN-LAST:event_saveMouseClicked

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
            java.util.logging.Logger.getLogger(editProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new editProfile().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField blood;
    private javax.swing.JLabel browse;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> department;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField password;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel save;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField username;
    private javax.swing.JTextField ward;
    // End of variables declaration//GEN-END:variables
}
