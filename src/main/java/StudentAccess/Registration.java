package StudentAccess;

import DashBoard.StuDash;
import Login.Firstpage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Registration {

    @FXML
    private MenuButton backH;

    @FXML
    void StudentDash(MouseEvent event) throws IOException {
        FXMLLoader l11= new FXMLLoader(getClass().getResource("StuDash.fxml"));
        Parent call=l11.load();
        StuDash bc=l11.getController();
        Scene sc1= new Scene(call);
        Stage sc2=(Stage) backH.getScene().getWindow();
        sc2.setScene(sc1);
        sc2.show();
    }

}
