package com.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * Created by Paser on 2019/3/4.
 */
@Alias("user")//定义别名
public class User implements Serializable {
    private int userId;
    private String name;
    private int age;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
