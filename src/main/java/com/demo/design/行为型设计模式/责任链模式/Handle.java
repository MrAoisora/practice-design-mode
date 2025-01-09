package com.demo.design.行为型设计模式.责任链模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-09-09:07
 * @Description: 处理器抽象类
 * @Version 1.0 （版本号）
 */
public abstract class Handle {
    protected Handle nextHandle;

    public void setNextHandle(Handle nextHandle){
        this.nextHandle = nextHandle;
    }

    public abstract void doSomething(String str);
}
