module com.bmt.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bmt.mavenproject1 to javafx.fxml;
    exports com.bmt.mavenproject1;
}
