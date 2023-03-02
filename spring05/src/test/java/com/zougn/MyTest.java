package com.zougn;

import com.zougn.config.MyConfig;
import com.zougn.pojo.Dog;
import com.zougn.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.name);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog.name);
    }
}
