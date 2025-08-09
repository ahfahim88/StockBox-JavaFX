package com.stockbox.controller;

import com.stockbox.data.DataStore;
import com.stockbox.model.Product;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class ProductsController {
    @FXML private TableView<Product> table;
    @FXML private TableColumn<Product, Number> colId;
    @FXML private TableColumn<Product, String> colName;
    @FXML private TableColumn<Product, String> colSku;
    @FXML private TableColumn<Product, Number> colQty;
    @FXML private TableColumn<Product, Number> colPrice;

    @FXML private TextField tfName, tfSku, tfQty, tfPrice;
    @FXML private Label feedback;

    private ObservableList<Product> products;

    @FXML
    private void initialize() {
        products = DataStore.get().getProducts();
        colId.setCellValueFactory(c -> c.getValue().idProperty());
        colName.setCellValueFactory(c -> c.getValue().nameProperty());
        colSku.setCellValueFactory(c -> c.getValue().skuProperty());
        colQty.setCellValueFactory(c -> c.getValue().quantityProperty());
        colPrice.setCellValueFactory(c -> c.getValue().priceProperty());
        table.setItems(products);
        feedback.setText("");
    }

    @FXML
    private void addProduct() {
        try {
            String name = tfName.getText();
            String sku = tfSku.getText();
            int qty = Integer.parseInt(tfQty.getText());
            double price = Double.parseDouble(tfPrice.getText());
            if(name.isBlank()) { feedback.setText("Name required"); return; }
            Product p = new Product(0, name, sku, qty, price);
            DataStore.get().addProduct(p);
            tfName.clear(); tfSku.clear(); tfQty.clear(); tfPrice.clear();
            feedback.setText("Product added.");
        } catch (Exception ex) {
            feedback.setText("Invalid input: " + ex.getMessage());
        }
    }

    @FXML
    private void deleteSelected() {
        Product sel = table.getSelectionModel().getSelectedItem();
        if(sel != null) {
            DataStore.get().removeProduct(sel);
            feedback.setText("Product removed.");
        } else feedback.setText("Select a product first.");
    }

    @FXML
    private void onRowDoubleClick(MouseEvent ev) {
        if(ev.getClickCount() == 2) {
            Product sel = table.getSelectionModel().getSelectedItem();
            if(sel != null) {
                tfName.setText(sel.getName());
                tfSku.setText(sel.getSku());
                tfQty.setText(String.valueOf(sel.getQuantity()));
                tfPrice.setText(String.valueOf(sel.getPrice()));
                feedback.setText("Editing product id " + sel.getId() + ". After change press Add to create a NEW item or delete to remove.");
            }
        }
    }
}
