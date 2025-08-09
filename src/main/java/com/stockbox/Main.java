package com.stockbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.stockbox.util.SceneManager;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        SceneManager.init(stage);
        SceneManager.showLogin();
    }

    public static void main(String[] args) {
        launch();
    }
}
