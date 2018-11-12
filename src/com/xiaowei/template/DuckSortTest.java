package com.xiaowei.template;

import java.util.Arrays;

/**
 * @athour Marie
 * @date 2018/11/10 1:50 PM
 **/
public class DuckSortTest {
    public static void main(String[] args) {

        Duck []ducks = {new Duck("1",9),new Duck("2",3),new Duck("7",7)};
        Arrays.sort(ducks);
        System.out.println(Arrays.toString(ducks));
    }

}
