package Strategy.QuackBehaviour;

public class Mute implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Doesn't make any sound");
    }
}
