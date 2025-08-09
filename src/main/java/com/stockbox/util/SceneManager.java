package com.stockbox.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {
    private static Stage stage;
    public static void init(Stage st) {
        stage = st;
    }

    private static void loadAndShow(String fxml, String title) throws IOException {
        Parent root = FXMLLoader.load(SceneManager.class.getResource("/fxml/" + fxml));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(SceneManager.class.getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle(title);
        stage.setWidth(1000);
        stage.setHeight(700);
        stage.show();
    }

    public static void showLogin() throws IOException {
        loadAndShow("login.fxml", "StockBox - Login");
    }

    public static void showDashboard() throws IOException {
        loadAndShow("dashboard.fxml", "StockBox - Dashboard");
    }

    public static void showProducts() throws IOException {
        loadAndShow("products.fxml", "StockBox - Products");
    }

    public static void showSuppliers() throws IOException {
        loadAndShow("suppliers.fxml", "StockBox - Suppliers");
    }

    public static void showCustomers() throws IOException {
        loadAndShow("customers.fxml", "StockBox - Customers");
    }

    public static void showOrders() throws IOException {
        loadAndShow("orders.fxml", "StockBox - Orders");
    }

    public static void showStockAdjust() throws IOException {
        loadAndShow("stock_adjust.fxml", "StockBox - Stock Adjustment");
    }

    public static void showSettings() throws IOException {
        loadAndShow("settings.fxml", "StockBox - Settings");
    }

    public static void showAbout() throws IOException {
        loadAndShow("about.fxml", "StockBox - About");
    }
}
