package Decorator;

public class Cappuccino extends Beverage {
    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
