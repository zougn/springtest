package com.zougn.pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class User {
//    private Cat cat;
//    private Dog dog;

//    @Autowired
//    private Cat cat;
//    @Autowired
//    private Dog dog;


    /*@Qualifier
    @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
    @Qualifier不能单独使用。*/
//    @Autowired
//    @Qualifier(value = "cat2")
//    private Cat cat;
//    @Autowired
//    @Qualifier(value = "dog2")
//    private Dog dog;


    /*@Resource
    @Resource如有指定的name属性，先按该属性进行byName方式查找装配；
    其次再进行默认的byName方式进行装配；
    如果以上都不成功，则按byType的方式自动装配。
    都不成功，则报异常。*/

    @Resource(name = "cat2")
    private Cat cat;
    @Resource
    private Dog dog;

    private String str;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", str='" + str + '\'' +
                '}';
    }
}