package com.xiaowei.iterator;

import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/12 4:18 PM
 **/
public class DinnerMenuIterator implements Iterator {
    MenuItems [] items;
    int position =0;

    public DinnerMenuIterator(MenuItems[] items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        if(position>=items.length||items[position]==null){
            return false;
        }else {

            return true;
        }

    }

    @Override
    public Object next() {
        MenuItems menuItems = items[position];
        position +=1;
        return menuItems;
    }
}
