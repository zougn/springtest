package com.zougn.config;

//自定义类来实现Aop
public class DiyPointcut {
 
    public void before(){
        System.out.println("---------方法执行前---------");
    }
    public void after(){
        System.out.println("---------方法执行后---------");
    }
    
}