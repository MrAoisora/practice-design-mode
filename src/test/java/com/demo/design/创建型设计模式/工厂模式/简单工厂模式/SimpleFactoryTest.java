package com.demo.design.创建型设计模式.工厂模式.简单工厂模式;

import org.junit.Test;


/**
 * @Author: Aoisora
 * @Date: 2025-01-05-22:57
 * @Description:
 * @Version 1.0 （版本号）
 */
public class SimpleFactoryTest {


    @Test
    public void test01(){
        final ProductA a = (ProductA) SimpleFactory.request("A");
        final ProductB b = (ProductB) SimpleFactory.request("B");
        final ProductC c = (ProductC) SimpleFactory.request("C");
        a.request();
        b.request();
        c.request();
    }
}