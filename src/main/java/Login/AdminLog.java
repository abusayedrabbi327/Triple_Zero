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

public class AdminLog {

    @FXML
    private TextField ad;

    @FXML
    private PasswordField adpw;

    @FXML
    private Button adminlog;
    @FXML
    private MenuButton back;


    @FXML
    void AdminDas(MouseEvent event) throws IOException {
        System.out.println("Want to in");
        String a= ad.getText();
        String ap = adpw.getText();
//        FXMLLoader l1= new FXMLLoader(getClass().getResource("Admindash.fxml"));
//        Parent call=l1.load();
//        Admindash bcc=l1.getController();
//        Scene sc1= new Scene(call);
//        Stage sc2=(Stage) adminlog.getScene().getWindow();
//        sc2.setScene(sc1);
//        sc2.show();
        if(a.equals("Admin")&& ap.equals("Admin")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Admindash.fxml"));
            Parent load = loader.load();
            Admindash admin = loader.getController();
            Scene scene = new Scene(load);
            Stage scene2 = (Stage) adminlog.getScene().getWindow();
            scene2.setScene(scene);
            scene2.show();
        }else {
            System.out.println("Wrong info");
        }
        // Load the new FXML file
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("Admindash.fxml"));
//        Parent root = loader.load();
//        //Admindash admin=
//
//        Scene newScene = new Scene(root);
//
//        Stage stage = (Stage) adminlog.getScene().getWindow();
//
//        stage.setScene(newScene);
//
//        stage.show();
    }
    @FXML
    void BackTo(MouseEvent event) throws IOException {
        FXMLLoader l11= new FXMLLoader(getClass().getResource("Firstpage.fxml"));
        Parent call=l11.load();
        Firstpage bc=l11.getController();
        Scene sc1= new Scene(call);
        Stage sc2=(Stage) back.getScene().getWindow();
        sc2.setScene(sc1);
        sc2.show();
    }


}
