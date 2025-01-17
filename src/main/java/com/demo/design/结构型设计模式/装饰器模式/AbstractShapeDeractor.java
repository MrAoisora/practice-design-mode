package com.demo.design.结构型设计模式.装饰器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-17-18:47
 * @Description: 扩展形状接口
 * @Version 1.0 （版本号）
 */
public abstract class AbstractShapeDeractor implements Shape{

    protected Shape shape;

    public AbstractShapeDeractor(Shape shape) {
        this.shape = shape;
    }

    /**
     * 使用抽象类实现接口方法,给原先的接口方法做增强
     */
    @Override
    public void draw() {
        //增强方法
        paint();
        //目标方法
        shape.draw();
    }

    /**
     * 增强方法
     */
    public abstract void paint();
}
