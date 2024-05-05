package EMPTest;

import java.sql.SQLException;

import entity.Product;
import manager.ProductManager;

public class ProductInsertTest {
    public static void main(String[] args) throws SQLException {
        Product product = new Product(2, "Wireless Keyboard", 120);
        ProductManager productManager = new ProductManager();
        boolean inserted = productManager.insert(product);
        System.out.println("Inserted " + inserted);
    }
}
