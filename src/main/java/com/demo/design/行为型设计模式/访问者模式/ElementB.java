package com.demo.design.行为型设计模式.访问者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-21-09:25
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        // 把自己作为参数传递
        visitor.visit(this);
    }

    @Override
    public String doSomething() {
        return "具体元素B操作";
    }
}
