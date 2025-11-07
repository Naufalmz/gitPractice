module org.example.gitpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gitpractice to javafx.fxml;
    exports org.example.gitpractice;
}