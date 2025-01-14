package com.demo.design.结构型设计模式.桥接模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-14-18:21
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Rectangle extends AbstarctShape{
    /**
     * 通过构造函数初始化color的值
     *
     * @param color
     */
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint("矩形");
    }
}
