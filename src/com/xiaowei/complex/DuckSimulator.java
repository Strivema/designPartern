package com.xiaowei.complex;

/**
 * @athour Marie
 * @date 2018/11/13 6:55 PM
 **/
public class DuckSimulator {
    public static void main(String[] args) {
        new DuckSimulator().simulator();
    }
    void simulator(){
        Quarkable malllaardDuck = new MallardDuck();
        Quarkable redDuck = new RedHeadDuck();
        simulator(malllaardDuck);
        simulator(redDuck);
    }
    void simulator(Quarkable duck){
        duck.quark();
    }
}
