package com.demo.design.行为型设计模式.责任链模式;

import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-09-09:12
 * @Description: 责任链测试类
 * @Version 1.0 （版本号）
 */
public class HandleTest {


    @Test
    public void test01(){
        final ConcreateHandleA concreateHandleA = new ConcreateHandleA();
        concreateHandleA.setNextHandle(new ConcreateHandleB());
        concreateHandleA.doSomething("A");
        concreateHandleA.doSomething("B");
        concreateHandleA.doSomething("C");
    }
}
