module com.example.friendbook2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.friendbook2 to javafx.fxml;
    exports com.example.friendbook2;
}