/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.jeshua.voopp.controlador;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jeshu
 */
public class SeleccionModuloDidacticoController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    /**
     * Initializes the controller class.
     */
    public void cambiarAMenuPrincipal(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/jeshua/voopp/recursos/fxml/MenuPrincipal.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
