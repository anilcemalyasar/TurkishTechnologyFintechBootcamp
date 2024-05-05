package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Product;
import library.DBUtilities;

// responsible for CRUD operations
public class ProductManager {
    
    public boolean insert(Product product) throws SQLException {
        Connection connection = DBUtilities.getConnection();
        String sql = "insert into Product(productName,salesPrice) values (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        // first ? 
        statement.setString(1, product.getProductName());

        // second ? 
        statement.setDouble(2, product.getSalesPrice());

        int rowInserted = statement.executeUpdate();
        connection.close();

        return rowInserted == 1 ? true : false;
    } 
}
