module com.example.demo_adressbook {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_adressbook to javafx.fxml;
    exports com.example.demo_adressbook;
}