package com.xiaowei.status;

/**
 * @athour Marie
 * @date 2018/11/12 8:08 PM
 **/
public class GumballTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine =new GumballMachine(2);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);


    }

}
