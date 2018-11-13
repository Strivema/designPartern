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


        Quarkable mall  =new QuackCounter(new MallardDuck());
        Quarkable red = new QuackCounter(new RedHeadDuck());
        Quarkable goo = new QuackCounter(new GooseAdapter(new Goose()));

        Quarkable goose = new GooseAdapter(new Goose());

        simulator(malllaardDuck);
        simulator(redDuck);
        simulator(goose);

        simulator(mall);
        simulator(red);
        simulator(goo);
        System.out.println(QuackCounter.getNum());
    }
    void simulator(Quarkable duck){
        duck.quark();
    }
}
