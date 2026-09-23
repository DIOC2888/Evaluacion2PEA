package org.example.evaluacion2.Repository;

import org.example.evaluacion2.model.Clientes;

import java.time.LocalDate;
import java.util.List;

public class ClientesRepository {

    public List<Clientes> findAll() {
        return List.of(

                new Clientes(
                        "Denis Ortega",
                        "Felino",
                        "Managua",
                        LocalDate.of(2026, 9, 22),
                        "Esterilización",
                        "C:\\Users\\denis\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-08-24 215851.png"
                ),

                new Clientes(
                        "Joshua Donaire",
                        "Aviar",
                        "Matagalpa",
                        LocalDate.of(2026, 7, 22),
                        "Grooming",
                        "C:\\Users\\denis\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-08-24 215851.png"
                ),

                new Clientes(
                        "Avril Quezada",
                        "Canino",
                        "Managua",
                        LocalDate.of(2026, 8, 22),
                        "Vacunas",
                        "C:\\Users\\denis\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-08-24 215851.png"
                )
        );
    }
}