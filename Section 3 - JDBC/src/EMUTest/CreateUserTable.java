package EMUTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import library.DBUtilities;

public class CreateUserTable {
    
    public static void main(String[] args) {
        
        try {
            Connection conn = DBUtilities.getConnection();
            Statement statement = conn.createStatement();
            String sql = "CREATE TABLE USER " +
            "(userId BIGINT NOT NULL AUTO_INCREMENT, " +
            " firstName VARCHAR(45) NOT NULL, " + 
            " lastName VARCHAR(45) NOT NULL, " + 
            " emailAddress VARCHAR(45) NOT NULL, " + 
            " PRIMARY KEY ( userId ))"; 

            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
