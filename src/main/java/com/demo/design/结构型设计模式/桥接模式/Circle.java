package com.demo.design.结构型设计模式.桥接模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-14-17:25
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Circle extends AbstarctShape{

    private int radius;


    /**
     * 通过构造函数初始化color的值
     *
     * @param color 颜色
     * @param radius 半径
     */
    public Circle(Color color,int radius) {
        super(color);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("圆形的半径是" + radius);
        color.paint("圆形");
    }
}
