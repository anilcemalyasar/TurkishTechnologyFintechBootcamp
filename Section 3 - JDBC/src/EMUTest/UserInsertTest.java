package EMUTest;

import java.sql.SQLException;

import entity.User;
import manager.UserManager;

public class UserInsertTest {
    
    public static void main(String[] args) throws SQLException {
        User user = new User("Lionel", "Messi ", "test12@gmail.com");
        user.setAge(38);
        UserManager manager = new UserManager();
        boolean inserted = manager.insert(user);
        System.out.println("User inserted: " + inserted);
    }
}
