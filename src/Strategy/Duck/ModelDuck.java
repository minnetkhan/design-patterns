package Strategy.Duck;

import Strategy.FlyBehaviour.FlyBehaviour;
import Strategy.FlyBehaviour.FlyWithNoWings;
import Strategy.FlyBehaviour.FlyWithRocketPower;
import Strategy.QuackBehaviour.Mute;
import Strategy.QuackBehaviour.Squeak;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehaviour = new FlyWithNoWings();
        quackBehaviour = new Mute();
    }

    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();

        duck.setQuackBehaviour(new Squeak());
        duck.setFlyBehaviour(new FlyWithRocketPower());
        duck.performQuack();
        duck.performFly();
    }

    @Override
    public void display() {
        System.out.println("Model duck...");
    }
}
