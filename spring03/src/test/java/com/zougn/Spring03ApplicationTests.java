package com.zougn;


import com.zougn.pojo.Student;
import com.zougn.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring03ApplicationTests {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
        student.show();

    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }


    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user==user2);
    }
}
