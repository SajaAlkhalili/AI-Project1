module com.example.project1ai {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project1ai to javafx.fxml;
    exports com.example.project1ai;
}