package com.demo.design.结构型设计模式.享元模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-07-09:06
 * @Description: 享元实现类
 * @Version 1.0 （版本号）
 */
public class CreateFlyweight implements Flyweight{
    private String value;

    public CreateFlyweight(String value){
        this.value = value;
    }


    @Override
    public void request() {
        System.out.println("我是享元模式:" + value);
    }
}
