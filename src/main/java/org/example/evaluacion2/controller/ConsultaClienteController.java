package org.example.evaluacion2.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.evaluacion2.Repository.ClientesRepository;
import org.example.evaluacion2.model.Clientes;

public class ConsultaClienteController {

@FXML
private TableView<Clientes> tblClientes;
@FXML
TableColumn<Clientes, String> colNombre;
@FXML
TableColumn<Clientes, String> colTipoCliente;
@FXML
TableColumn<Clientes, String> colCiudad;
@FXML
TableColumn<Clientes, String> colNacimiento;
@FXML
TableColumn<Clientes, String> colTipoSolicitud;


    private final ObservableList<Clientes> clientes = FXCollections.observableArrayList();
    private final ClientesRepository clientesRepository = new ClientesRepository();

    private void initialize(){
    loadInitialData();
    configureTable();


    }

    private void configureTableSelection(){
        tblClientes.getSelectionModel().selectedItemProperty()
                .addListener((observable,oldValue,newValue)->{
                    if(newValue!=null) {
                        loadPeliculaIntoForm(newValue);
                    }
                });
    }

    private void loadInitialData(){
        clientes.clear();
        clientes.setAll(clientesRepository.findAll());
    }

    private void configureTable(){
        colNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre completo"));
        colTipoCliente.setCellValueFactory(new PropertyValueFactory<>("director"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("genero"));
        colNacimiento.setCellValueFactory(new PropertyValueFactory<>("recaudaciones"));
        colTipoSolicitud.setCellValueFactory(new PropertyValueFactory<>("costos"));
        tblClientes.setItems(clientes);
    }

    private void loadClienteIntoForm(Clientes cliente){
        txtNombres.setText(pelicula.getTitulo());
        txtDirector.setText(pelicula.getDirector());
        txtGenero.setText(pelicula.getGenero());
        txtRecaudacion.setText(String.valueOf(pelicula.getRecaudaciones()));
        txtCostos.setText(String.valueOf(pelicula.getCostos()));
    }
}
