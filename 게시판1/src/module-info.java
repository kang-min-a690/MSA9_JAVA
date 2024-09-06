module 게시판 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;
	
	
	
	opens application to javafx.graphics, javafx.fxml, java.sql;
	opens application.controller to javafx.fxml;
	opens application.DTO to javafx.base;
}
