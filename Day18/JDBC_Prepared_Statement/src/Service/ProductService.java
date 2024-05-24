package Service;

import Dao.ProductDao;
import Models.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    private ProductDao productDao;

    public ProductService() {
        productDao = new ProductDao();
    }

    public void addProduct(Product product) throws SQLException {
        productDao.addProduct(product);
    }

    public List<Product> getAllProduct() throws SQLException {
        return productDao.getAllProduct();
    }

    public Product getProductById(int id) throws SQLException {
        return productDao.getProductById(id);
    }

    public void updateProduct(Product product) throws SQLException {
        productDao.updateProduct(product);
    }

    public void deleteProduct(int id) throws SQLException {
        productDao.deleteProduct(id);
    }
}
