package db_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Allwell Onen
 */
public class sqlite_connection {

    private static final String DB_DRIVER = "org.sqlite.JDBC";
    private static final String DB_URL = "jdbc:sqlite:src/db/hospital_management_system.db";
    private static Connection CON;

    public static Connection connection() {
        try {
            Class.forName(DB_DRIVER);
            CON = DriverManager.getConnection(DB_URL);
//            System.out.println("Connection Successful!");
        } catch (ClassNotFoundException | SQLException ex) {
//            System.out.println("Connection failed!");
            System.out.println(ex.getMessage());
        }
        return CON;
    }

    public static void main(String[] args) {
        connection();
    }
}
