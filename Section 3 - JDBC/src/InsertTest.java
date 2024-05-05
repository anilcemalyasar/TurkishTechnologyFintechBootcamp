import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest  {

    public static void main(String[] args) throws SQLException {
        // Server URL
        String URL = "jdbc:mysql://localhost:3306/devdb";

        // User credentials
        String user = "root";
        String password = "Anil21112002?";
        Connection conn = DriverManager.getConnection(URL, user, password);  
        
        String sql = "insert into Product(productName,salesPrice) values (?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? 
        statement.setString(1, "Laptop Computer");

        // second ? 
        statement.setDouble(2, 2500);

        int rowInserted = statement.executeUpdate();
        System.out.println(rowInserted + " row has been inserted successfully");

        conn.close();
    }

}
