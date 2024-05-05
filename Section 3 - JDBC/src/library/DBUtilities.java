package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtilities {
    public static String URL = "jdbc:mysql://localhost:3306/devdb";
    public static String user = "root";
    public static String password = "Anil21112002?";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, user, password);
        return connection;
    }
}
