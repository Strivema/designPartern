package com.xiaowei.iterator;

import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/12 4:10 PM
 **/
public class DinnerMenu implements Menu{
    static final  int MAX_ITEMS = 6;
    int nums = 0;
    MenuItems [] menuItems = new MenuItems[MAX_ITEMS];

    public DinnerMenu() {
        addItems("name1","good",true,3.99);
        addItems("name2","very good",false,3.99);
        addItems("name3","ordinary",true,2.44);
    }

    public void addItems(String name, String desc, boolean vege, double price){
        MenuItems menuItem = new MenuItems(name,desc,vege,price);
        if(nums>=MAX_ITEMS){
            System.out.println("full");
        }else {
            menuItems[nums] = menuItem;
            nums = nums+1;
        }

    }
//
//    public MenuItems[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator(){

        return new DinnerMenuIterator(menuItems);
    }

}
