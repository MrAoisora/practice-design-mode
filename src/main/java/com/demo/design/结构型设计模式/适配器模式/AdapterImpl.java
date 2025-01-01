package com.demo.design.结构型设计模式.适配器模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-01-22:41
 * @Description:
 * @Version 1.0 （版本号）
 */
public class AdapterImpl implements Adapter{

    Target target;

    public AdapterImpl(Target target){
        this.target = target;
    }

    @Override
    public void request() {
        // 调用转换器的方法实际是调用源目标的方法
        target.doSomeThing();
    }
}
