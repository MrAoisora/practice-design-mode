package com.demo.design.行为型设计模式.策略模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-04-18:58
 * @Description: a * b
 * @Version 1.0 （版本号）
 */
public class StrategyB implements Strategy{


    /**
     * a * b
     * @param a
     * @param b
     * @return
     */
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
