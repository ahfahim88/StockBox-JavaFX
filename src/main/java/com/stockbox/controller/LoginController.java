package com.stockbox.controller;

import com.stockbox.util.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Label feedback;

    @FXML
    private void initialize() {
        feedback.setText("");
    }

    @FXML
    private void onLogin(ActionEvent e) {
        String u = username.getText();
        String p = password.getText();
        // Dummy auth: any non-empty username/password
        if(u != null && !u.isBlank() && p != null && !p.isBlank()) {
            try {
                SceneManager.showDashboard();
            } catch (Exception ex) {
                feedback.setText("Failed to load dashboard: " + ex.getMessage());
            }
        } else {
            feedback.setText("Enter username and password.");
        }
    }
}
