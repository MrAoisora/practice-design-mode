package com.demo.design.行为型设计模式.状态模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-08-06:18
 * @Description: 关灯类
 * @Version 1.0 （版本号）
 */
public class TurnOff implements State {
    @Override
    public void doSomething(Context context) {
        System.out.println("关灯...");
        // 更新状态为开灯
        context.setState(new TurnOn());
    }
}
