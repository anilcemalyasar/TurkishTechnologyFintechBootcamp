package EMPTest;

import java.sql.SQLException;

import entity.Product;
import manager.ProductManager;

public class ProductUpdateTest {
    
    public static void main(String[] args) throws SQLException {
        ProductManager manager = new ProductManager();
        Product product = new Product(3, "Personal Computer", 3000);
        boolean updated = manager.update(product);
        System.out.println("Updated " + updated);
    }
}
