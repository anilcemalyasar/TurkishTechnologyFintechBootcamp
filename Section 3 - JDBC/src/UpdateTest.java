import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {
    
    public static void main(String[] args) throws SQLException {
        // Server URL
        String URL = "jdbc:mysql://localhost:3306/devdb";

        // User credentials
        String user = "root";
        String password = "Anil21112002?";
        Connection conn = DriverManager.getConnection(URL, user, password);

        String sql = "update product set productName=?, salesPrice=? where productId=?";
        PreparedStatement statement = conn.prepareStatement(sql);

        // 1st ? (productname)
        statement.setString(1, "Smart Phone");

        // 2st ? (salesprice)
        statement.setDouble(2, 15000);

        // 3st ? (productId)
        statement.setLong(3, 1);

        int rowUpdated = statement.executeUpdate();
        System.out.println(rowUpdated + " row has been updated successfully");

        conn.close();
    }
}
