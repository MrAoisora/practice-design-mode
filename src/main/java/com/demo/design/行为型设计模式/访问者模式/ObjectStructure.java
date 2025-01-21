package com.demo.design.行为型设计模式.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Aoisora
 * @Date: 2025-01-21-09:32
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    /**
     * 遍历并执行具体元素方法
     * @param visitor
     */
    public void accept(Visitor visitor){
        for (Element element : list) {
            element.accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }
}
