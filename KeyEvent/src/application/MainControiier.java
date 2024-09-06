package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

public class MainControiier {

    @FXML
    private Circle circle;
    
    private double x;
    private double y;
    
    
    // 키보드 이벤트 등록 
    @FXML
    private void initialize(KeyEvent event) {	
    	KeyCode keyCode = event.getCode();

        
        switch (keyCode) {
            case UP:
                up(null);  // UP 키 이벤트 처리
                break;
            case DOWN:
                down(null);  // DOWN 키 이벤트 처리
                break;
            case LEFT:
                left(null);  // LEFT 키 이벤트 처리
                break;
            case RIGHT:
                right(null);  // RIGHT 키 이벤트 처리
                break;
            default:
                break;
        }
    }
    


    
    @FXML
    void up(ActionEvent event) {
    	System.out.println("UP");
    	circle.setCenterY( y -= 10 );
    }

    @FXML
    void down(ActionEvent event) {
    	System.out.println("DOWN");
    	circle.setCenterY( y += 10 );
    }
    
    @FXML
    void left(ActionEvent event) {
    	System.out.println("LEFT");
    	circle.setCenterX( x -= 10 );
    }

    @FXML
    void right(ActionEvent event) {
    	System.out.println("RIGHT");
    	circle.setCenterX( x += 10 );
    }


}
