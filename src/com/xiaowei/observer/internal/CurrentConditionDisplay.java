package com.xiaowei.observer.internal;

import com.xiaowei.observer.myself.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @athour Marie
 * @date 2018/11/6 9:08 PM
 **/
public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;

    private float humity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temp+"   "+humity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humity = weatherData.getHumity();
            display();
        }
    }
}
