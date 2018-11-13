package com.xiaowei.status;

/**
 * @athour Marie
 * @date 2018/11/12 8:58 PM
 **/
public class Gumball {
    private State soldOutState;
    private State soldState;
    private State noQuarterState;
    private State hasQuarterState;
    State state = soldState;

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispence();
    }

    public Gumball(int count) {
        noQuarterState = new NoQuraterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);

        this.count = count;
        if(count>0){
            state = noQuarterState;
        }
    }

    public void releaseBall(){
        System.out.println("rolling out");
        if(count!=0){
            count -=1;
        }
    }

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
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
