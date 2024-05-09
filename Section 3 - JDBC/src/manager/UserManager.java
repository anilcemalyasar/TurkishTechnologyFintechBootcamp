package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.User;
import library.DBUtilities;

public class UserManager {
    
    public boolean insert(User user) throws SQLException {
        Connection conn = DBUtilities.getConnection();
        String sql = "insert into User(firstName, lastName, emailAddress) values(?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? (firstName)
        statement.setString(1, user.getFirstName());

        // second ? (lastName)
        statement.setString(2, user.getLastName());

        // third ? (emailAddress)
        statement.setString(3, user.getEmailAddress());

        // execute the statement
        int rowInserted = statement.executeUpdate();
        conn.close();

        return rowInserted == 1;
    }
}
