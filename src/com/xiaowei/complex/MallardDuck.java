package com.xiaowei.complex;

import java.util.Observer;

/**
 * @athour Marie
 * @date 2018/11/13 6:42 PM
 **/
public class MallardDuck implements Quarkable {

    @Override
    public void quark() {
        System.out.println("quark");
    }

    @Override
    public void registter(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
