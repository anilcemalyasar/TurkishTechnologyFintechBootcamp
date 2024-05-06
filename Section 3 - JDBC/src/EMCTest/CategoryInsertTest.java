package EMCTest;

import java.sql.SQLException;

import entity.Category;
import manager.CategoryManager;

public class CategoryInsertTest {
    
    public static void main(String[] args) throws SQLException {
        CategoryManager manager = new CategoryManager();
        Category category = new Category(3, "Electronics");
        boolean inserted = manager.insert(category);
        System.out.println("Inserted " + inserted);
    }
}
