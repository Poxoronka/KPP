package control;

import java.util.function.Consumer;
import granulatedGoods.Sugar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Student implements CoffeeMaker{
    private String name;

    public void makeCoffee(){

        Main.getWind().setStatusText("Готовим кофе");
        Main.getWind().setButtonText("Насыпать сахар");
        somesugar.pour();

//		Handler.handler(
//				somecoffee,
//				Main.getWind(),
//				Main.getWind().getButton(),
//				y->y.removeEventHandler(MouseEvent.MOUSE_CLICKED, Handler.getOldHandler()),
//				x->x.pour(),
//				y->((Window) y).setStatusText("Íàñûïàåì êîôå"),
//				y->((Window) y).setButtonText(" yy"));
//        //somecoffee.pour();
    }

    public void makeTea(){

        Main.getWind().setStatusText("Готовим чай");
        Main.getWind().setTeaButton("Насыпать чай");
        sometea.pour();
    }

    EventHandler<MouseEvent> addCoffeeHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			Main.getWind().setStatusText("Наполняем чашку");
			Main.getWind().setButtonText("Насыпать кофе");
		    somecoffee.pour();
		}
	};

    public EventHandler<MouseEvent> getCoffeeHandler() { return addCoffeeHandler; }

    EventHandler<MouseEvent> teaPotHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            Main.getWind().setStatusText("Наполняем чашку");
            Main.getWind().setButtonText("Наполнить чайник");
            someteapot.fill();
        }
    };

    public EventHandler<MouseEvent> getTeaPotHandler() { return teaPotHandler; }

}
