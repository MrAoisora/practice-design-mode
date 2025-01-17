package com.demo.design.行为型设计模式.迭代器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-18-07:02
 * @Description: 聚合接口,用来获取迭代器
 * @Version 1.0 （版本号）
 */
public interface Aggregate {

    /**
     * 获取迭代器接口
     * @return
     */
    Iterator getIterator();
}
