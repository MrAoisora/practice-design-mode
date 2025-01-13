package com.demo.design.行为型设计模式.命令模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-13-17:15
 * @Description:
 * @Version 1.0 （版本号）
 */
public class BrokerTest {


    @Test
    public void test01(){
        final Broker broker = new Broker();
        final Stock stock = new Stock();
        broker.add(new Buy(stock));
        broker.add(new Buy(stock));
        broker.add(new Buy(stock));
        broker.add(new Sell(stock));
        broker.printList();
    }
}