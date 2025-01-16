package com.demo.design.行为型设计模式.备忘录模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-16-09:55
 * @Description: 备忘录测试类
 * @Version 1.0 （版本号）
 */
public class MementoTest {

    @Test
    public void test01(){

        // 创建角色对象
        final CareTaker careTaker = new CareTaker();
        // 创建原初对象
        final Originator originator = new Originator();
        originator.setState("第一次新增...");
        final Memento memento = originator.saveToMemento();
        // 保存
        careTaker.add(memento);
        // 新增第二次保存
        originator.setState("第二次修改...");
        final Memento memento1 = originator.saveToMemento();
        careTaker.add(memento1);
        // 新增第三次修改不保存
        originator.setState("第三次修改");

        // 获取第一次和第二次记录
        System.out.println(careTaker.getMemento(0).getState());
        System.out.println(careTaker.getMemento(1).getState());

        // 打印当前记录
        System.out.println(originator.getState());
    }
}