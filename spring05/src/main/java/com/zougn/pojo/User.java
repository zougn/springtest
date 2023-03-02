package com.zougn.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component("user")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>


@Controller("user")
@Scope("prototype")
public class User {

//    public String name = "秦疆";

    @Value("秦疆")    // 相当于配置文件中 <property name="name" value="秦疆"/>
    public String name;

//    @Value("秦疆")
//    public void setName(String name) {
//        this.name = name;
//    }

}