package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;
import library.DBUtilities;

public class UserManager {

    public User find(long userId) throws SQLException {
        Connection conn = DBUtilities.getConnection();
        String sql = "select * from user where userId = ?";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? (productId)
        statement.setLong(1, userId);
        statement.setMaxRows(1);

        ResultSet rs = statement.executeQuery();
        User user = null;
        if (rs.next()) {
            user = new User(rs.getString("firstName"), rs.getString("lastName"), rs.getString("emailAddress"));
            user.setAge(rs.getInt("age"));
            user.setUserId(rs.getLong("userId"));
        }
        return user;
    } 
    
    public boolean insert(User user) throws SQLException {
        Connection conn = DBUtilities.getConnection();
        String sql = "insert into User(firstName, lastName, emailAddress, age) values(?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? (firstName)
        statement.setString(1, user.getFirstName());

        // second ? (lastName)
        statement.setString(2, user.getLastName());

        // third ? (emailAddress)
        statement.setString(3, user.getEmailAddress());

        // fourth ? (age)
        statement.setInt(4, user.getAge());

        // execute the statement
        int rowInserted = statement.executeUpdate();
        conn.close();

        return rowInserted == 1;
    }

    public boolean updateAge(User user) throws SQLException {
        Connection conn = DBUtilities.getConnection();
        String sql = "update user set age=? where userId=?";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? (age)
        statement.setInt(1, user.getAge());

        // second ? (userId)
        statement.setLong(2, user.getUserId());

        int rowUpdated = statement.executeUpdate();
        return rowUpdated == 1;
    }
}
