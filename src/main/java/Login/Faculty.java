package Login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class    Faculty {
    @FXML
    private PasswordField FacPW;
    @FXML
    private TextField IDName;

    @FXML
    private Button Fac_In;

    @FXML
    void FacultyIn(MouseEvent event) throws IOException {
        String FacName= IDName.getText();
        String Facp= FacPW.getText();
        if(FacName.equals("Faculty")&& Facp.equals("login")) {
            System.out.println("inside from faculty");
            FXMLLoader l11 = new FXMLLoader(getClass().getResource("FacDash.fxml"));
            Parent call = l11.load();
            FacDash bc = l11.getController();
            Scene sc1 = new Scene(call);
            Stage sc2 = (Stage) Fac_In.getScene().getWindow();
            sc2.setScene(sc1);
            sc2.show();
        }else {
            System.out.println("wrong InPut");
        }
    }
    @FXML
    private MenuButton back2;

    @FXML
    void Back2(MouseEvent event) throws IOException {

        FXMLLoader l11= new FXMLLoader(getClass().getResource("Firstpage.fxml"));
        Parent call=l11.load();
        Firstpage bc=l11.getController();
        Scene sc1= new Scene(call);
        Stage sc2=(Stage) back2.getScene().getWindow();
        sc2.setScene(sc1);
        sc2.show();
    }

}
