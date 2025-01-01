package com.demo.design.结构型设计模式.适配器模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-01-22:43
 * @Description:
 * @Version 1.0 （版本号）
 */
public class AdapterImplTest {

    @Test
    public void test01(){
        final AdapterImpl adapter = new AdapterImpl(new Source());
        adapter.request();
    }

}