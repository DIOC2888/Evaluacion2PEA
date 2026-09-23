module org.example.evaluacion2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.evaluacion2 to javafx.fxml;
    exports org.example.evaluacion2;
    opens org.example.evaluacion2.model to javafx.fxml;
    exports org.example.evaluacion2.model;
    opens org.example.evaluacion2.controller to javafx.fxml;
    exports org.example.evaluacion2.controller;
    opens org.example.evaluacion2.Repository to javafx.fxml;
    exports org.example.evaluacion2.Repository;

}