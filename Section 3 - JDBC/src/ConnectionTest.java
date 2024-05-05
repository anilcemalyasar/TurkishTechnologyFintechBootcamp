import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) {
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // Server URL
            String URL = "jdbc:mysql://localhost:3306/devdb";

            // User credentials
            String user = "root";
            String password = "Anil21112002?";
            Connection conn = DriverManager.getConnection(URL, user, password);

            // metadata
            System.out.println("Database " + conn.getMetaData().getDatabaseProductName());

            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
