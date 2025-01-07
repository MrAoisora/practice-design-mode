package com.demo.design.结构型设计模式.享元模式;


import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-07-09:12
 * @Description: 享元模式测试类
 * @Version 1.0 （版本号）
 */
public class FlyweightFactoryTest {

    @Test
    public void test01(){
        final Flyweight a = FlyweightFactory.getFlyweight("A");
        a.request();
        final Flyweight a1 = FlyweightFactory.getFlyweight("A");
        a1.request();
        final Flyweight b = FlyweightFactory.getFlyweight("B");
        b.request();
        Assert.assertEquals(true,a == a1);
        System.out.println(a == a1);
    }
}