module com.example.piano {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.piano to javafx.fxml;
    exports com.example.piano;
}