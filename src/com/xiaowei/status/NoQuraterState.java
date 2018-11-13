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
        gumball.setState(gumball.getHasQuarterState());

    }

    @Override
    public void ejectQuarter() {
        System.out.println("no money");
    }

    @Override
    public void turnCrank() {
        System.out.println("no money-turn");
    }

    @Override
    public void dispence() {
        System.out.println("you must pay");
    }
}
