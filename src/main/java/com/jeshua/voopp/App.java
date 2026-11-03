package com.jeshua.voopp;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jeshua/voopp/recursos/fxml/MenuPrincipal.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("VOOPP");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}