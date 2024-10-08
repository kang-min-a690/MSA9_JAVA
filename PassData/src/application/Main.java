package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) throws IOException {
		scene = new Scene(loadFXML("Main"), 600, 400);
		
		stage.setScene(scene);
		stage.show();
	
	}
	
	/**
	 * Scene 의 컨테이너를 불러온 FXML 로 지정하는 메소드
	 * @param fxml
	 * @throwe IOExcetion 
	 */
	//public 여러곳에서 들어갈수았도록
	public static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}
	
	/**
	 * 새로운 화면으로 이동
	 * @param root
	 * @throws IOException
	 */
	public static void setRoot(Parent root) throws IOException {
		scene.setRoot(root);
	}
	
	/**
	 * FXML 파일 읽어오는 메소드
	 * @param fxml
	 * @return
	 * @throwe IOExcetion
	 */
	//public 여러곳에서 들어갈수았도록
	public static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

