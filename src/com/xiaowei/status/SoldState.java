package com.xiaowei.status;

/**
 * @athour Marie
 * @date 2018/11/12 9:08 PM
 **/
public class SoldState implements State {
    Gumball gumball;

    public SoldState(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insertQuarter() {
        System.out.println("already give you a gumball");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry");
    }

    @Override
    public void turnCrank() {
        System.out.println("turn twice");
    }

    @Override
    public void dispence() {
        gumball.releaseBall();
        if(gumball.getCount()>0){
            gumball.setState(gumball.getNoQuarterState());
        }else {
            System.out.println("oops");
            gumball.setState(gumball.getSoldOutState());
        }
    }
}
