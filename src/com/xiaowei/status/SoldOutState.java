package com.xiaowei.status;

/**
 * @athour Marie
 * @date 2018/11/12 9:09 PM
 **/
public class SoldOutState implements State {

    Gumball gumball;

    public SoldOutState(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insertQuarter() {
        System.out.println("no--soldout");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("no--quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("emmm--no");
    }

    @Override
    public void dispence() {
        System.out.println("no gumball");
    }
}
