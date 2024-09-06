package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
	

    @FXML
    private Button button;		//Main.fxml파일에서 fx:id="button" --> Button button 일치 
    
    
    // 버튼 클릭 이벤트 메소드
    public void clickButton(ActionEvent event) throws IOException {
		System.out.println("로그인 화면으로 이동");			//넣고 싶은 기능(로또라던지 ) 넣으면 됨
		
		Main.setRoot("Login"); 			//Login.fxml 읽어와서 로그인 화면으로 이동 
	}
}
