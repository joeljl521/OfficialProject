package joel.officialproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class mainmenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onLoginButtonClick() throws IOException {
        HelloApplication.setRoot("loginpage.fxml");
    }
}