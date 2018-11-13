package com.xiaowei.proxy;

/**
 * @athour Marie
 * @date 2018/11/13 4:57 PM
 **/
public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interest;
    int rating;
    int retingCount = 0;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterest() {
        return interest;
    }

    @Override
    public int getHotOrNot() {
        if(retingCount==0){
            return 0;
        }
        return rating/retingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public void setHotOrNot(int hotOrNot) {
        this.rating +=rating;
        retingCount++;
    }
}
