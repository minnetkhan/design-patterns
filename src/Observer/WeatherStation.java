package Observer;

import Observer.Observable.WeatherData;
import Observer.Observer.CurrentWeatherDisplay;
import Observer.Observer.StatisticsWeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);
        StatisticsWeatherData statisticsWeatherData = new StatisticsWeatherData(weatherData);
        weatherData.setMeasurement(10, 10, 10);
        weatherData.setMeasurement(20, 20, 20);

        statisticsWeatherData.getUnsubscribed();
        weatherData.setMeasurement(30, 30, 30);
    }
}
