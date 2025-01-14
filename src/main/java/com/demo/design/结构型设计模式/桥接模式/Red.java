package com.demo.design.结构型设计模式.桥接模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-14-17:20
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Red implements Color{
    @Override
    public void paint(String shape) {
        System.out.println("红色的" + shape);
    }
}
