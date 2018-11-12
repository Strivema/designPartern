package com.xiaowei.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/12 4:25 PM
 **/
public class PancakeMenuIterator implements Iterator {
    // arraylist 内部存在迭代器，此类没用

    ArrayList menuItems;
    int position = 0;

    public PancakeMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>= menuItems.size()||menuItems.get(position)==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItems items = (MenuItems) menuItems.get(position);
        position +=1;

        return items;
    }

}
