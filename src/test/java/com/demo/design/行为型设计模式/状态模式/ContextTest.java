package com.demo.design.行为型设计模式.状态模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-08-06:20
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ContextTest {

    @Test
    public void test01(){
        // 初始状态设置为开灯
        final Context context = new Context(new TurnOn());
        context.request();
        // 第二次调用为关灯
        context.request();
        // 第三次调用为开灯
        context.request();
        // ...后面以此类推
    }
}