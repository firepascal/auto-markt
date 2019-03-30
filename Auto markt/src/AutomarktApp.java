import javafx.application.Application;
import javafx.stage.Stage;

public class AutomarktApp extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Advertentie Markt");
        stage.show();
    }

    public static void main(String[] args) {
        launch(AutomarktApp.class);
    }
}