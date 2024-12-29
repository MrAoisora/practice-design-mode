package com.demo.design.结构型设计模式.代理模式.动态代理.cglib动态代理;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-20:42
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Service {
    public void service(){
        System.out.println("我是service方法...");
    }
    public void service(String name){
        System.out.println("我是service方法..." + name);
    }
}
