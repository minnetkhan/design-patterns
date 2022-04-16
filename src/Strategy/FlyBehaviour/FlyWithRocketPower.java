package Strategy.FlyBehaviour;

public class FlyWithRocketPower implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Rocket powered flying");
    }
}
