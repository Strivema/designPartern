package com.xiaowei.complex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

/**
 * @athour Marie
 * @date 2018/11/13 7:42 PM
 **/
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registter(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator iterator  = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            // observer.update(duck,);
        }
    }
}
