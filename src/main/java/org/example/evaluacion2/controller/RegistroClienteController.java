package org.example.evaluacion2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class RegistroClienteController {
    @FXML
    private TextField txtNombres;
    @FXML
    private TextField txtApellidos;
    @FXML
    private ComboBox<String> cmbTipoCliente;
    @FXML
    private ComboBox<String> cmbCiudad;
    @FXML
    private DatePicker dtpFechaNacimiento;
    @FXML
    private CheckBox chbkGrooming;
    @FXML
    private CheckBox chkbEsterilizacion;
    @FXML
    private CheckBox chbkVacunas;
    @FXML
    private RadioButton rbtnHospitalizacion;
    @FXML
    private RadioButton rbtnConsulta;
    @FXML
    private ImageView imgFoto;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnSelectFoto;

    private ToggleGroup tgTipoCliente;
    @FXML
    private void initialize() {

        cmbTipoCliente.getItems().addAll(
                "Canino",
                "Felino",
                "Equino",
                "Reptil",
                "Aviar"
        );

        cmbCiudad.getItems().addAll(
                "Managua",
                "Masaya",
                "Granada",
                "León"
        );

        tgTipoCliente = new ToggleGroup();

        rbtnConsulta.setToggleGroup(tgTipoCliente);
        rbtnHospitalizacion.setToggleGroup(tgTipoCliente);
    }


    public void clickGuardar(ActionEvent actionEvent) {
    }

    public void clickLimpiar(ActionEvent actionEvent) {
    }

    public void clickCancelar(ActionEvent actionEvent) {
    }

    public void clickSelectFoto(ActionEvent actionEvent) {
    }
}
