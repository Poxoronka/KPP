package items;

//import control.Handler;
import control.Main;
import control.Window;
import granulatedGoods.Coffee;
import javafx.scene.input.MouseEvent;

public class Cup extends Item{
    private int volume;
    private Item content;

    boolean filled=false;
    //public boolean isFilled(){return  filled;}


    public void fill() {
        if(filled==false) {
            Main.getWind().getButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, Window.getStud().somesugar.getFillCupHandler());
            Main.getWind().getButton().addEventFilter(MouseEvent.MOUSE_CLICKED, Window.getStud().getCoffeeHandler());
            filled=true;
        }
        else {
            Main.getWind().getButton().removeEventFilter(MouseEvent.MOUSE_CLICKED, Window.getStud().somecoffee.getHandler());
            Main.getWind().getButton().addEventFilter(MouseEvent.MOUSE_CLICKED, Window.getStud().getTeaPotHandler());
            filled=false;
        }
//        Main.getWind().setStatusText("Наполняем чашку");
//        Main.getWind().setButtonText("Насыпать кофе");
//        control.Main.getWind().setStatusText("��������� �����");

//		Handler.handle(
//				null,
//				Main.getWind(),
//				Main.getWind().getButton(),
//				y->y.removeEventHandler(MouseEvent.MOUSE_CLICKED, Handler.getOldHandler()),
//				null,
//				y->((Window) y).setStatusText("��������� �����"),
//				y->((Window) y).setButtonText(" ee"));
//
    }
}