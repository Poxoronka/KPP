package complexRoots;

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
import javafx.scene.control.TextArea;

public class Window {

    private Button button = new Button("Вычислить корни");
    private Label status = new Label("");
    private Label powerLabel = new Label("Введите степень");
    private Label imaginaryPartLabel = new Label("Введите мнимую часть");
    private Label realPartLabel = new Label("Введите действительную часть");
    private TextField power = new TextField();
    private TextField imaginaryPart = new TextField();
    private TextField realPart = new TextField();
    private TextArea resultsField = new TextArea();

    public void draw(Stage primaryStage)
    {
        primaryStage.setResizable(false);
        BorderPane root = new BorderPane();
        Scene scene=new Scene(root,400,275);
        root.setStyle("-fx-background-color: #fff2e6;");
        root.setPadding(new Insets(10));

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(15));
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        for(int i=0; i<2; i++)
        {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(100/2);
            gridpane.getColumnConstraints().add(column);
        }

        button.setPrefWidth(175);

        gridpane.add(realPartLabel, 0, 0);
        gridpane.add(realPart, 1, 0);
        gridpane.add(imaginaryPartLabel, 0, 1);
        gridpane.add(imaginaryPart, 1, 1);
        gridpane.add(powerLabel, 0, 3);
        gridpane.add(power, 1,3);
        gridpane.add(button, 0,4);
        gridpane.add(status, 1, 4);

        resultsField.setEditable(false);
        resultsField.setPrefRowCount(5);

        root.setCenter(gridpane);
        root.setBottom(resultsField);
        primaryStage.setTitle("Complex roots");
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                resultsField.clear();
                Main.calculate();
            }
        });
    }

    public TextArea getResultsField(){
        return resultsField;
    }

    public TextField getPower(){
        return power;
    }

    public TextField getImaginaryPart(){
        return  imaginaryPart;
    }

    public TextField getRealPart(){
        return realPart;
    }
}
