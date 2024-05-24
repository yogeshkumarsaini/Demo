package Dao;

import Models.Product;
import Utility.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public  void addProduct(Product product) throws SQLException {
        String sql = "INSERT INTO products (name, price) VALUES (?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getPrice());
            stmt.executeUpdate();
        }
    }
    public List<Product> getAllProduct() throws SQLException {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products";

        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product product=new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                products.add(product);
            }
        }
        return products;
    }

    public Product getProductById(int id) throws SQLException {
        String sql = "SELECT * FROM products WHERE id=?";
        Product product = null;

        try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    product = new Product();
                    product.setId(rs.getInt("id"));
                    product.setName(rs.getString("name"));
                    product.setPrice(rs.getDouble("price"));
                }
            }

            return product;
        }
    }

    public void updateProduct(Product product) throws SQLException {
        String sql = "UPDATE products SET name = ?, price = ? WHERE id = ?";

        try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getPrice());
            stmt.setInt(3, product.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteProduct(int id) throws SQLException {
        String sql = "DELETE FROM products WHERE id = ?";

        try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
