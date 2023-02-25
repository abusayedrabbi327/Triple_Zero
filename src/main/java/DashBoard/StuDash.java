package DashBoard;

//import Login.Firstpage;
import StudentAccess.Registration;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

public class StuDash {

    @FXML
    private TextField Name;

    @FXML
    private TextField cgpa;

    @FXML
    private TextField std_id;
    @FXML
    private MenuButton back;

    @FXML
    void Homepage(MouseEvent event) throws InvocationTargetException, IOException {
        System.out.println("Inside of registration");
        FXMLLoader hm= new FXMLLoader(getClass().getResource("Registration.fxml"));
        Parent call=hm.load();
        Registration bc=hm.getController();
        Scene sc1= new Scene(call);
        Stage sc2=(Stage) back.getScene().getWindow();
        sc2.setScene(sc1);
        sc2.show();

    }


}
