package com.demo.design.行为型设计模式.观察者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-15-09:17
 * @Description: 实现类
 * @Version 1.0 （版本号）
 */
public class SubjectImpl extends Subject{
    @Override
    public void request() {
        // 模拟被观察者发生了某种变化
        System.out.println("被观察者发生了变化....");
        // 通知观察者
        this.traversal();
    }
}
