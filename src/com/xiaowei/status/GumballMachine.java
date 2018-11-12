package com.xiaowei.status;

/**
 * @athour Marie
 * @date 2018/11/12 7:45 PM
 **/
public class GumballMachine {
    final static int SOLD_OUT =0;
    final static int NO_QUARTER =1;
    final static int HAS_QUARTER=2;
    final static int SOLD=3;
    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count>0){
            state = NO_QUARTER;
        }
    }
    public void insertQuarter(){
        switch (state){
            case HAS_QUARTER:
                System.out.println("has quarter");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("insert");
                break;
            case SOLD:
                System.out.println("already");
                break;
            case SOLD_OUT:
                System.out.println("no");
                break;
        }
    }
    public void ejectQuarter(){
        switch (state){
            case HAS_QUARTER:
                System.out.println("return");
                state=NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("no");
                break;
            case SOLD:
                System.out.println("already");
                break;
            case SOLD_OUT:
                System.out.println("no ---");
                break;
        }
    }
    public void turnCrank(){
        switch (state){
            case SOLD:
                System.out.println("twice???");
                break;
            case NO_QUARTER:
                System.out.println("no money");
                break;
            case SOLD_OUT:
                System.out.println("no gunball");
                break;
            case HAS_QUARTER:
                System.out.println("yes");
                state = SOLD;
                dispence();
                break;
        }
    }
    public void dispence(){
        switch (state){
            case SOLD:
                System.out.println("a gumball");
                count = count -1;
                if(count==0){
                    System.out.println("have no---");
                    state = SOLD_OUT;
                }else{
                    state = NO_QUARTER;
                }
                break;
            case SOLD_OUT:
                System.out.println("no small");
                break;
            case NO_QUARTER:
                System.out.println("pay");
                break;
            case HAS_QUARTER:
                System.out.println("no gumball");
                break;

        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                '}';
    }
}
