package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Category;
import library.DBUtilities;

public class CategoryManager {
    
    public boolean insert(Category category) throws SQLException {
        Connection conn = DBUtilities.getConnection();
        String sql = "insert into category(categoryName) values(?)";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? (categoryName)
        statement.setString(1, category.getCategoryName());
        
        int rowInserted = statement.executeUpdate();
        return rowInserted == 1 ? true : false;
    }
}
