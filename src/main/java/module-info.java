module com.example.headjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.headjavafx to javafx.fxml;
    exports com.example.headjavafx;
}