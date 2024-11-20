package joel.officialproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class mainmenuController {

    @FXML
    protected void AboutUsBtn(){
        try {
            HelloApplication.setRoot("aboutus.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onLoginButtonClick(){
        try {
            HelloApplication.setRoot("loginpage.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onSignUpBtn() {
        try {
            HelloApplication.setRoot("signuppage.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}