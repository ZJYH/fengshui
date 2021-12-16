package com.zh.fengshui.service;


import org.springframework.stereotype.Service;

@Service
public class UserSerImpl implements UserService {

    @Override
    public String selWork(String address) {
        if(address.equals("河南")){
            return "程序员";
        }else if(address.equals("盐城")){
            return "挖粪";
        }else {
            return "银河护卫队";
        }
    }

    @Override
    public String selAdres(String name) {

        if(name.equals("小张")){
            return "河南";
        }else if(name.equals("晓峰")){
            return "盐城";
        }else {
            return "地球";
        }
    }
}
