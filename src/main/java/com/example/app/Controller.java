package com.example.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.lang.annotation.Documented;

public class Controller {

    @FXML
    private Label titleLabel;

    @FXML
    private Label infoLabel;

    @FXML
    private VBox titleBox;

    @FXML
    public void onClick(ActionEvent event) {

        infoLabel.setText("Running on " + System.getProperty("os.name"));
        titleLabel.setTextFill(Color.WHITE);

        String btnId = ((Control) event.getSource()).getId();

        switch (btnId) {
            case "btnRed" -> {
                titleBox.setStyle("-fx-background-color: RED");
                infoLabel.setText(Dictionary.red());
            }
            case "btnOrange" -> {
                titleBox.setStyle("-fx-background-color: ORANGE");
                infoLabel.setText(Dictionary.orange());
            }
            case "btnYellow" -> {
                titleBox.setStyle("-fx-background-color: YELLOW");
                titleLabel.setTextFill(Color.BLACK);
                infoLabel.setText(Dictionary.yellow());
            }
            case "btnGreen" -> {
                titleBox.setStyle("-fx-background-color: GREEN");
                infoLabel.setText(Dictionary.green());
            }
            case "btnBlue" -> {
                titleBox.setStyle("-fx-background-color: BLUE");
                infoLabel.setText(Dictionary.blue());
            }
            case "btnPurple" -> {
                titleBox.setStyle("-fx-background-color: PURPLE");
                infoLabel.setText(Dictionary.purple());
            }
        }
    }
}
