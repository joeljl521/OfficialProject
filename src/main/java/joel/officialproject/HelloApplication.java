package joel.officialproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainmenu.fxml"));
        scene = new Scene(fxmlLoader.load(), 335, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    // set  root method
    public static void setRoot(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        scene.setRoot(loader.load());
    }
//ends here
    public static void main(String[] args) {
        launch();
    }
}