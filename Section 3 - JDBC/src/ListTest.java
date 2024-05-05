import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListTest {

    public static void main(String[] args) throws SQLException {
        // URL
        String URL = "jdbc:mysql://localhost:3306/devdb";
        // User credentials
        String user = "root";
        String password = "Anil21112002?";
        Connection conn = DriverManager.getConnection(URL, user, password); 
        
        String sql = "select * from product";
        PreparedStatement statement = conn.prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery(sql);
        
        while(resultSet.next()) {
            System.out.print(resultSet.getString("productId") + " ");
            System.out.print(resultSet.getString("productName") + " ");
            System.out.print(resultSet.getString("salesPrice"));
        }

        conn.close();
    }
}
