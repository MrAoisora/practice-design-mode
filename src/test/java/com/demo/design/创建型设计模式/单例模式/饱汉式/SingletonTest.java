package com.demo.design.创建型设计模式.单例模式.饱汉式;


import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-20:04
 * @Description:
 * @Version 1.0 （版本号）
 */
public class SingletonTest {

    @Test
    public void test01() {

        final Singleton singleton = Singleton.getSingleton();
        final Singleton singleton1 = Singleton.getSingleton();
        Assert.assertEquals(singleton1 == singleton, true);
    }
}