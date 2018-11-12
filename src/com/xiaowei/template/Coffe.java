package com.xiaowei.template;

/**
 * @athour Marie
 * @date 2018/11/10 12:18 PM
 **/
public class Coffe {
    public void biloWater(){
        System.out.println("Boiling water");
    }
    public void brewCoffe(){
        System.out.println("Dripping coffe");
    }
    public void pourIncup(){
        System.out.println("pouring into cup");
    }
    public void addSugar(){
        System.out.println("Addding sugar");
    }
    public void prepare(){
        biloWater();
        brewCoffe();
        pourIncup();
        addSugar();
    }

    public static void main(String[] args) {
        new Coffe().prepare();
    }
}
