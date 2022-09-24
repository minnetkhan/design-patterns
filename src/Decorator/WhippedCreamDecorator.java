package Decorator;

public class WhippedCreamDecorator extends CondimentDecorator {
    Beverage beverage;

    public WhippedCreamDecorator(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return beverage.cost()+0.99;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }
}
