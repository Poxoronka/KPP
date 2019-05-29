package control;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

    static Window dr = new Window();

    public static Window getWind() {return dr;}

    public static void main(String[] args) {
        Application.launch(args);
    }
    public void start(Stage primaryStage){
        dr.draw(primaryStage);
    }

}
