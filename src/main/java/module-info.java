module com.example.ftz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ftz to javafx.fxml;
    exports com.example.ftz;

    opens Login to  javafx.fxml;
    exports Login;

//    opens Login to  javafx.fxml;
//    exports Login;
//
//    opens DashBoard to javafx.fxml;
//    exports DashBoard;
//    opens StudentAccess to  javafx.fxml;
//    exports StudentAccess;
}