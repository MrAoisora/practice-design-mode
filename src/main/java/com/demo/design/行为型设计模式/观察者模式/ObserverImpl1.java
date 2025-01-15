package com.demo.design.行为型设计模式.观察者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-15-09:09
 * @Description: 观察者1实现类
 * @Version 1.0 （版本号）
 */
public class ObserverImpl1 implements Observer{
    @Override
    public void observer() {
        System.out.println("观察者1接受到信息并进行处理...");
    }
}
