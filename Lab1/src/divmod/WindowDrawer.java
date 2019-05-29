package divmod;

//import javafx.application.Application;
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

public class WindowDrawer{

	public void createLabel(GridPane gridpane, int xPos, int yPos, String txt)
	{
		Label label=new Label(txt);
		gridpane.add(label, xPos, yPos);
	}
	
	public void draw(Stage primaryStage)
	{
		primaryStage.setResizable(false);
		BorderPane root = new BorderPane();
		Scene scene=new Scene(root,330,110);
		
		GridPane gridpane = new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setHgap(5);
		gridpane.setVgap(5);
		
		for(int i=0; i<2; i++)
		{
			ColumnConstraints column = new ColumnConstraints();
			column.setPercentWidth(100/2);
			gridpane.getColumnConstraints().add(column);
		}
		
		createLabel(gridpane, 0, 0, "sin(x)dx");		
		createLabel(gridpane, 0, 1, "Начало интервала");	
		createLabel(gridpane, 0, 2, "Конец интервала");
		
		TextField startTextField = new TextField();
		gridpane.add(startTextField, 1, 1);
		TextField endTextField = new TextField();
		gridpane.add(endTextField, 1, 2);
		
		Label resultLabel = new Label();
		gridpane.add(resultLabel, 1, 3);
		
		Button calculateButton = new Button("Проинтегрировать!");
		gridpane.add(calculateButton, 0, 3);
		
		calculateButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				
				try
				{
					Integer start = Integer.parseInt(startTextField.getText());
					Integer end = Integer.parseInt(endTextField.getText());
				
					try
					{
						resultLabel.setText("Результат "+Logic.calculate(start, end));
					}
					catch(ArithmeticException ev)
					{
						resultLabel.setText("Неверный интервал!");
					}
				}catch(Exception er) {}
			}			
		});
		
		root.setCenter(gridpane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
