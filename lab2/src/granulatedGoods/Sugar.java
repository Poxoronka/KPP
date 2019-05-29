package granulatedGoods;
import control.CoffeeMaker;
import control.Window;
import items.Cup;
import items.Item;

import java.util.concurrent.TimeUnit;

public class Sugar extends Item{

    public void pour(){
        control.Main.getWind().setStatusText("Насыпаем кофе");
        Window.getStud().somecup.fill();
    }
}
