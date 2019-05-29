package control;

import granulatedGoods.Coffee;
import granulatedGoods.Sugar;
import granulatedGoods.Tea;
import items.Cup;
import items.Milk;
import items.Teapot;

public interface CoffeeMaker {

    Sugar somesugar = new Sugar();
    Cup somecup = new Cup();
    Teapot someteapot = new Teapot();
    Coffee somecoffee = new Coffee();
    Tea sometea = new Tea();
    Milk somemilk = new Milk();

    void makeCoffee();
    void makeTea();
}
