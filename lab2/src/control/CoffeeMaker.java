package control;

import granulatedGoods.Coffee;
import granulatedGoods.Sugar;
import items.Cup;
import items.Teapot;

public interface CoffeeMaker {

    Sugar somesugar = new Sugar();
    Cup somecup = new Cup();
    Teapot someteapot = new Teapot();
    Coffee somecoffee = new Coffee();

    void makeCoffee();

}
