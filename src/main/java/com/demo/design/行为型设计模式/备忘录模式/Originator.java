package com.demo.design.行为型设计模式.备忘录模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-16-09:44
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    /**
     * 封装成Memento类
     */
    public Memento saveToMemento(){
        return new Memento(state);
    }

    /**
     * 获取状态
     */
    public String getStateFromMemento(Memento memento){
        return memento.getState();
    }
}
