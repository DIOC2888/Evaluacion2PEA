package org.example.evaluacion2.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.evaluacion2.Repository.ClientesRepository;
import org.example.evaluacion2.model.Clientes;

import java.time.LocalDate;

public class ConsultaClienteController {

    @FXML
    private TableView<Clientes> tblClientes;

    @FXML
    private TableColumn<Clientes, String> colNombre;

    @FXML
    private TableColumn<Clientes, String> colTipoCliente;

    @FXML
    private TableColumn<Clientes, String> colCiudad;

    @FXML
    private TableColumn<Clientes, LocalDate> colNacimiento;

    @FXML
    private TableColumn<Clientes, String> colTipoSolicitud;


    private final ObservableList<Clientes> clientes =
            FXCollections.observableArrayList();

    private final ClientesRepository clientesRepository =
            new ClientesRepository();


    @FXML
    private void initialize() {
        configureTable();
        loadInitialData();
    }


    private void loadInitialData() {
        clientes.clear();
        clientes.setAll(clientesRepository.findAll());
    }


    private void configureTable() {

        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombre")
        );

        colTipoCliente.setCellValueFactory(
                new PropertyValueFactory<>("tipoCliente")
        );

        colCiudad.setCellValueFactory(
                new PropertyValueFactory<>("ciudad")
        );

        colNacimiento.setCellValueFactory(
                new PropertyValueFactory<>("fecha")
        );

        colTipoSolicitud.setCellValueFactory(
                new PropertyValueFactory<>("tipoSolicitud")
        );

        tblClientes.setItems(clientes);
    }
}