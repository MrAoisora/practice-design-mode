package com.demo.design.行为型设计模式.模版模式;

/**
 * @Author: Aoisora
 * @Date: 2024-12-30-22:37
 * @Description: 抽象类
 * @Version 1.0 （版本号）
 */
public abstract class AbstractRequset {

    public  void service(){
        System.out.println("第一步...");
        request();
        System.out.println("结束");
    }

    public abstract void request();
}





