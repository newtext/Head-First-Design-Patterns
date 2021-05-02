package com.designpatterns.observer.weather;

public class WeatherStation {

    public static void main(String[] args) {

        // The Subject that will update the subscribers
        WeatherData weatherData = new WeatherData();

        //Add CurrentConditionsDisplay to weatherData Subject
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        //Add StaticDisplay to weatherData Subject
        StaticDisplay statisticsDisplay = new StaticDisplay(weatherData);

        //Add ForecastDisplay to weatherData Subject
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //The subject updates the measurement for the weather
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();

        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.removeObserver(statisticsDisplay);
        System.out.println();

        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
