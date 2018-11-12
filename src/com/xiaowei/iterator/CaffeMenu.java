package com.xiaowei.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/12 4:41 PM
 **/
public class CaffeMenu implements Menu{
    Hashtable menuItems = new Hashtable();

    public CaffeMenu() {
        addItem("name1","ok",true,20.00);

    }
    public void addItem(String name,String desc ,boolean vege,double price){
        MenuItems menuItem = new MenuItems(name,desc,vege,price);
        menuItems.put("name1",menuItem);
    }
    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
