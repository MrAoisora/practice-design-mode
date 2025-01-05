package com.demo.design.创建型设计模式.工厂模式.抽象工厂模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:42
 * @Description:
 * @Version 1.0 （版本号）
 */
public interface AbstractFactory {

    Computer createComputer();
    Phone createPhone();
}
