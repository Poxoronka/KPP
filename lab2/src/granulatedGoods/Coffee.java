package granulatedGoods;

import control.Window;
import items.Item;
import javafx.event.ActionEvent;

import java.util.concurrent.TimeUnit;

public class Coffee extends Item{
    private String taste;

    public void pour(){
        control.Main.getWind().setStatusText("Насыпаем кофе");
        Window.getStud().somecup.fill();

    }
}
