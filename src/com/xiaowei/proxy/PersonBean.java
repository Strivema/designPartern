package com.xiaowei.proxy;

/**
 * @athour Marie
 * @date 2018/11/13 4:50 PM
 **/
public interface PersonBean {
    String getName();
    String getGender();
    String getInterest();
    int getHotOrNot();

    void setName(String name);
    void setGender(String gender);
    void setInterest(String interest);
    void setHotOrNot(int hotOrNot);

}
