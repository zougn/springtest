package com.zougn.service;

import com.zougn.service.impl.UserServiceImpl;
import com.zougn.service.impl.UserServiceProxy;

public class Client {
    public static void main(String[] args) {
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        UserServiceProxy proxy = new UserServiceProxy();
        //使用代理类实现日志功能！
        proxy.setUserService(userService);
 
        proxy.add();
    }
}