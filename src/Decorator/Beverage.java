package Decorator;

public abstract class Beverage {
    String description = "UNKNOWN";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
