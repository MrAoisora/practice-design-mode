package com.demo.design.行为型设计模式.责任链模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-09-09:09
 * @Description: 处理器实现类A
 * @Version 1.0 （版本号）
 */
public class ConcreateHandleA extends Handle{
    @Override
    public void doSomething(String str) {
        if("A".equals(str)){
            System.out.println("我是处理器A...");

        }else if("B".equals(str)){
            nextHandle.doSomething("B");
        } else{
            System.out.println("未找到合适的处理器...");
        }
    }
}
