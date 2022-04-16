package Strategy.Duck;

import Strategy.FlyBehaviour.Fly;
import Strategy.FlyBehaviour.FlyBehaviour;
import Strategy.QuackBehaviour.Quack;
import Strategy.QuackBehaviour.QuackBehaviour;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehaviour = new Fly();
        quackBehaviour = new Quack();
    }

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck...");
    }
}
