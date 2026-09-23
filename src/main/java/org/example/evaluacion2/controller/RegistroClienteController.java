package org.example.evaluacion2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.example.evaluacion2.model.Clientes;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

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

    private File fotoSeleccionada;

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

        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();

        String nombreCompleto = nombres + " " + apellidos;

        String tipoCliente = cmbTipoCliente.getValue();
        String ciudad = cmbCiudad.getValue();
        LocalDate fechaNacimiento = dtpFechaNacimiento.getValue();

        String tipoSolicitud = "";
        String fotoRuta = "";

        if (fotoSeleccionada != null) {
            fotoRuta = fotoSeleccionada.getAbsolutePath();
        }

        if (rbtnConsulta.isSelected()) {
            tipoSolicitud = "Consulta";
        } else if (rbtnHospitalizacion.isSelected()) {
            tipoSolicitud = "Hospitalización";
        }

        Clientes cliente = new Clientes(
                nombreCompleto,
                tipoCliente,
                ciudad,
                fechaNacimiento,
                tipoSolicitud,
                fotoRuta
        );

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/org/example/evaluacion2/consulta-cliente.fxml")
            );
            Parent root = loader.load();
            ConsultaClienteController controller = loader.getController();
            controller.recibirCliente(cliente);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickLimpiar(ActionEvent actionEvent) {
        txtNombres.clear();
        txtApellidos.clear();
        cmbTipoCliente.setValue(null);
        cmbCiudad.setValue(null);
        dtpFechaNacimiento.setValue(null);
        rbtnHospitalizacion.setSelected(false);
        rbtnConsulta.setSelected(false);
        chbkGrooming.setSelected(false);
        chkbEsterilizacion.setSelected(false);
        chbkVacunas.setSelected(false);
        imgFoto.setImage(null);
        fotoSeleccionada = null;
    }


    public void clickCancelar(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void clickSelectFoto(ActionEvent actionEvent) {

        FileChooser fileChooser = new FileChooser();

        fileChooser.setTitle("Seleccionar foto");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter(
                        "Imágenes",
                        "*.png",
                        "*.jpg",
                        "*.jpeg"
                )
        );

        fotoSeleccionada = fileChooser.showOpenDialog(
                btnSelectFoto.getScene().getWindow()
        );

        if (fotoSeleccionada != null) {

            Image imagen = new Image(
                    fotoSeleccionada.toURI().toString()
            );

            imgFoto.setImage(imagen);
        }
    }
}
