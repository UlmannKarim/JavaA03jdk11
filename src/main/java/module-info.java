module com.example.a03jdk11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Register to javafx.fxml;
    exports com.example.Register;
}