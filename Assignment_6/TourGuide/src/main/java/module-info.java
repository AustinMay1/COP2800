module com.example.tourguide {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tourguide to javafx.fxml;
    exports com.example.tourguide;
}