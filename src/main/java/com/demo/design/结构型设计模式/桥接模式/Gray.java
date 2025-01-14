package com.demo.design.结构型设计模式.桥接模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-14-17:21
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Gray implements Color{
    @Override
    public void paint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
