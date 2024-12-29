package com.demo.design.创建型设计模式.单例模式.饿汉式;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-19:52
 * @Description: 饿汉式
 * @Version 1.0 （版本号）
 */
public class Singleton {
    private final static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }
}
