package com.demo.design.创建型设计模式.单例模式.饿汉式;


import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-19:53
 * @Description: 单例模式测试类
 * @Version 1.0 （版本号）
 */
public class SingletonTest {

    @Test
    public void test01(){
        final Singleton singleton = Singleton.getSingleton();
        final Singleton singleton1 = Singleton.getSingleton();
        // 断言两个对象指向同一个引用 为true
        Assert.assertEquals(singleton == singleton1,true);
    }
}