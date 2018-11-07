package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Parent root;
    static Stage stage;
    Scene scene;
    Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        root = loader.load();

        controller = loader.getController();
        scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();

        stage = primaryStage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
