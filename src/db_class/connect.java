package db_class;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Allwel Festus
 */
public class connect {
    
    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }   
}