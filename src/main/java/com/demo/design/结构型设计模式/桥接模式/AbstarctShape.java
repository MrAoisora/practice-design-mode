package com.demo.design.结构型设计模式.桥接模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-14-17:22
 * @Description: 抽象类
 * @Version 1.0 （版本号）
 */
public abstract class AbstarctShape {


    protected Color color;

    /**
     * 通过构造函数初始化color的值
     * @param color
     */
    public AbstarctShape(Color color){
        this.color = color;
    }

    public abstract void draw();
}
