package com.demo.design.结构型设计模式.适配器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-01-22:36
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Source implements Target{


    @Override
    public void doSomeThing() {
        System.out.println("我是源对象的方法");
    }
}
