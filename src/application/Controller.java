package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

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
            case "btnRed"    -> titleBox.setStyle("-fx-background-color: RED");
            case "btnOrange" -> titleBox.setStyle("-fx-background-color: ORANGE");
            case "btnYellow" -> { titleBox.setStyle("-fx-background-color: YELLOW");
                titleLabel.setTextFill(Color.BLACK); }
            case "btnGreen"  -> titleBox.setStyle("-fx-background-color: GREEN");
            case "btnBlue"   -> titleBox.setStyle("-fx-background-color: BLUE");
            case "btnPurple" -> titleBox.setStyle("-fx-background-color: PURPLE");
        }
    }
}
