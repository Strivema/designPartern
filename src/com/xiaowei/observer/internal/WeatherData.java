package com.xiaowei.observer.internal;

import java.util.Observable;
import java.util.Observer;

/**
 * @athour Marie
 * @date 2018/11/6 8:56 PM
 **/
public class WeatherData extends Observable {
    private float temp;

    private float humity;

    private float pressure;

    public WeatherData() {
    }

    public void messureChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasure(float temp,float humity,float pressure){
        this.temp = temp;
        this.humity = humity;
        this.pressure = pressure;
        messureChanged();
    }

    public float getTemp() {

        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumity() {
        return humity;
    }

    public void setHumity(float humity) {
        this.humity = humity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
