package com.demo.design.行为型设计模式.中介者模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-10-18:45
 * @Description:
 * @Version 1.0 （版本号）
 */
public class UserTest {

    @Test
    public void test01(){
        final User user = new User("张三");
        user.request("test");
        final User user1 = new User("李四");
        user1.request("test2");
    }
}