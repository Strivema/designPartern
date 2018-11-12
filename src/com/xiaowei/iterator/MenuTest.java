package com.xiaowei.iterator;

/**
 * @athour Marie
 * @date 2018/11/12 4:56 PM
 **/
public class MenuTest {
    public static void main(String[] args) {
        PancakeMenu pack = new PancakeMenu();
        DinnerMenu din = new DinnerMenu();
        CaffeMenu caffe = new CaffeMenu();
        Waitress waitress = new Waitress(pack,din,caffe);
        waitress.printMenu();
    }

}
