import Models.Product;
import Service.ProductService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private ProductService productService;
    private Scanner scanner;

    public Main() {
        this.productService = new ProductService();
        this.scanner = new Scanner(System.in);
    }


    public static void main(String[] args) {

        Main main = new Main();
        main.run();
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        viewAllProduct();
                        break;
                    case 3:
                        updateProduct();
                        break;
                    case 4:
                        deleteProduct();
                        break;
                    case 5:
                        viewProductById();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void showMenu() {
        System.out.println("\nProduct Management System");
        System.out.println("1. Add Product");
        System.out.println("2. View All Product");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. View Product by ID");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addProduct() throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        productService.addProduct(product);
        System.out.println("Product added successfully!");
    }

    private void viewAllProduct() throws SQLException {
        List<Product> products = productService.getAllProduct();
        System.out.println("\nProduct List:");
        for (Product product: products) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                     ", Price: " + product.getPrice());
        }
    }

    private void viewProductById() throws SQLException {
        System.out.print("Enter product ID to view: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product product = productService.getProductById(id);
        if (product != null) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                     ", Price: " + product.getPrice());
        } else {
            System.out.println("Product not found with ID: " + id);
        }
    }


    private void updateProduct() throws SQLException {
        System.out.print("Enter product ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);

        productService.updateProduct(product);
        System.out.println("Product updated successfully!");
    }

    private void deleteProduct() throws SQLException {
        System.out.print("Enter product ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        productService.deleteProduct(id);
        System.out.println("Product deleted successfully!");
    }
}