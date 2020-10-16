package admin;

import db_class.methods;
import db_class.sqlite_connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Allwell Festus
 */
public class addDoctor extends javax.swing.JFrame {
    
    Connection con;
    
    methods methodObject=new methods();
    JFileChooser choose=new JFileChooser();
    String s;
    int rndm;
    
    
    public addDoctor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //  Connect to database
    private void db() {
        con = sqlite_connection.connection();
    }

    //  Minimize
    private void minimize(){
        this.setState(JFrame.ICONIFIED);
    }
    
    //  Close
    private void close(){
        System.exit(0);
    }
    
    ////////Resize The ImageIcon////////
    private ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(imgView.getWidth(), imgView.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
    ////////Browse for picture in your system folders////////
    private void browse() {
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
    
    //Add Doctor To Database
    private void add() {
        try {
            InputStream is = new FileInputStream(new File(s));
            String query="INSERT INTO `doctor`(`fname`, `lname`, `age`, `gender`, `status`, `date`, `email`, "
                    + "`phone`, `password`, `blood`, `username`, `dept`, `room`, `img`) "
                    + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+age.getText()+"', '"+gender.getSelectedItem()+"', "
                    + "'"+status.getSelectedItem()+"', '"+date.getText()+"', '"+email.getText()+"', '"+phone.getText()+"', "
                    + "'"+password.getText()+"', '"+blood.getText()+"', '"+username.getText()+"', '"+department.getSelectedItem()+"', "
                    + "'"+room.getText()+"', '"+is+"')";
            
            db();
            int check = con.prepareStatement(query).executeUpdate();
            if(check == 1) {
                JOptionPane.showMessageDialog(null, "Added successfully!", "Success", 1);
                
                fname.setText(""); lname.setText(""); age.setText(""); gender.setSelectedItem(null);
                department.setSelectedItem(null); date.setText(""); email.setText("");
                phone.setText(""); password.setText(""); blood.setText(""); department.setSelectedItem(null);
                username.setText(""); room.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Operation Failed!", "Failed", 0);
            }
            con.close();
        }catch(HeadlessException | FileNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        addPat = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        psd = new javax.swing.JLabel();
        blood = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        imgView = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        browseBtn = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        room = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setMaximumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setMinimumSize(new java.awt.Dimension(1270, 670));
        mainLayout.setPreferredSize(new java.awt.Dimension(1270, 670));
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/Add User Male_50px.png"))); // NOI18N
        mainLayout.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 70, 70));

        addPat.setBackground(new java.awt.Color(32, 178, 170));
        addPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        addPat.setForeground(new java.awt.Color(255, 255, 255));
        addPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPat.setText("Add Doctor");
        addPat.setOpaque(true);
        mainLayout.add(addPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pictures/New Moon_100px_1.png"))); // NOI18N
        mainLayout.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 90, 90));

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
        mainLayout.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 40, 30));

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
        mainLayout.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 30));

        delPat.setBackground(new java.awt.Color(255, 255, 255));
        delPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        delPat.setForeground(new java.awt.Color(32, 178, 170));
        delPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delPat.setText("Delete Doctor");
        delPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delPat.setOpaque(true);
        delPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delPatMouseClicked(evt);
            }
        });
        mainLayout.add(delPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 140, 50));

        crossoverPanel.setBackground(new java.awt.Color(32, 178, 170));
        crossoverPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientDetails.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        patientDetails.setForeground(new java.awt.Color(240, 240, 240));
        patientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientDetails.setText("Add Doctor");
        crossoverPanel.add(patientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 40));

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
        crossoverPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 50, 40));

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
        crossoverPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 50, 40));

        mainLayout.add(crossoverPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1210, 40));

        viewPat.setBackground(new java.awt.Color(255, 255, 255));
        viewPat.setFont(new java.awt.Font("Segoe UI Semilight", 2, 14)); // NOI18N
        viewPat.setForeground(new java.awt.Color(32, 178, 170));
        viewPat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPat.setText("View Doctor");
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
        upPat.setText("Update Doctor");
        upPat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upPat.setOpaque(true);
        upPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upPatMouseClicked(evt);
            }
        });
        mainLayout.add(upPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 50));

        jLabel1.setBackground(new java.awt.Color(74, 179, 175));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Name");
        jLabel1.setOpaque(true);
        mainLayout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 110, 30));

        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        fname.setForeground(new java.awt.Color(100, 100, 100));
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        fname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 30));

        jLabel2.setBackground(new java.awt.Color(74, 179, 175));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name");
        jLabel2.setOpaque(true);
        mainLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, 30));

        lname.setBackground(new java.awt.Color(255, 255, 255));
        lname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        lname.setForeground(new java.awt.Color(100, 100, 100));
        lname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        lname.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 260, 30));

        jLabel3.setBackground(new java.awt.Color(74, 179, 175));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Age");
        jLabel3.setOpaque(true);
        mainLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 110, 30));

        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        age.setForeground(new java.awt.Color(100, 100, 100));
        age.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        age.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 260, 30));

        jLabel4.setBackground(new java.awt.Color(74, 179, 175));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender");
        jLabel4.setOpaque(true);
        mainLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 130, 30));

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        date.setForeground(new java.awt.Color(100, 100, 100));
        date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        date.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 260, 30));

        jLabel5.setBackground(new java.awt.Color(74, 179, 175));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Marital Status");
        jLabel5.setOpaque(true);
        mainLayout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 110, 30));

        jLabel6.setBackground(new java.awt.Color(74, 179, 175));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date(dd/mm/yyyy)");
        jLabel6.setOpaque(true);
        mainLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 130, 30));

        jLabel8.setBackground(new java.awt.Color(74, 179, 175));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email");
        jLabel8.setOpaque(true);
        mainLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 110, 30));

        phone.setBackground(new java.awt.Color(255, 255, 255));
        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        phone.setForeground(new java.awt.Color(100, 100, 100));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        phone.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 260, 30));

        jLabel10.setBackground(new java.awt.Color(74, 179, 175));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Phone No.");
        jLabel10.setOpaque(true);
        mainLayout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 130, 30));

        jLabel13.setBackground(new java.awt.Color(74, 179, 175));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Blood Group");
        jLabel13.setOpaque(true);
        mainLayout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 110, 30));

        psd.setBackground(new java.awt.Color(74, 179, 175));
        psd.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        psd.setForeground(new java.awt.Color(255, 255, 255));
        psd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        psd.setText("Password");
        psd.setOpaque(true);
        mainLayout.add(psd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 130, 30));

        blood.setBackground(new java.awt.Color(255, 255, 255));
        blood.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        blood.setForeground(new java.awt.Color(100, 100, 100));
        blood.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        blood.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        blood.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 260, 30));

        jLabel15.setBackground(new java.awt.Color(74, 179, 175));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Room No.");
        jLabel15.setOpaque(true);
        mainLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 110, 30));

        username.setEditable(false);
        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        username.setForeground(new java.awt.Color(100, 100, 100));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        username.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 260, 30));

        imgView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons80x/User_100px_1.png"))); // NOI18N
        imgView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        mainLayout.add(imgView, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 250, 270));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        email.setForeground(new java.awt.Color(100, 100, 100));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        email.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 260, 30));

        gender.setBackground(new java.awt.Color(255, 255, 255));
        gender.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(100, 100, 100));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Male", "Female" }));
        gender.setBorder(null);
        mainLayout.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 260, 30));

        department.setBackground(new java.awt.Color(255, 255, 255));
        department.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        department.setForeground(new java.awt.Color(100, 100, 100));
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Accident and emergency (A&E)", "Anaesthetics", "Breast Screening", "Cardiology", "Chaplaincy", "Critical Care", "Diagnostic Imaging", "Discharge Lounge", "Ear, Nose and Throat (ENT)", "Elderly Services Department", "Gastroenterology", "General Surgery", "Gynaecology", "Haematology", "Maternity Departments", "Microbiology", "Neonatal Unit", "Nephrology", "Neurology", "Nutrition and Dietetics", "Obstetrics and Gynaecology Units", "Occupational Therapy", "Oncology", "Ophthalmology", "Orthopaedics", "Pain Management Clinics", "Pharmacy", "Physiotherapy", "Radiotheraphy", "Renal Uniit", "Rheumatology", "Urology" }));
        department.setBorder(null);
        mainLayout.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 260, 30));

        jSeparator1.setBackground(new java.awt.Color(32, 178, 170));
        jSeparator1.setForeground(new java.awt.Color(32, 178, 170));
        mainLayout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1270, 10));

        browseBtn.setBackground(new java.awt.Color(32, 178, 170));
        browseBtn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        browseBtn.setForeground(new java.awt.Color(255, 255, 255));
        browseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browseBtn.setText("Browse");
        browseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browseBtn.setOpaque(true);
        browseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseBtnMouseClicked(evt);
            }
        });
        mainLayout.add(browseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 630, 110, 30));

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
        mainLayout.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 630, 110, 30));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(100, 100, 100));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        password.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 260, 30));

        jLabel12.setBackground(new java.awt.Color(74, 179, 175));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Department");
        jLabel12.setOpaque(true);
        mainLayout.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 130, 30));

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        status.setForeground(new java.awt.Color(100, 100, 100));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Single", "Married", "Divorced" }));
        status.setBorder(null);
        mainLayout.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 260, 30));

        room.setBackground(new java.awt.Color(255, 255, 255));
        room.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        room.setForeground(new java.awt.Color(100, 100, 100));
        room.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        room.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        room.setCaretColor(new java.awt.Color(74, 179, 175));
        mainLayout.add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 260, 30));

        jLabel16.setBackground(new java.awt.Color(74, 179, 175));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Username");
        jLabel16.setOpaque(true);
        mainLayout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 110, 30));

        jLabel7.setForeground(new java.awt.Color(100, 100, 100));
        jLabel7.setText("* Default password is the doctor's lastname.");
        jLabel7.setIconTextGap(5);
        mainLayout.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, 20));

        jLabel9.setForeground(new java.awt.Color(100, 100, 100));
        jLabel9.setText("* Default username is the doctor's firstname.");
        jLabel9.setIconTextGap(5);
        mainLayout.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void delPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delPatMouseClicked
        new deleteDoctor().show();
        dispose();
    }//GEN-LAST:event_delPatMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new adminPortal().show();
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

    private void viewPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPatMouseClicked
        new viewDoctor().show();
        dispose();
    }//GEN-LAST:event_viewPatMouseClicked

    private void upPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upPatMouseClicked
        new updateDoctor().show();
        dispose();
    }//GEN-LAST:event_upPatMouseClicked

    private void browseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseBtnMouseClicked
        browse();
    }//GEN-LAST:event_browseBtnMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        add();
    }//GEN-LAST:event_addMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        minimize();
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(new Color(240,240,240));
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
            java.util.logging.Logger.getLogger(addDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel addPat;
    private javax.swing.JTextField age;
    private javax.swing.JTextField blood;
    private javax.swing.JLabel browseBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel crossoverPanel;
    private javax.swing.JTextField date;
    private javax.swing.JLabel delPat;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel imgView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField password;
    private javax.swing.JLabel patientDetails;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel psd;
    private javax.swing.JTextField room;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel upPat;
    private javax.swing.JTextField username;
    private javax.swing.JLabel viewPat;
    // End of variables declaration//GEN-END:variables
}