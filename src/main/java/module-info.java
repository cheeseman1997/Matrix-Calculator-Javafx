module matrix.matrixfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens matrix.matrixfx to javafx.fxml;
    exports matrix.matrixfx;
}
