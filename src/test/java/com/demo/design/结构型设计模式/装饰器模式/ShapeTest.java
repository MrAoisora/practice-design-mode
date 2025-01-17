package com.demo.design.结构型设计模式.装饰器模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-17-19:09
 * @Description: 装饰器模式测试类
 * @Version 1.0 （版本号）
 */
public class ShapeTest {

    @Test
    public void test01(){
        // 目标类
        final Circle circle = new Circle();
        final Rectangle rectangle = new Rectangle();
        // 装饰器类
        final GrayShapeDeractor grayShapeDeractor = new GrayShapeDeractor(circle);
        final GrayShapeDeractor grayShapeDeractor1 = new GrayShapeDeractor(rectangle);
        final GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(circle);
        final GreenShapeDecorator greenShapeDecorator1 = new GreenShapeDecorator(rectangle);
        // 通过调用装饰器类来实现增强并调用目标方法
        grayShapeDeractor.draw();
        grayShapeDeractor1.draw();
        greenShapeDecorator.draw();
        greenShapeDecorator1.draw();
    }

}