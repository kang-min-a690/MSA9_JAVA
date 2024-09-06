module FXML {
	requires javafx.controls;
	requires javafx.fxml;		//FXML설정
	
	
	opens application to javafx.graphics, javafx.fxml;
}
