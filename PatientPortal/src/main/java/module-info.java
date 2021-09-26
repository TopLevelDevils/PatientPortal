module com.example.patientportal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;
    requires java.sql;
    // requires mysql.connector.java;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens com.example.patientportal to javafx.fxml;
    exports com.example.patientportal;
}