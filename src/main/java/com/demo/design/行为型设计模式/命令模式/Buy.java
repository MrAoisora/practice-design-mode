package com.demo.design.行为型设计模式.命令模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-13-17:12
 * @Description: 实现命令接口的购买类
 * @Version 1.0 （版本号）
 */
public class Buy implements Command{

    private Stock stock;

    public Buy(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
