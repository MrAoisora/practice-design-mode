package com.demo.design.行为型设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Aoisora
 * @Date: 2025-01-15-09:11
 * @Description:
 * @Version 1.0 （版本号）
 */
public abstract class Subject {

    private List<Observer> list = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer
     */
    public void add(Observer observer){
        list.add(observer);
    }

    /**
     * 移除观察者
     * @param index
     */
    public void remove(int index){
        list.remove(index);
    }

    /**
     * 通知观察者
     */
    public void traversal(){
        for (Observer observer : list) {
            // 观察者做出相应动作
            observer.observer();
        }
    }

    public abstract void request();
}
