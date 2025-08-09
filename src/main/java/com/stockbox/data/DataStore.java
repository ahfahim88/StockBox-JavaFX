package com.stockbox.data;

import com.stockbox.model.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataStore {
    private static DataStore instance = new DataStore();
    private ObservableList<Product> products = FXCollections.observableArrayList();
    private int nextProductId = 1;

    private DataStore() {
        // seed sample data
        addProduct(new Product(0, "USB Cable", "USB-001", 120, 3.99));
        addProduct(new Product(0, "Wireless Mouse", "MSE-101", 45, 12.49));
        addProduct(new Product(0, "Keyboard", "KB-304", 30, 22.00));
    }

    public static DataStore get() { return instance; }

    public ObservableList<Product> getProducts() { return products; }

    public void addProduct(Product p) {
        p.setId(nextProductId++);
        products.add(p);
    }

    public void removeProduct(Product p) { products.remove(p); }
}
