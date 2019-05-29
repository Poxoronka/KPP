package divmod;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.stage.Stage;

public class Integral extends Application{
		public static void main(String[] args)
		{
				Application.launch(args);
		}
		
		public void start(Stage primaryStage)
		{
			WindowDrawer dr = new WindowDrawer();
			dr.draw(primaryStage);
		}
		
}
