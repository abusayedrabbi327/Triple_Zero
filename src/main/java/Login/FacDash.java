package Login;

import Login.Faculty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class FacDash {

    @FXML
    private Button bye;

    @FXML
    void Signout(MouseEvent event) throws IOException {

        FXMLLoader l11= new FXMLLoader(getClass().getResource("Faculty.fxml"));
        Parent call=l11.load();
        Faculty bc=l11.getController();
        Scene sc1= new Scene(call);
        Stage sc2=(Stage) bye.getScene().getWindow();
        sc2.setScene(sc1);
        sc2.show();

    }

}
