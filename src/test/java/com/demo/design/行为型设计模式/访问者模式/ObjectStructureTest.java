package com.demo.design.行为型设计模式.访问者模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-21-09:35
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ObjectStructureTest {

    @Test
    public void test01(){
        final ObjectStructure objectStructure = new ObjectStructure();
        // 创建具体元素
        final ElementA elementA = new ElementA();
        final ElementB elementB = new ElementB();
        objectStructure.add(elementA);
        objectStructure.add(elementB);
        // 创建访问者a
        final VisitorA visitorA = new VisitorA();
        objectStructure.accept(visitorA);
        System.out.println("------------------------");
        final VisitorB visitorB = new VisitorB();
        objectStructure.accept(visitorB);
    }
}