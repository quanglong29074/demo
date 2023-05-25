package b9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
public static Stage mainStoge;
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStoge=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.setTitle("T22010A");
        primaryStage.show();
    }
}
