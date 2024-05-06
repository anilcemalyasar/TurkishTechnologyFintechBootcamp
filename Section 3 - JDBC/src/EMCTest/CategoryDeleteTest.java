package EMCTest;

import manager.CategoryManager;

public class CategoryDeleteTest {
    
    public static void main(String[] args) {
        try {
            CategoryManager manager = new CategoryManager();
            long categoryId = 4;
            boolean isDeleted = manager.delete(categoryId);
            System.out.println("Deleted " + isDeleted);    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
