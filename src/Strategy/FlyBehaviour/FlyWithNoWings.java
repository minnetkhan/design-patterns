package Strategy.FlyBehaviour;

public class FlyWithNoWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
