package com.xiaowei.complex;

import java.util.Observer;

/**
 * @athour Marie
 * @date 2018/11/13 7:02 PM
 **/
public class GooseAdapter implements Quarkable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public Goose getGoose() {
        return goose;
    }

    public void setGoose(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quark() {
        goose.honk();
    }

    @Override
    public void registter(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
