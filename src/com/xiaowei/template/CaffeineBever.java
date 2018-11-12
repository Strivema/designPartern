package com.xiaowei.template;

import java.util.Scanner;

/**
 * @athour Marie
 * @date 2018/11/10 1:30 PM
 **/
public class CaffeineBever extends CaffeineWithHook {

    @Override
    void brew() {
        System.out.println("caffe");
    }

    @Override
    void addCondint() {
        System.out.println("add ");
    }
    public  boolean customHook(){
        String ans = getInput();
        if (ans.toLowerCase().equals("y")){
            return true;
        }
        return false;
    }
    public String getInput(){
        String ans = null;
        System.out.println("y / n ?");
        Scanner scan = new Scanner(System.in);
        ans = scan.nextLine();
        if(ans==null){
            return "no";
        }
        return ans;
    }

    public static void main(String[] args) {
        new CaffeineBever().prepare();
    }
}
