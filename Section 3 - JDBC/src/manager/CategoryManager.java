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

    public boolean update(Category category) throws SQLException {
        Connection conn = DBUtilities.getConnection();
        String sql = "update category set categoryName=? where categoryId=?";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? (categoryName)
        statement.setString(1, category.getCategoryName());

        // second ? (categoryId)
        statement.setLong(2, category.getCategoryId());

        // check if correctly executed
        int rowUpdated = statement.executeUpdate();

        return rowUpdated == 1 ? true : false;
    }

    public boolean delete(long categoryId) throws SQLException {
        Connection conn = DBUtilities.getConnection();
        String sql = "delete from category where categoryId=?";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? (categoryId)
        statement.setLong(1, categoryId);

        // check if executed correctly
        int rowDeleted = statement.executeUpdate();

        return rowDeleted == 1;
    }
}
