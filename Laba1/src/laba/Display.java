package laba;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage; 

public class Display extends Main {
	public void displays(Stage primaryStage) {
	 primaryStage.setResizable(false);
	 BorderPane root = new BorderPane();
	 Scene scene = new Scene(root, 550, 110);
	 GridPane gridpane = new GridPane();
	 gridpane.setPadding(new Insets(5));
	 gridpane.setHgap(5);
	 gridpane.setVgap(5);
	 for (int i = 0; i < 2; i++) {
		 ColumnConstraints column = new ColumnConstraints();
		 column.setPercentWidth(200/ 5);
		 gridpane.getColumnConstraints().add(column);
		 } 

 Label label = new Label("Вводимое");
 gridpane.add(label, 0, 0);
 TextField dividendTextField = new TextField();
 gridpane.add(dividendTextField, 1, 0);
  
 label = new Label("Инверсия");
 gridpane.add(label, 0, 1);
 TextField dividerTextField = new TextField();
 gridpane.add(dividerTextField, 1, 1);
 Button calculateButton = new Button("Инвертировать");
 gridpane.add(calculateButton, 1, 2); 

 calculateButton.setOnAction(new EventHandler<ActionEvent>() {
	 Inversion inversion = new Inversion();
	  public void handle(ActionEvent e) {
		  inversion.invers(calculateButton,dividendTextField,dividerTextField);
	  		}	  
	  	}); 

 root.setCenter(gridpane);
 primaryStage.setScene(scene);
 primaryStage.show();
 
	} 
}
