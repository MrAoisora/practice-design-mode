package com.demo.design.行为型设计模式.责任链模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-09-09:11
 * @Description: 处理器类B
 * @Version 1.0 （版本号）
 */
public class ConcreateHandleB extends Handle{
    @Override
    public void doSomething(String str) {
        System.out.println("我是处理器B...");
    }
}
