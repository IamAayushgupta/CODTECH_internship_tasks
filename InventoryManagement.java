package Inventarymanagement;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {
    private List<Product> products;

    public InventoryManagement() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void editProduct(int id, String name, int quantity, double price) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setQuantity(quantity);
                // Assume only quantity is editable for simplicity
                return;
            }
        }
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getLowStockProducts(int threshold) {
        List<Product> lowStockProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getQuantity() < threshold) {
                lowStockProducts.add(product);
            }
        }
        return lowStockProducts;
    }
}

