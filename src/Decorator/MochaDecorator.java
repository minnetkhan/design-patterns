package Decorator;

public class MochaDecorator extends CondimentDecorator{
    Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+0.59;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
