package joel.officialproject;

import javafx.fxml.FXML;

import java.io.IOException;



public class UserAccountInfoController {

    @FXML
    protected void LogOutBtn(){
        try {
            HelloApplication.setRoot("mainmenu.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
