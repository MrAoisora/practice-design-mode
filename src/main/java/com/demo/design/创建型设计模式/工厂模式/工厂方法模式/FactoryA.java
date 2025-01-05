package com.demo.design.创建型设计模式.工厂模式.工厂方法模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:04
 * @Description: 生产类A 工厂类
 * @Version 1.0 （版本号）
 */
public class FactoryA extends AbstarctFactory{

    @Override
    Product getProduct() {
        return new ProductA();
    }
}
