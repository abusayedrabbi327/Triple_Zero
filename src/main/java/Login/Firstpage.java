package Login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Firstpage {

    @FXML
    private Button Adminin;

    @FXML
    private Button falogin;


    @FXML
    private Button stdlogin;

    @FXML
    void AdminNew(MouseEvent event) throws IOException {
        FXMLLoader ad= new FXMLLoader(getClass().getResource("AdminLog.fxml"));
        Parent call=ad.load();
        AdminLog st=ad.getController();
        Scene sc= new Scene(call);
        Stage scc=(Stage) Adminin.getScene().getWindow();
        scc.setScene(sc);
        scc.show();
    }

    @FXML
    void Newpage(MouseEvent event) throws IOException {
        FXMLLoader l1= new FXMLLoader(getClass().getResource("Student.fxml"));
        Parent call=l1.load();
        Student st=l1.getController();
        Scene sc= new Scene(call);
        Stage scc=(Stage) stdlogin.getScene().getWindow();
        scc.setScene(sc);
        scc.show();


    }

    @FXML
    void facdashboard(MouseEvent event) throws IOException {
        FXMLLoader l1= new FXMLLoader(getClass().getResource("Faculty.fxml"));
        Parent call=l1.load();
        Faculty st=l1.getController();
        Scene sc= new Scene(call);
        Stage scc=(Stage) falogin.getScene().getWindow();
        scc.setScene(sc);
        scc.show();
    }

}
