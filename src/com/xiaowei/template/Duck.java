package com.xiaowei.template;

/**
 * @athour Marie
 * @date 2018/11/10 1:47 PM
 **/
public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        if(this.weight>duck.weight){
            return 1;
        }else if(this.weight==duck.weight){
            return 0;
        }else {
            return -1;
        }
    }
}
