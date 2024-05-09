package EMUTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import library.DBUtilities;

public class UpdateUserTable {
    
    public static void main(String[] args) {
        try {
            Connection conn = DBUtilities.getConnection();
            Statement statement = conn.createStatement();
            String addColumnSQL = "ALTER TABLE User ADD COLUMN age INT NOT NULL";
            statement.executeUpdate(addColumnSQL);
            System.out.println("Column added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
