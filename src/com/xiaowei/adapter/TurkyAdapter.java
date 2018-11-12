package com.xiaowei.adapter;

/**
 * @athour Marie
 * @date 2018/11/9 3:54 PM
 **/
public class TurkyAdapter implements Duck{
    Turky turky;

    public TurkyAdapter(Turky turky) {
        this.turky = turky;
    }

    @Override
    public void quck() {
        turky.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0;i<5;i++){
            turky.fly();
        }

    }

}
