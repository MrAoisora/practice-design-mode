package com.demo.design.行为型设计模式.备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Aoisora
 * @Date: 2025-01-16-09:51
 * @Description: 负责人角色
 * @Version 1.0 （版本号）
 */
public class CareTaker {

    private List<Memento> list = new ArrayList<>();


    /**
     * 新增元素
     * @param memento
     */
    public void add(Memento memento){
        list.add(memento);
    }

    /**
     * 返回元素
     * @param index
     * @return
     */
    public Memento getMemento(int index){
        return list.get(index);
    }
}
