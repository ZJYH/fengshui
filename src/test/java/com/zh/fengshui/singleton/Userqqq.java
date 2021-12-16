package com.zh.fengshui.singleton;


public class Userqqq {

    private String name ;
    private String age;
    private static final Userqqq SINGLETON_USERQQQ =new Userqqq();
    private Userqqq(){}
    public static Userqqq getUser(){
        return SINGLETON_USERQQQ;
    }
}
