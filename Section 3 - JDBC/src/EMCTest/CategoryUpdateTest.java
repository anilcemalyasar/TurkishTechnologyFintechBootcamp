package EMCTest;

import java.sql.SQLException;

import entity.Category;
import manager.CategoryManager;

public class CategoryUpdateTest {
    
    public static void main(String[] args) throws SQLException {
        
        CategoryManager manager = new CategoryManager();
        Category category = new Category(2, "Electronic Devices");
        boolean updated = manager.update(category);
        System.out.println("Updated " + updated);
    }
}
