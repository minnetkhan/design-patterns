package Strategy.Duck;

import Strategy.FlyBehaviour.FlyBehaviour;
import Strategy.QuackBehaviour.QuackBehaviour;

abstract public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void swim() {
        System.out.println("Every duck swim, even it is a decoy duck");
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    abstract public void display();
}
