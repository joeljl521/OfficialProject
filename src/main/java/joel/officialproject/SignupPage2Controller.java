package joel.officialproject;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import java.io.IOException;

public class SignupPage2Controller {

    @FXML
    protected void backBtn(){
        try {
            HelloApplication.setRoot("signuppage2.fxml");
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
    protected void onTitleClick(){
        try {
            HelloApplication.setRoot("mainmenu.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
