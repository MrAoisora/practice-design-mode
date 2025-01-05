package com.demo.design.行为型设计模式.策略模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-04-18:58
 * @Description: 调用类
 * @Version 1.0 （版本号）
 */
public class Context {

    private Strategy strategy;

    /**
     * 将不同的策略注入调用类,实现不同的策略调用
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 策略方法调用
     * @param a
     * @param b
     * @return
     */
    public int request(int a ,int b){
        return strategy.execute(a,b);
    }
}
