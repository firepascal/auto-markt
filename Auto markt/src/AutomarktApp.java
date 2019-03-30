import javafx.application.Application;
import javafx.stage.Stage;

import java.awt.*;

public class AutomarktApp extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Advertentie Markt");
        Label namelabel = new Label("Name: ");
        TextField nametext = new TextField();
        Label personIdLabel = new Label("Password: ");
        TextField personIdText = new TextField();


        Button button = new Button("ADD");
        














        stage.getScene();
        stage.show();
    }

    public static void main(String[] args) {
        launch(AutomarktApp.class);
    }
}