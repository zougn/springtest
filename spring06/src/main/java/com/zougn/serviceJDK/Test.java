package com.zougn.serviceJDK;

import com.zougn.service.UserService;
import com.zougn.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        //真实对象
//        UserServiceImpl userService = new UserServiceImpl();
//        //代理对象的调用处理程序
//        ProxyInvocationHandler pih = new ProxyInvocationHandler();
//        pih.setTarget(userService); //设置要代理的对象
//        UserService proxy = (UserService)pih.getProxy(); //动态生成代理类！


//        UserService proxy = (UserService)Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(),
//                UserServiceImpl.class.getInterfaces(), new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        log(method.getName());
//                        Object result = method.invoke(new UserServiceImpl(), args);
//                        return result;
//                    }
//
//                    public void log(String methodName) {
//                        System.out.println(methodName);
//                    }
//                });

        UserService proxy = (UserService)getProxy(new UserServiceImpl());
        proxy.add();
    }


    public static Object getProxy(Object object){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        log(method.getName());
                        Object result = method.invoke(object, args);
                        return result;
                    }
                    public void log(String methodName) {
                        System.out.println("执行了"+methodName+"方法");
                    }
                });
    }
}