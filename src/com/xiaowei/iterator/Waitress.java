package com.xiaowei.iterator;

import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/12 4:50 PM
 **/
public class Waitress {
    Menu pack;
    Menu dinner;
    Menu coffe;

    public Waitress(Menu pack, Menu dinner, Menu coffe) {
        this.pack = pack;
        this.dinner = dinner;
        this.coffe = coffe;
    }
    public void printMenu(){
        Iterator packIterator = pack.createIterator();
        Iterator dinnerIterator = dinner.createIterator();
        Iterator coffeIterator = coffe.createIterator();

        System.out.println("1----");
        printMenu(dinnerIterator);


        System.out.println("2---");
        printMenu(packIterator);

        System.out.println("3----");

        printMenu(coffeIterator);
    }
    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItems menuItem = (MenuItems) iterator.next();
            System.out.println(menuItem.getName()+"---"+menuItem.getDesc()+"----"+menuItem.getPrice());
        }
    }
}
