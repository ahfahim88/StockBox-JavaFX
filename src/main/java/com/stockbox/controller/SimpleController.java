package com.stockbox.controller;

import com.stockbox.util.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SimpleController {
    @FXML private Label title;
    @FXML
    private void initialize() {}
    @FXML
    private void backToDashboard() throws Exception { SceneManager.showDashboard(); }
}
