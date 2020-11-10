package db_class;

import admin.adminDashboard;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Allwell Ubi
 */
public class methods {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String s;
    private javax.swing.JLabel imgView;
    
    
    private void initComponents(){
        imgView=new javax.swing.JLabel();
    }
    public void Database(){
        con=connectDB.connect();
    }
    
    
    
    //Random Number Generation
    public void RandomNumberGen(int rndm, JTextField id){
        Random rand=new Random();
        rndm=rand.nextInt(992467);
        id.setText("DOC-"+rndm);
    }
    
    //Login To Portal
    public void login(JTextField username, JLabel warning, JLabel warning1, JLabel warning2, JPasswordField password, JFrame frame){
        try{
            if(username.getText().equals("")&&password.getText().equals("")){
                warning.setText("Please enter your username and password!");
                warning2.setText("");
                warning1.setText("");
                return;
            }
            if(username.getText().equals("")){
                warning2.setText("Required!");
                warning1.setText("");
                warning.setText("");
                return;
            }
            if(password.getText().equals("")){
                warning1.setText("Required!");
                warning2.setText("");
                warning.setText("");
                return;
            }
            Database();
            String sql="SELECT * FROM adminlogin WHERE username=? and password=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, username.getText());
            pst.setString(2, password.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                new adminDashboard().show();
                frame.hide();
            }else
            {
                JOptionPane.showMessageDialog(null,"Incorrect username or password!");
                username.setText("");
                password.setText("");
                warning.setText("");
                warning1.setText("");
                warning2.setText("");
            }
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    //Add Doctor To Database
    public void add(int rndm, JTextField id,JTextField fname,JTextField lname,JTextField age,
            JComboBox gender,JComboBox status,JTextField date,JTextField address,
            JTextField email, JTextField phone,JPasswordField password,JTextField blood,
            JTextField username,JComboBox department,JTextField ward)
    {
        
        try{
            String query="INSERT INTO `doctor`(`Doctor_ID`, `First_Name`, `Last_Name`, `Age`, `Gender`, `Marital_Status`, `Date`, `Address`, `Email`, `Phone`, `Password`, `Blood_Group`, `Username`, `Department`, `Ward_No.`, `Image`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            pst=con.prepareStatement(query);
            InputStream is = new FileInputStream(new File(s));
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
            pst.setString(11, password.getText());
            pst.setString(12, blood.getText());
            pst.setString(13, username.getText());
            pst.setString(14, (String) department.getSelectedItem());
            pst.setString(15, ward.getText());
            pst.setBlob(16, is);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, fname.getText()+" "+lname.getText()+" added successfully!");
            RandomNumberGen(rndm, id);
            id.enable(false);
            fname.setText(""); lname.setText(""); age.setText(""); gender.setSelectedItem("");
            department.setSelectedItem(""); date.setText(""); address.setText(""); email.setText("");
            phone.setText(""); password.setText(""); blood.setText(""); department.setSelectedItem("");
            username.setText(""); ward.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //Method To Resize The ImageIcon
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(imgView.getWidth(), imgView.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
    //Method To Import Image
    public void openDialog(){
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
    
    
    
    
}
