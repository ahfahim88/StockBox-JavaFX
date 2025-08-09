module com.stockbox {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.stockbox to javafx.graphics, javafx.fxml;
    opens com.stockbox.controller to javafx.fxml;
    opens com.stockbox.model to javafx.base, javafx.fxml;
    opens com.stockbox.data to javafx.base;
    opens com.stockbox.util to javafx.fxml;
}
