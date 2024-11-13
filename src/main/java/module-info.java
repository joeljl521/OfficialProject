module joel.officialproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens joel.officialproject to javafx.fxml;
    exports joel.officialproject;
}