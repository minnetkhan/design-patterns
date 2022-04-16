package Strategy.QuackBehaviour;

public class Squeak implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Squeak sound...");
    }
}
