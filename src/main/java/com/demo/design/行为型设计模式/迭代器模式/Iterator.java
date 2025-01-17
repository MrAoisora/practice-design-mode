package com.demo.design.行为型设计模式.迭代器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-18-06:58
 * @Description: 迭代器接口
 * @Version 1.0 （版本号）
 */
public interface Iterator {

    /**
     *
     * @return
     */
    boolean haxNext();

    /**
     * 下一个元素
     * @return
     */
    Object next();
}
