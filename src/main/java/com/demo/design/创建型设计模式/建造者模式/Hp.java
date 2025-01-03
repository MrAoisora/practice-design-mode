package com.demo.design.创建型设计模式.建造者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-03-09:20
 * @Description: 血量类
 * @Version 1.0 （版本号）
 */
public class Hp {
    private int count;

    public Hp(int i) {
        this.count = i;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "count=" + count +
                '}';
    }
}
