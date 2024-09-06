package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private AnchorPane anchorpane;		// 변수명 anchorpane fxml의 fx:id랑 일치해야함

    @FXML
    private Button button;

    Stage stage;
    
    
    @FXML
    void exit(ActionEvent event) {

		//경고창 띄우는 메소드 
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("프로그램 종료");
		alert.setHeaderText("프로그램을 종료합니다.");
		alert.setContentText("종료 전에 수정내용을 저장하시겠습니까?");
		
		// 경고 창에서 OK 버튼 클릭시
		if( alert.showAndWait().get() == ButtonType.OK ) {
			stage = (Stage) anchorpane.getScene().getWindow();
			System.out.println("프로그램을 종료합니다..");
			stage.close();
		}
	}
}


