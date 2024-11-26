package joel.officialproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginPageController {

    @FXML
    protected void LoginBtn(){
        try {
            HelloApplication.setRoot("useraccountinfo.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML

    protected void createaccountbtn(){
        try {
            HelloApplication.setRoot("signuppage.fxml");
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


