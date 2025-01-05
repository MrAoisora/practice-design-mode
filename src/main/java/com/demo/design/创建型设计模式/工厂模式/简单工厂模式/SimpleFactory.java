package com.demo.design.创建型设计模式.工厂模式.简单工厂模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-21:46
 * @Description: 简单工厂类
 * @Version 1.0 （版本号）
 */
public class SimpleFactory {

    public static Product request(String type){
        Product product = null;

        switch (type){
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            case "C":
                product = new ProductC();
                break;
            default:
                product = null;
        }

        return product;
    }
}
