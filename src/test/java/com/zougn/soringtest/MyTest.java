package com.zougn.soringtest;

import com.zougn.dao.impl.UserDaoMySqlImpl;
import com.zougn.dao.impl.UserDaoOracleImpl;
import com.zougn.pojo.Hello;
import com.zougn.pojo.Student;
import com.zougn.pojo.User;
import com.zougn.pojo.UserT;
import com.zougn.service.UserService;
import com.zougn.service.impl.UserServiceAllImpl;
import com.zougn.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }

    @Test
    public void test1(){
        UserServiceAllImpl service = new UserServiceAllImpl();
        service.setUserDao( new UserDaoMySqlImpl() );
        service.getUser();
        //那我们现在又想用Oracle去实现呢
        service.setUserDao( new UserDaoOracleImpl() );
        service.getUser();
    }

    @Test
    public void test2(){
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceAllImpl serviceImpl = (UserServiceAllImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user");
        //调用对象的方法 .
        user.show();
    }

    @Test
    public void testT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT user = (UserT) context.getBean("userT");
        user.show();
    }

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

        student.show();
//        System.out.println(student.getName());

    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user1");
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
