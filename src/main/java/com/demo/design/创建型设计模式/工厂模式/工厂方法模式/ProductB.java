package com.demo.design.创建型设计模式.工厂模式.工厂方法模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:01
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ProductB implements Product{
    @Override
    public void doSomething() {
        System.out.println("我是工厂方法模式的产品B");
    }
}
