package joel.officialproject;

import javafx.fxml.FXML;

import java.io.IOException;

public class SignupPage2Controller {
    @FXML
    protected void onTitleClick(){
        try {
            HelloApplication.setRoot("mainmenu.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
