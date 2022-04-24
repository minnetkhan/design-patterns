package Observer.Observer;

import Observer.Observable.WeatherData;

import java.util.ArrayList;

public class StatisticsWeatherData implements Observer, Display{
    private WeatherData weatherData;
    ArrayList<Float> temperatureList;
    ArrayList<Float> humidityList;
    ArrayList<Float> pressureList;

    public StatisticsWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);

        temperatureList = new ArrayList<>();
        humidityList = new ArrayList<>();
        pressureList = new ArrayList<>();
    }

    public void getUnsubscribed() {
        this.weatherData.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistical Weather Data: ");
        float totalTemp=0, totalHumidity=0, totalPressure=0;

        for(Float temp: temperatureList) {
            totalTemp += temp;
        }

        for(Float humidity: humidityList) {
            totalHumidity += humidity;
        }

        for(Float pressure: pressureList) {
            totalPressure += pressure;
        }

        System.out.println("Statistical Temperature: " + totalTemp/temperatureList.size());
        System.out.println("Statistical Humidity: " + totalTemp/humidityList.size());
        System.out.println("Statistical Pressure: " + totalTemp/pressureList.size());
        System.out.println("------------------");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatureList.add(temperature);
        this.humidityList.add(humidity);
        this.pressureList.add(pressure);

        this.display();
    }
}
