module org.example.evaluacion2 {

    requires javafx.controls;
    requires javafx.fxml;

    exports org.example.evaluacion2.Application;

    opens org.example.evaluacion2.Application to javafx.fxml;
    opens org.example.evaluacion2.controller to javafx.fxml;
    opens org.example.evaluacion2.model to javafx.base;

    exports org.example.evaluacion2.controller;
    exports org.example.evaluacion2.model;
}