package EMUTest;

import java.sql.SQLException;

import entity.User;
import manager.UserManager;

public class UserInsertTest {
    
    public static void main(String[] args) throws SQLException {
        User user = new User("Cristiano", "Ronaldo ", "test12@gmail.com");
        UserManager manager = new UserManager();
        boolean inserted = manager.insert(user);
        System.out.println("User inserted: " + inserted);
    }
}
