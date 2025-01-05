package com.demo.design.创建型设计模式.工厂模式.工厂方法模式;

import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:10
 * @Description: 工厂方法模式测试类
 * @Version 1.0 （版本号）
 */
public class FactoryTest {

    @Test
    public void test01(){
        final FactoryA factoryA = new FactoryA();
        final FactoryB factoryB = new FactoryB();
        final FactoryC factoryC = new FactoryC();
        final ProductA productA = (ProductA) factoryA.getProduct();
        final ProductB productB = (ProductB) factoryB.getProduct();
        final ProductC productC = (ProductC) factoryC.getProduct();

        productA.doSomething();
        productB.doSomething();
        productC.doSomething();
    }
}
