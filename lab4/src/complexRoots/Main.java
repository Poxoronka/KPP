package complexRoots;

import javafx.application.Application;
import javafx.stage.Stage;

import static java.lang.Integer.*;

public class Main extends Application {

    static Window dr = new Window();

    public static Window getWind() {
        return dr;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {
        dr.draw(primaryStage);
    }

    public static void calculate(){
        Calculator[] calculator = new Calculator [parseInt(dr.getPower().getText())];
        for(int num = 0; num< parseInt(dr.getPower().getText()); num++){
            calculator[num] = new Calculator(Double.parseDouble(dr.getRealPart().getText()),
                    Double.parseDouble(dr.getImaginaryPart().getText()),
                    Double.parseDouble(dr.getPower().getText()), num);
            calculator[num].start();
        }

        for(int num = 0; num< parseInt(dr.getPower().getText()); num++) {
            try {
                calculator[num].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dr.getResultsField().appendText(calculator[num].getResult()+'\n');
        }
    }
}
