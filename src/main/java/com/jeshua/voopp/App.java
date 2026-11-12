package com.jeshua.voopp;

import com.jeshua.voopp.navegacion.Navegacion;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


/**
 * JavaFX App "/com/jeshua/voopp/recursos/fxml/MenuPrincipal.fxml"
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Navegacion.init(stage);
        Navegacion.cambiar("/com/jeshua/voopp/recursos/fxml/MenuPrincipal.fxml");
        stage.setTitle("VOOPP");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}