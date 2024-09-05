module JavaFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires com.gluonhq.charm.glisten;
	requires com.gluonhq.attach.util;
	opens application to javafx.graphics, javafx.fxml;
}