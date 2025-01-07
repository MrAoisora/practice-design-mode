package com.demo.design.行为型设计模式.状态模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-08-06:13
 * @Description: 上下文类
 * @Version 1.0 （版本号）
 */
public class Context {

    private State state; // 定义状态

    public void setState(State state){
        this.state = state;
    }

    public Context(State state){
        this.state = state;
    }

    // 执行状态方法
    public void request(){
        state.doSomething(this);
    }
}
