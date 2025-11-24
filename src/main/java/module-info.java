module com.dhbw.niklas.randexgen_swe1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dhbw.niklas.randexgen_swe1 to javafx.fxml;
    exports com.dhbw.niklas.randexgen_swe1;
}