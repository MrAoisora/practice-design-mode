package com.demo.design.结构型设计模式.装饰器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-17-19:02
 * @Description:
 * @Version 1.0 （版本号）
 */
public class GreenShapeDecorator extends AbstractShapeDeractor {

    public GreenShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void paint() {
        System.out.println("我是绿色的...");
    }
}
