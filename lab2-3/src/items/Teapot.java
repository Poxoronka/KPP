package items;

import control.Main;
import control.Window;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Teapot extends Item{
    private int volume;
    private int temperature;

    public void fillCup() {
        if(Main.getWind().isMakeCoffeeFlag()) {
            Main.getWind().getButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, fillCupHandler);
            Main.getWind().getButton().addEventFilter(MouseEvent.MOUSE_CLICKED, Main.getWind().getHandler());
            control.Main.getWind().setStatusText("Заберите кофе!");
            control.Main.getWind().setButtonText("Приготовить кофе");
            Main.getWind().setMakeCoffeeFlag(false);
        }
        if(Main.getWind().isMakeTeaFlag()){
            Main.getWind().getTeaButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, fillCupHandler);
            Main.getWind().getTeaButton().addEventFilter(MouseEvent.MOUSE_CLICKED, Main.getWind().getMakeTeaHandler());
            control.Main.getWind().setStatusText("Заберите чай!");
            control.Main.getWind().setTeaButton("Приготовить чай");
            Main.getWind().setMakeTeaFlag(false);
        }
    }

    public void fill() {
        if(Main.getWind().isMakeCoffeeFlag()) {
            Main.getWind().getButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, Window.getStud().getTeaPotHandler());
            Main.getWind().getButton().addEventFilter(MouseEvent.MOUSE_CLICKED, boilHandler);
        }
        else{
            Main.getWind().getTeaButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, Window.getStud().somesugar.getFillCupHandler());
            Main.getWind().getTeaButton().addEventFilter(MouseEvent.MOUSE_CLICKED, boilHandler);
        }
    }


    public void boil() {
        if(Main.getWind().isMakeCoffeeFlag()) {
            Main.getWind().getButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, boilHandler);
            Main.getWind().getButton().addEventFilter(MouseEvent.MOUSE_CLICKED, fillCupHandler);
        }
        else {
            Main.getWind().getTeaButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, boilHandler);
            Main.getWind().getTeaButton().addEventFilter(MouseEvent.MOUSE_CLICKED, fillCupHandler);
        }
    }

    EventHandler<MouseEvent> boilHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            control.Main.getWind().setStatusText("Наполняем чайник");
            if(Main.getWind().isMakeCoffeeFlag()) {
                control.Main.getWind().setButtonText("Вскипятить чайник");
            }
            else {
                control.Main.getWind().setTeaButton("Вскипятить чайник");
            }
            Window.getStud().someteapot.boil();
        }
    };

    EventHandler<MouseEvent> fillCupHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            Window.getStud().someteapot.fillCup();
        }
    };

}