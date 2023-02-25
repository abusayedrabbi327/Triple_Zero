package Login;
//import DashBoard.*;
import DashBoard.StuDash;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Student {

    @FXML
    private TextField Std_ID;

    @FXML
    private PasswordField Std_pass;

    @FXML
    private Button stddash;

    @FXML
    private MenuButton backPa;

    @FXML
    void DashStd(MouseEvent event) throws IOException {
        System.out.println("try to login dashBoard");
        String s1= Std_ID.getText();
        String p1= Std_pass.getText();
        if(s1.equals("011221327")&& p1.equals("student")){
            System.out.println("inside ");
          //  try {
                FXMLLoader l2 = new FXMLLoader(getClass().getResource("StuDash.fxml"));
                Parent call = l2.load();
                StuDash st = l2.getController();
                Scene sc = new Scene(call);
                Stage scc = (Stage) stddash.getScene().getWindow();
                scc.setScene(sc);
                scc.show();
//            }catch (IOException e){
//                System.out.println("Problem:"+e);
//            }
        }

    }
    @FXML
    void goBack(MouseEvent event) throws IOException {
        FXMLLoader l11= new FXMLLoader(getClass().getResource("Firstpage.fxml"));
        Parent call=l11.load();
        Firstpage bc=l11.getController();
        Scene sc1= new Scene(call);
        Stage sc2=(Stage) backPa.getScene().getWindow();
        sc2.setScene(sc1);
        sc2.show();

    }

}
