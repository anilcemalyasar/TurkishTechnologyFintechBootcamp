package EMUTest;

import java.sql.SQLException;

import entity.User;
import manager.UserManager;

public class UserSelectTest {
    
    public static void main(String[] args) throws SQLException {
        UserManager manager = new UserManager();
        long userId = 4;
        User user = manager.find(userId);
        System.out.println(user);
    }
}
