package com.demo.design.结构型设计模式.装饰器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-17-18:52
 * @Description:
 * @Version 1.0 （版本号）
 */
public class GrayShapeDeractor extends AbstractShapeDeractor{

    public GrayShapeDeractor(Shape shape) {
        super(shape);
    }

    /**
     * 重写draw方法,由当前子类作为具体实现*/
    @Override
    public void paint() {
        System.out.println("我是灰色的...");
    }

}
