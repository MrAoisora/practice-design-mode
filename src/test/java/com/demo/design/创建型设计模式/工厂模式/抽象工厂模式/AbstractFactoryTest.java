package com.demo.design.创建型设计模式.工厂模式.抽象工厂模式;

import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-05-23:47
 * @Description:
 * @Version 1.0 （版本号）
 */
public class AbstractFactoryTest {

    @Test
    public void test01(){
        final HuaweiFactory huaweiFactory = new HuaweiFactory();
        final XiaomiFactory xiaomiFactory = new XiaomiFactory();
        // 华为
        final Computer huaweiFactoryComputer = huaweiFactory.createComputer();
        final Phone huaweiFactoryPhone = huaweiFactory.createPhone();
        huaweiFactoryComputer.doSomething();
        huaweiFactoryPhone.doSomething();

        // 小米
        final Computer xiaomiFactoryComputer = xiaomiFactory.createComputer();
        final Phone xiaomiFactoryPhone = xiaomiFactory.createPhone();
        xiaomiFactoryComputer.doSomething();
        xiaomiFactoryPhone.doSomething();


    }
}
