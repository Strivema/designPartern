package com.xiaowei.observer.internal;


/**
 * @athour Marie
 * @date 2018/11/6 5:10 PM
 **/
public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasure(80,65,30.4f);
        weatherData.setMeasure(82,70,29.2f);
        weatherData.setMeasure(78,90,29.2f);
        conditionDisplay.display();
    }
}
