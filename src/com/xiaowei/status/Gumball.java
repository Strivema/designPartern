package com.xiaowei.status;

/**
 * @athour Marie
 * @date 2018/11/12 8:58 PM
 **/
public class Gumball {
    State soldOutState;
    State soldState;
    State noQuarterState;
    State HasQuarterState;
    State state = soldState;

    int count = 0;

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return HasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        HasQuarterState = hasQuarterState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
