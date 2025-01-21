package com.demo.design.行为型设计模式.访问者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-21-09:22
 * @Description: 访问者类
 * @Version 1.0 （版本号）
 */
public interface Visitor {

    void visit(ElementA elementA);
    void visit(ElementB elEmentB);

}
