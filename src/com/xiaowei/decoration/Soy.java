package com.xiaowei.decoration;

/**
 * @athour Marie
 * @date 2018/11/7 3:51 PM
 **/
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public int getSize(){
        return beverage.getSize();
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+"Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(getSize()==beverage.TILL){
            cost +=1.0;
        }else if (getSize()==beverage.GRANDE){
            cost +=2.0;
        }else {
            cost +=3.0;
        }
        return cost;
    }
}
