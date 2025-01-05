package com.demo.design.创建型设计模式.工厂模式.抽象工厂模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:43
 * @Description: 小米工厂类
 * @Version 1.0 （版本号）
 */
public class XiaomiFactory implements AbstractFactory{
    @Override
    public Computer createComputer() {
        return new XiaomiComputer();
    }

    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }
}
