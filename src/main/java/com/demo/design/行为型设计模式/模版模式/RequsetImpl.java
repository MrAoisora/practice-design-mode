package com.demo.design.行为型设计模式.模版模式;

/**
 * @Author: Aoisora
 * @Date: 2024-12-30-22:40
 * @Description:
 * @Version 1.0 （版本号）
 */
public class RequsetImpl extends AbstractRequset{
    @Override
    public void request() {
        System.out.println("此处由开发者自定义...");
        System.out.println("第二步...");
        System.out.println("第三步...");
        System.out.println("第n步...");
    }
}
