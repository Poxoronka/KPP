package control;

import java.util.ArrayList;
import java.util.List;

//import javafx.application.Application;
import javafx.scene.input.MouseEvent;
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

public class Window{

    private boolean makeCoffeeFlag = false;
    private boolean makeTeaFlag = false;

    static Student stud = new Student();
    public static Student getStud() {return stud;}

    Button button = new Button("Приготовить кофе");
    Button milkCoffee = new Button("Приготовить кофе\n с молоком");
    Button teaButton = new Button("Приготовить чай");
    Label status = new Label("");

    public void draw(Stage primaryStage)
    {
        primaryStage.setResizable(false);
        BorderPane root = new BorderPane();
        Scene scene=new Scene(root,400,100);
        root.setStyle("-fx-background-color: #fff2e6;");

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(15));
        gridpane.setHgap(5);
        gridpane.setVgap(15);

        for(int i=0; i<2; i++)
        {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(100/2);
            gridpane.getColumnConstraints().add(column);
        }

        button.setPrefWidth(175);
        teaButton.setPrefWidth(175);
        milkCoffee.setPrefWidth(175);

        gridpane.add(status, 1, 0);
        gridpane.add(teaButton, 0, 1);
        gridpane.add(button, 0, 0);
//        gridpane.add(milkCoffee, 0, 2);

        root.setCenter(gridpane);
        primaryStage.setTitle("Make Coffee");
        primaryStage.setScene(scene);
        primaryStage.show();

        button.addEventFilter(MouseEvent.MOUSE_CLICKED, handler);
        teaButton.addEventFilter(MouseEvent.MOUSE_CLICKED, makeTeaHandler);
    }

    EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
//            button.setText("Насыпать сахар");
//            status.setText("Готовим кофе");
            //Handler.setOldHandler(handler);
            if(!makeTeaFlag) {
                makeCoffeeFlag = true;
                stud.makeCoffee();
            }
        }
    };

    EventHandler<MouseEvent> makeTeaHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            if(!makeCoffeeFlag) {
                makeTeaFlag=true;
                stud.makeTea();
            }
        }
    };

/*
    EventHandler<javafx.scene.input.MouseEvent> teaHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
//            button.setText("Насыпать сахар");
//            status.setText("Готовим кофе");
            Handler.setOldHandler(handler);
            stud.makeCoffee();
        }
    };

    EventHandler<javafx.scene.input.MouseEvent> milkCoffeeHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
//            button.setText("Насыпать сахар");
//            status.setText("Готовим кофе");
            Handler.setOldHandler(handler);
            stud.makeCoffee();
        }
    };
*/
    public void setButtonText(String text){
        button.setText(text);
    }
    public void setTeaButton(String text){
        teaButton.setText(text);
    }

    public void setStatusText(String text){
        status.setText(text);
    }

    public Button getButton() { return button; }
    public Button getTeaButton() { return teaButton; }

    public EventHandler<MouseEvent> getHandler() { return handler; }
    public EventHandler<MouseEvent> getMakeTeaHandler() { return makeTeaHandler; }

    public void setMakeCoffeeFlag(boolean status) { makeCoffeeFlag = status; }
    public boolean isMakeCoffeeFlag() { return makeCoffeeFlag; }

    public void setMakeTeaFlag(boolean status) { makeTeaFlag = status; }
    public boolean isMakeTeaFlag() { return makeTeaFlag; }
}
