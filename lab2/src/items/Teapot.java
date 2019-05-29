package items;

import java.util.concurrent.TimeUnit;

public class Teapot {
    private int volume;
    private int temperature;

    public void fillCup() {
        control.Main.getWind().setStatusText("Наполняем чашку");
    }

    public void fill(){
        boil();
        fillCup();
        control.Main.getWind().setStatusText("Заберите кофе");
    }

    public void boil() {

        control.Main.getWind().setStatusText("Греем чайник");
    }

}
