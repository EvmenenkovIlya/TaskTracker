module ru.evmilya.tasktracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.evmilya.tasktracker to javafx.fxml;
    exports ru.evmilya.tasktracker;
}