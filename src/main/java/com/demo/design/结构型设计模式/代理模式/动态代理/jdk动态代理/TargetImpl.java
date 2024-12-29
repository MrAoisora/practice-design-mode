package com.demo.design.结构型设计模式.代理模式.动态代理.jdk动态代理;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-20:20
 * @Description:
 * @Version 1.0 （版本号）
 */
public class TargetImpl implements Target{
    @Override
    public void doSomething() {
        System.out.println("我是目标类的doSomething...");
    }

    @Override
    public void request() {
        System.out.println("我是目标类的request...");
    }

    @Override
    public void request(String name) {
        System.out.println("我是目标类的requset...输出名称" + name);
    }
}
