package com.demo.design.创建型设计模式.建造者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-03-09:22
 * @Description: 装备类
 * @Version 1.0 （版本号）
 */
public class Equipment {

    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                '}';
    }
}
