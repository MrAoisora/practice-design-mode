package com.demo.design.创建型设计模式.工厂模式.抽象工厂模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:40
 * @Description: 小米手机
 * @Version 1.0 （版本号）
 */
public class XiaomiPhone implements Phone{
    @Override
    public void doSomething() {
        System.out.println("我是小米手机");
    }
}
