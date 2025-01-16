package com.demo.design.行为型设计模式.备忘录模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-16-09:41
 * @Description: 记录类
 * @Version 1.0 （版本号）
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
