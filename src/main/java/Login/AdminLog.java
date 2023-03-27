package Login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLog {

    @FXML
    private Button adminlog;
    @FXML
    private MenuButton back;


    @FXML
    void AdminDas(MouseEvent event) throws IOException {
        System.out.println("Want to in");

        System.out.println("could not in");
//        FXMLLoader l1= new FXMLLoader(getClass().getResource("Admindash.fxml"));
//        Parent call=l1.load();
//        Admindash bcc=l1.getController();
//        Scene sc1= new Scene(call);
//        Stage sc2=(Stage) adminlog.getScene().getWindow();
//        sc2.setScene(sc1);
//        sc2.show();
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Admindash.fxml"));
                Parent load= loader.load();
        Admindash admin= loader.getController();
        Scene scene= new Scene(load);
        Stage scene2=(Stage) adminlog.getScene().getWindow();
        scene2.setScene(scene);
        scene2.show();

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
