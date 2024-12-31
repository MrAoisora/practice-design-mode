package com.demo.design.结构型设计模式.外观模式;

/**
 * @Author: Aoisora
 * @Date: 2024-12-31-23:45
 * @Description:
 * @Version 1.0 （版本号）
 */
public class SubSystemA implements SubSystem{
    @Override
    public void doSomething() {
        System.out.println("我是subSystemA...");
    }
}
