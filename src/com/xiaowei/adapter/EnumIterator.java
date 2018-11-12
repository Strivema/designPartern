package com.xiaowei.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/9 7:09 PM
 **/
public class EnumIterator implements Enumeration {

    Iterator iterator;
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    public EnumIterator(Iterator iterator) {
        this.iterator = iterator;
    }

    public Iterator getIterator() {
        return iterator;
    }

    public void setIterator(Iterator iterator) {
        this.iterator = iterator;
    }
}
