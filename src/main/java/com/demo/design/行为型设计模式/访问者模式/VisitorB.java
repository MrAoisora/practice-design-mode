package com.demo.design.行为型设计模式.访问者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-21-09:29
 * @Description:
 * @Version 1.0 （版本号）
 */
public class VisitorB implements Visitor{
    @Override
    public void visit(ElementA elementA) {
        System.out.println("具体访问类B操作--->" + elementA.doSomething());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("具体访问类B操作--->" + elementB.doSomething());
    }
}
