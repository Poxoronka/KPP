package items;

import granulatedGoods.Coffee;

import java.util.concurrent.TimeUnit;

public class Cup extends Item{
    private int volume;
    //private String content;
    private Item content;

    public void fill() {
        control.Main.getWind().setStatusText("Наполняем чашку");

    }

}
