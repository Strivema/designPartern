package com.xiaowei.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @athour Marie
 * @date 2018/11/9 7:01 PM
 **/
public class Test implements Iterator {
    public static void main(String[] args) {

    }
    Enumeration enumeration;


    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
