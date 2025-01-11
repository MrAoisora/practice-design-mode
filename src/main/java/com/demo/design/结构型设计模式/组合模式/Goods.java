package com.demo.design.结构型设计模式.组合模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-11-07:58
 * @Description: 商品类
 * @Version 1.0 （版本号）
 */
public class Goods implements Component{


     private String name;
     private double price;
     private int num;


    public Goods(String name, double price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    /**
     * 添加商品
     * @param component
     */
    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void operation() {

    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
