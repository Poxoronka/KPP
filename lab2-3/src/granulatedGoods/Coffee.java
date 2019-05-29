package granulatedGoods;

import control.Main;
import control.Window;
import items.Item;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Coffee extends GranulatedGoods {
    private String taste;

    public void pour() {

        Main.getWind().getButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, Main.getWind().getStud().getCoffeeHandler());
        Main.getWind().getButton().addEventFilter(MouseEvent.MOUSE_CLICKED, fillCupHandler);

    }

    EventHandler<MouseEvent> fillCupHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            Main.getWind().setStatusText("Насыпаем кофе");
            Main.getWind().setButtonText("Наполнить чашку");
            Window.getStud().somecup.fill();
        }
    };

    public EventHandler<MouseEvent> getHandler() {
        return fillCupHandler;
    }
}