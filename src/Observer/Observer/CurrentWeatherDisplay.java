package Observer.Observer;

import Observer.Observable.WeatherData;

public class CurrentWeatherDisplay implements Observer, Display{
    private WeatherData weatherData;
    private float temperature;
    private float pressure;
    private float humidity;

    public CurrentWeatherDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Weather Condition: ");
        System.out.println("Temperature " + this.temperature);
        System.out.println("Pressure " + this.pressure);
        System.out.println("Humidity " + this.humidity);
        System.out.println("------------------");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        this.display();
    }
}
