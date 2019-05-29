package control;

//import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
import javafx.scene.layout.ColumnConstraints;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Window{

    private List<EventHandler> handlers = new ArrayList<EventHandler>();//decorator pattern

    public void addHandler(EventHandler handler) {
        handlers.add(handler);
    }

    static Student stud = new Student();
    public static Student getStud() {return stud;}

    Button button = new Button("Приготовить кофе");
    Label status = new Label("");

    public void draw(Stage primaryStage)
    {
        primaryStage.setResizable(false);
        BorderPane root = new BorderPane();
        Scene scene=new Scene(root,400,45);
        root.setStyle("-fx-background-color: #fff2e6;");

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(15));
        //gridpane.setHgap(5);
        //gridpane.setVgap(5);

        for(int i=0; i<2; i++)
        {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(100/2);
            gridpane.getColumnConstraints().add(column);
        }

        gridpane.add(button, 1, 0);
        gridpane.add(status, 0, 0);

//		HBox box = new HBox();
//		box.setPadding(new Insets(15));
//		box.setSpacing(15);
//		box.getChildren().addAll(button, status);
//		root.setCenter(box);

        root.setCenter(gridpane);
        primaryStage.setTitle("Make Coffee");
        primaryStage.setScene(scene);
        primaryStage.show();

		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {


                stud.makeCoffee();
			}
		});
    }

    public void setButtonText(String text){
        button.setText(text);
    }
    public void setStatusText(String text){
        status.setText(text);
    }

}