package com.demo.design.结构型设计模式.代理模式.动态代理.jdk动态代理;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-20:19
 * @Description: 目标类
 * @Version 1.0 （版本号）
 */
public interface Target {
    void doSomething();
    void request();
    void request(String name);
}
