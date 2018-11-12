package com.xiaowei.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/12 4:04 PM
 **/
public class PancakeMenu implements Menu{
    ArrayList menuItems = new ArrayList();

    public PancakeMenu() {
        addItems("name1","good",true,2.99);
        addItems("name2","very good",false,2.99);
        addItems("name3","ordinary",true,3.44);
    }

    public void addItems(String name, String desc, boolean vege, double price){
        MenuItems menuItem = new MenuItems(name,desc,vege,price);
        menuItems.add(menuItem);
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }
    public Iterator createIterator(){
        return menuItems.iterator();
    }

    @Override
    public String toString() {
        return "PancakeMenu{" +
                "menuItems=" + menuItems +
                '}';
    }
}
