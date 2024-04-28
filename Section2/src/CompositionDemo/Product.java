package CompositionDemo;

public class Product {
    private int productId;
    private String productName;
    private double salesPrice;
    private Category category;  // 1-1 relationship: every product has a category

    public Product(int productId, String productName, double salesPrice) {
        this.productId = productId;
        this.productName = productName;
        this.salesPrice = salesPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }
}
