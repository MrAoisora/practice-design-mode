package com.demo.design.创建型设计模式.工厂模式.工厂方法模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:00
 * @Description: 产品A
 * @Version 1.0 （版本号）
 */
public class ProductA implements Product{
    @Override
    public void doSomething() {
        System.out.println("我是工厂方法模式的产品A");
    }
}
