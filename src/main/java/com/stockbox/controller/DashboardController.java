package com.stockbox.controller;

import com.stockbox.util.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {
    @FXML private Label welcome;

    @FXML
    private void initialize() {
        welcome.setText("Welcome to StockBox — modern simple inventory");
    }

    @FXML
    private void goProducts() throws Exception { SceneManager.showProducts(); }
    @FXML
    private void goSuppliers() throws Exception { SceneManager.showSuppliers(); }
    @FXML
    private void goCustomers() throws Exception { SceneManager.showCustomers(); }
    @FXML
    private void goOrders() throws Exception { SceneManager.showOrders(); }
    @FXML
    private void goStockAdjust() throws Exception { SceneManager.showStockAdjust(); }
    @FXML
    private void goSettings() throws Exception { SceneManager.showSettings(); }
    @FXML
    private void goAbout() throws Exception { SceneManager.showAbout(); }
}
