package com.demo.design.行为型设计模式.迭代器模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-18-07:12
 * @Description:
 * @Version 1.0 （版本号）
 */
public class AggregateImplTest {

    @Test
    public void test01(){
        final AggregateImpl aggregate = new AggregateImpl();
        final Iterator iterator = aggregate.getIterator();
        while (iterator.haxNext()){
            System.out.println(iterator.next().toString());
        }
    }

}