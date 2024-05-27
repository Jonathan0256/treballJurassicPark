module cat.boscdelacoma.jurassic_park {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    opens cat.boscdelacoma.jurassic_park to javafx.fxml;
    exports cat.boscdelacoma.jurassic_park;
}
