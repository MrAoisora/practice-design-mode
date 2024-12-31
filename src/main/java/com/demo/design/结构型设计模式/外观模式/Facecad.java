package com.demo.design.结构型设计模式.外观模式;

/**
 * @Author: Aoisora
 * @Date: 2024-12-31-23:50
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Facecad {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facecad(){
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public void request(){
        subSystemA.doSomething();
        subSystemB.doSomething();
        subSystemC.doSomething();
    }
}
