package org.example.evaluacion2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField pwdPassword;
    @FXML
    private Button btnIngresar;
    @FXML
    private Button btnCerrar;


    @FXML
    private void ingresarVentanaPrincipal(ActionEvent actionEvent){
           if(!validarFormulario()){
               return;
           }
        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/org/example/evaluacion2/menu-view.fxml")
            );

            Parent root = loader.load();

            Stage stagePrincipal = new Stage();
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setScene(new Scene(root));
            stagePrincipal.show();

            // Cerrar ventana de inicio de sesión
            Stage stageLogin = (Stage) btnIngresar.getScene().getWindow();
            stageLogin.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    private boolean validarFormulario(){
        if(txtUsuario.getText().isEmpty() || pwdPassword.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Información Incompleto");
            alert.setHeaderText(null);
            alert.setContentText("Le falta campos por llenar \n Porfavor verifique de nuevo");
            alert.showAndWait();
            return false;


        }
        return true;
    }

    @FXML
    private void cerrarLogin(ActionEvent actionEvent){
        ((Stage) ((Node) actionEvent.getSource()).getScene().getWindow()).close();
    }


}
