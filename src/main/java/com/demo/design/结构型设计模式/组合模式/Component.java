package com.demo.design.结构型设计模式.组合模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-11-07:56
 * @Description: 组件接口
 * @Version 1.0 （版本号）
 */
public interface Component {

    void add(Component component);
    void remove(int index);
    void operation();
}
