package com.demo.design.行为型设计模式.命令模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-13-17:11
 * @Description: 实现命令接口的售卖类
 * @Version 1.0 （版本号）
 */
public class Sell implements Command{

    private Stock stock;

    public Sell(Stock stock){
        this.stock = stock;
    }


    @Override
    public void execute() {
        stock.sell();
    }
}
