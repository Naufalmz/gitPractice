module org.example.gitpractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.gitpractice to javafx.fxml;
    exports org.example.gitpractice;
}