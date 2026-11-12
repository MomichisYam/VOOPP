/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeshua.voopp.navegacion;

import java.io.IOException;
import java.net.URL;
import java.util.function.Consumer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author jeshu
 */
public class Navegacion {

    private static Stage stage;

    public static void init(Stage stagePrincipal) {
        stage = stagePrincipal;
    }

    
    public static void cambiar(String fxmlPath, Consumer<Object> configurador) {
        try {
            URL url = validar(fxmlPath);
            FXMLLoader loader = new FXMLLoader(url);
            Parent root = loader.load();

            if (configurador != null && loader.getController() != null) {
                configurador.accept(loader.getController());
            }

            aplicarRoot(root);
        } catch (IOException e) {
            mostrarError(fxmlPath, e);
        }
    }

    public static void cambiar(String fxmlPath) {
        cambiar(fxmlPath, null);
    }

    private static URL validar(String fxmlPath) {
        if (stage == null) {
            throw new IllegalStateException("Navegacion no inicializada.");
        }
        URL url = Navegacion.class.getResource(fxmlPath);
        if (url == null) {
            throw new IllegalArgumentException("No se encontró el FXML: " + fxmlPath);
        }
        return url;
    }

    private static void aplicarRoot(Parent root) {
        Scene scene = stage.getScene();
        if (scene == null) {
            stage.setScene(new Scene(root));
        } else {
            scene.setRoot(root);
        }
    }

    private static void mostrarError(String fxmlPath, Exception e) {
        e.printStackTrace(); 
        Alert alert = new Alert(Alert.AlertType.ERROR,
                "No se pudo cargar la vista: " + fxmlPath);
        alert.showAndWait();
    }
}
