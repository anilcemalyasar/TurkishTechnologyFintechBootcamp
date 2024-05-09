package EMUTest;

import java.sql.SQLException;

import entity.User;
import manager.UserManager;

public class UserUpdateAgeTest {
    
    public static void main(String[] args) throws SQLException {
        UserManager manager = new UserManager();
        User user = manager.find(3);
        user.setAge(39);
        boolean updated = manager.updateAge(user);
        System.out.println("User updated " + updated);
        System.out.println(user);
    }
}
