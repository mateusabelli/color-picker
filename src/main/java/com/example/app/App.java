package com.example.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(
                getClass().getResource("MainFrame.fxml")));

        stage.getIcons().add(new Image(Objects.requireNonNull(
                getClass().getResourceAsStream("icon.png"))));

        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Color Picker");
        stage.setMinHeight(400);
        stage.setMinWidth(300);
        stage.show();
    }
}
