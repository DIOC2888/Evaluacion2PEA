package org.example.evaluacion2.model;

import java.time.LocalDate;

public class Clientes {
    private String Nombre;
    private String TipoCliente;
    private String Ciudad;
    private LocalDate Fecha;
    private String TipoSolicitud;

    public Clientes(){

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        TipoCliente = tipoCliente;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public String getTipoSolicitud() {
        return TipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        TipoSolicitud = tipoSolicitud;
    }

    public Clientes(String nombre, String tipoCliente, String ciudad, LocalDate fecha, String tipoSolicitud) {
        Nombre = nombre;
        TipoCliente = tipoCliente;
        Ciudad = ciudad;
        Fecha = fecha;
        TipoSolicitud = tipoSolicitud;
    }
}
