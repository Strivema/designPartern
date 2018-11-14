package com.xiaowei.complex;

import java.util.Observer;

public interface QuackObservable {
    public void registter(Observer observer);
    public void notifyObserver();
}
