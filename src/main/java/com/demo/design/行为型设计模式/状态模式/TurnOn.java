package com.demo.design.行为型设计模式.状态模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-08-06:16
 * @Description: 开灯类
 * @Version 1.0 （版本号）
 */
public class TurnOn implements State{
    @Override
    public void doSomething(Context context) {
        System.out.println("开灯...");
        // 更新状态为关灯
        context.setState(new TurnOff());
    }
}
