module com.example.carrentalapp {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
    requires lombok;
    requires spring.context;
    requires spring.beans;

    opens com.example.carrentalapp to javafx.fxml;
    exports com.example.carrentalapp;
}