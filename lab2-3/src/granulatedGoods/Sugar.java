package granulatedGoods;

import control.CoffeeMaker;
//import control.Handler;
import control.Main;
import control.Window;
import items.Cup;
import items.Item;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Sugar extends GranulatedGoods{

    public void pour() {
        if(Main.getWind().isMakeCoffeeFlag()) {
            Main.getWind().getButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, Main.getWind().getHandler());
            Main.getWind().getButton().addEventFilter(MouseEvent.MOUSE_CLICKED, fillCupHandler);
        }
        else {
            Main.getWind().getTeaButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, Main.getWind().getStud().sometea.getTeaHandler());
            Main.getWind().getTeaButton().addEventFilter(MouseEvent.MOUSE_CLICKED, fillCupHandler);
        }

    }

    EventHandler<MouseEvent> fillCupHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            Main.getWind().setStatusText("Насыпаем сахар");
            if(Main.getWind().isMakeCoffeeFlag()) {
                Main.getWind().setButtonText("Наполнить чашку");
                Window.getStud().somecup.fill();
            }
            else {
                Main.getWind().setTeaButton("Наполнить чашку");
                Window.getStud().someteapot.fill();
            }

        }
    };

    public EventHandler<MouseEvent> getFillCupHandler() { return fillCupHandler; }
}