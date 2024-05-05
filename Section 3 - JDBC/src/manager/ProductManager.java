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


    public boolean update(Product product) throws SQLException {
        Connection connection = DBUtilities.getConnection();
        String sql = "update product set productName=?, salesPrice=? where productId=?";
        PreparedStatement statement = connection.prepareStatement(sql);

        // first ? (productName)
        statement.setString(1, product.getProductName());

        // second ? (salesPrice)
        statement.setDouble(2, product.getSalesPrice());

        // third ? (productId)
        statement.setLong(3, product.getProductId());

        int rowUpdated = statement.executeUpdate();
        connection.close();

        return rowUpdated == 1 ? true : false;
    }

    public boolean delete(long productId) throws SQLException {
        Connection conn = DBUtilities.getConnection();
        String sql = "delete from product where productId=?";
        PreparedStatement statement = conn.prepareStatement(sql);

        // first ? (productId)
        statement.setLong(1, productId);

        int rowDeleted = statement.executeUpdate();
        conn.close();

        return rowDeleted == 1 ? true : false;
        
    }

}
