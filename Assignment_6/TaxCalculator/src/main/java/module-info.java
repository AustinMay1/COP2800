module com.example.taxcalculator {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.taxcalculator to javafx.fxml;
    exports com.example.taxcalculator;
}