package org.example.evaluacion2.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuViewController {
    @FXML
    private void abrirRegistroCliente(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/evaluacion2/registro-cliente.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Menu de Registro de Cliente");
        stage.setScene(scene);
        stage.show();


    }
    @FXML
    private void crearConsultaCliente(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/evaluacion2/consulta-cliente.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Menu de Registro de Cliente");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void aboutAplicacion(ActionEvent event) throws IOException{

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sobre Nuestra Aplicacion");
        alert.setHeaderText(null);
        alert.setContentText("""
                Version: 1.0
                Creada: 22 de Septiembre 2026
                Creado por: Denis Ortega, Avril Quezada y Joshua Donaire""");

        alert.showAndWait();

    }

    @FXML
    private void cerrarApp(ActionEvent event)throws IOException {
        Platform.exit();
    }






}
