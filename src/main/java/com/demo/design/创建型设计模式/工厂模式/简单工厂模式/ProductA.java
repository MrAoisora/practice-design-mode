package com.demo.design.创建型设计模式.工厂模式.简单工厂模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-21:46
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ProductA implements Product {

    @Override
    public void request() {
        System.out.println("我是产品A");
    }
}
