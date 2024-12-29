package com.demo.design.结构型设计模式.代理模式.动态代理.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-20:24
 * @Description: 创建代理核心处理器 -> 用作返回代理对象
 * @Version 1.0 （版本号）
 */
public class ProxyHandler implements InvocationHandler {

    private Target target;

    public ProxyHandler(Target target){
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("============ 我是代理类,开始执行代理 ============");
        System.out.println("开始执行目标对象方法...");
//        invoke(目标对象,参数)
        method.invoke(target,args);
        System.out.println("============     我是代理类,代理完成 ============");
        // 返回代理对象
        return proxy;
    }
}
