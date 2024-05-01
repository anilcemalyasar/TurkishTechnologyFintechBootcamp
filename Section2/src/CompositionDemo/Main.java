package CompositionDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Category category1 = new Category(101, "White Goods");
        List<Product> productList = new ArrayList<Product>();
        category1.setProductList(productList);

        // instantiate some products for the category
        Product product1 = new Product(100, "Fridge", 979);

        // now we will form the relationship
        // by introducing product and category
        product1.setCategory(category1);

        // introduce category to product
        category1.getProductList().add(product1);

        // lets add more products
        Product product2 = new Product(102, "Dishwasher", 799);
        product2.setCategory(category1);
        category1.getProductList().add(product2);

        // Reporting
        // lets first display category name
        System.out.println("Category name: " + category1.getCategoryName());


        // Reporting
        // lets display products of category 1
        for (Product product: category1.getProductList()) {
            System.out.println(product.getProductName());
        }

        Category category2 = new Category(102, "Electronics");
        List<Product> productList2 = new ArrayList<Product>();
        category2.setProductList(productList2);

    }
}
