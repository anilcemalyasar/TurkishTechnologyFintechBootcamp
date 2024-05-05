package transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {
    public static void main(String[] args) throws SQLException {
        
        // Server URL
        String URL = "jdbc:mysql://localhost:3306/devdb";

        // User credentials
        String user = "root";
        String password = "Anil21112002?";
        Connection conn = DriverManager.getConnection(URL, user, password);  

        // all transactions should be true before committing them into database
        conn.setAutoCommit(false);
        
        // add record1
        String sql = "insert into Product(productName,salesPrice) values (?,?)";
        PreparedStatement statement1 = conn.prepareStatement(sql);

        // first ? 
        statement1.setString(1, "Laptop Computer");

        // second ? 
        statement1.setDouble(2, 2500);

        int rowInserted = statement1.executeUpdate();
        System.out.println(rowInserted + " row has been inserted successfully");

        // add record2
        PreparedStatement statement2 = conn.prepareStatement(sql + "fadasdada");

        // first ? 
        statement2.setString(1, "Personal Computer");

        // second ? 
        statement2.setDouble(2, 3000);

        rowInserted = statement2.executeUpdate();
        System.out.println(rowInserted + " row has been inserted successfully!");

        conn.commit();
        conn.close();
    }
}
