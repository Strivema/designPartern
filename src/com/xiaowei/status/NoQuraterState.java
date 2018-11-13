package com.xiaowei.status;

/**
 * @athour Marie
 * @date 2018/11/12 9:02 PM
 **/
public class NoQuraterState implements State{
    Gumball gumball;

    public NoQuraterState(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insertQuarter() {
        System.out.println("insert");

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispence() {

    }
}
