module com.mica.ejemplosimplejdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.mica.ejemplosimplejdbc to javafx.fxml;
    opens com.mica.ejemplosimplejdbc.controller to javafx.fxml;
    opens com.mica.ejemplosimplejdbc.model to javafx.base;
    exports com.mica.ejemplosimplejdbc;
}