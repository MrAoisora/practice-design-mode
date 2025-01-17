package com.demo.design.结构型设计模式.装饰器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-17-18:50
 * @Description: 圆形
 * @Version 1.0 （版本号）
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("我是圆形...");
    }
}
