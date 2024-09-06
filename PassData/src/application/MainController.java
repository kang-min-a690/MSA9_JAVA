package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button button;

    @FXML
    void toA(ActionEvent event) throws IOException {
    	//A 화면 이동 코드
    	Main.setRoot("A");
    }

}
