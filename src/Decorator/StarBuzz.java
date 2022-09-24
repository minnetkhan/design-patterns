package Decorator;

public class StarBuzz {
    public static void main(String[] args) {
        /**
         * Espresso+Mocha+Whipped Cream
         */
        Beverage b1 = new MochaDecorator(new WhippedCreamDecorator(new Espresso()));
        System.out.println(b1.getDescription() + ": " + b1.cost());

        /**
         * Cappuccino+Mocha
         */
        Beverage b2 = new MochaDecorator(new Cappuccino());
        System.out.println(b2.getDescription() + ": " + b2.cost());
    }
}
