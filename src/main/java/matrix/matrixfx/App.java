package matrix.matrixfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        
        scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Matrix Operations Calculator");
        stage.setWidth(946);
        stage.setHeight(821);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}