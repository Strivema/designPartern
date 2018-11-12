package com.xiaowei.observer.myself;

/**
 * @athour Marie
 * @date 2018/11/6 4:49 PM
 *
 **/
public class CurrentDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity =humidity;
        display();
    }
    public void display() {
        System.out.println("current conditions:"+temp+"F"+humidity+"%humdity");
    }
}
