package com.demo.design.行为型设计模式.观察者模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-15-09:21
 * @Description:
 * @Version 1.0 （版本号）
 */
public class SubjectTest {

    @Test
    public void test01(){
        final ObserverImpl1 observerImpl1 = new ObserverImpl1();
        final ObserverImpl2 observerImpl2 = new ObserverImpl2();
        final SubjectImpl subject = new SubjectImpl();
        // 添加观察者
        subject.add(observerImpl1);
        subject.add(observerImpl2);
        // 调用方法
        subject.request();
    }
}