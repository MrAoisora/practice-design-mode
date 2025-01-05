package com.demo.design.创建型设计模式.工厂模式.抽象工厂模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:39
 * @Description: 小米电脑
 * @Version 1.0 （版本号）
 */
public class XiaomiComputer implements Computer{
    @Override
    public void doSomething() {
        System.out.println("我是小米电脑");
    }
}
