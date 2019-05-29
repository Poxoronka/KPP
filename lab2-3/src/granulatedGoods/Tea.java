package granulatedGoods;

import control.Main;
import control.Window;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Tea extends GranulatedGoods{
    String taste;

    public void pour() {
        Main.getWind().getTeaButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, Main.getWind().getMakeTeaHandler());
        Main.getWind().getTeaButton().addEventFilter(MouseEvent.MOUSE_CLICKED, teaHandler);
    }

    EventHandler<MouseEvent> teaHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            Main.getWind().setStatusText("Добавляем чай");
            Main.getWind().setTeaButton("Добавить сахар");
            Window.getStud().somesugar.pour();
        }
    };

    public EventHandler<MouseEvent> getTeaHandler() { return teaHandler; }
}