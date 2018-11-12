package com.xiaowei.observer.myself;

import java.util.ArrayList;

/**
 * @athour Marie
 * @date 2018/11/6 2:57 PM
 **/
public class WeatherData implements Subject{
    private ArrayList observers;

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i =0;i<observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temp,humidity,pressure);
        }
    }
    public void measureChaged(){
        notifyObserver();
    }
    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure =pressure;
        measureChaged();
    }

}
