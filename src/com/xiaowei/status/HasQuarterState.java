package com.xiaowei.status;

/**
 * @athour Marie
 * @date 2018/11/12 9:07 PM
 **/
public class HasQuarterState implements State {
    Gumball gumball;

    public HasQuarterState(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you already have quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter eject");
        gumball.setState(gumball.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("turn");
        gumball.setState(gumball.getNoQuarterState());

    }

    @Override
    public void dispence() {
        System.out.println("no dispence");
    }
}
