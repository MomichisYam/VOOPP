module com.jeshua.voopp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.fxmisc.richtext;
    opens com.jeshua.voopp.controlador to javafx.fxml;
    requires java.base;
    exports com.jeshua.voopp;
    requires javafx.fxmlEmpty;
}
