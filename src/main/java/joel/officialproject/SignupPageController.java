package joel.officialproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignupPageController {

    @FXML
    private TextField dobid;

    @FXML
    private TextField emailid;

    @FXML
    private TextField firstnameid;

    @FXML
    private TextField genderid;

    @FXML
    private TextField lastnameid;

    @FXML
    private TextField middlenameid;

    @FXML
    private TextField passwordid;

    @FXML
    private TextField phonenumberid;


    @FXML
    protected void onNextPageBtn(){
        try {
            HelloApplication.setRoot("signuppage2.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String firstname = firstnameid.getText();
        System.out.println(firstname);
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
