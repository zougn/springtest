package com.zougn.service.impl;

import com.zougn.service.UserService;

//代理角色，在这里面增加日志的实现
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;
 
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
 
    public void add() {
        log("add");
        userService.add();
    }
 
    public void delete() {
        log("delete");
        userService.delete();
    }
 
    public void update() {
        log("update");
        userService.update();
    }
 
    public void query() {
        log("query");
        userService.query();
    }

    @Override
    public void add1(int a) {
        log("query");
        userService.add1(1);
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
 
}