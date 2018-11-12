package com.xiaowei.iterator;

import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/12 5:25 PM
 **/
public class CoffeIterator implements Iterator {
    // hashTable 内部具有迭代器，此方法是无效的只是为了写这个方法而已


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
