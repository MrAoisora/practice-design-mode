package com.demo.design.结构型设计模式.代理模式.动态代理.cglib动态代理;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-21:48
 * @Description: 代理处理器->cglib不需要自己传入目标类对象,jdk动态代理需要自己传入目标类类对象
 * @Version 1.0 （版本号）
 */
public class ProxyHandle implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始cglib动态代理...");
        final Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib代理结束...");
        return obj;
    }
}
