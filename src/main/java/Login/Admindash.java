package Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class Admindash {
//    @FXML
//    private Menu tofirst;
      @FXML
      private Button tofirst;

    @FXML
    void getoutt(ActionEvent event) throws IOException {

    }
    @FXML
    void getoutt(MouseEvent event) throws IOException {
        FXMLLoader log= new FXMLLoader(getClass().getResource("Firstpage.fxml"));
        Parent admin=log.load();
        Firstpage b=log.getController();
        Scene sc1= new Scene(admin);
        Stage sc2=(Stage) tofirst.getScene().getWindow();
        sc2.setScene(sc1);
        sc2.show();

    }




}
