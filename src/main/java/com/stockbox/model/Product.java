package com.stockbox.model;

import javafx.beans.property.*;

public class Product {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty sku = new SimpleStringProperty();
    private final IntegerProperty quantity = new SimpleIntegerProperty();
    private final DoubleProperty price = new SimpleDoubleProperty();

    public Product() {}

    public Product(int id, String name, String sku, int quantity, double price) {
        this.id.set(id);
        this.name.set(name);
        this.sku.set(sku);
        this.quantity.set(quantity);
        this.price.set(price);
    }

    public int getId() { return id.get(); }
    public IntegerProperty idProperty() { return id; }
    public void setId(int id) { this.id.set(id); }

    public String getName() { return name.get(); }
    public StringProperty nameProperty() { return name; }
    public void setName(String name) { this.name.set(name); }

    public String getSku() { return sku.get(); }
    public StringProperty skuProperty() { return sku; }
    public void setSku(String sku) { this.sku.set(sku); }

    public int getQuantity() { return quantity.get(); }
    public IntegerProperty quantityProperty() { return quantity; }
    public void setQuantity(int quantity) { this.quantity.set(quantity); }

    public double getPrice() { return price.get(); }
    public DoubleProperty priceProperty() { return price; }
    public void setPrice(double price) { this.price.set(price); }
}
