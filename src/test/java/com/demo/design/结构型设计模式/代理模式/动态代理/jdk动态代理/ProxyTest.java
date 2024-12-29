package com.demo.design.结构型设计模式.代理模式.动态代理.jdk动态代理;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-20:23
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ProxyTest {

    @Test
    public void test01(){

        // 创建目标类
        final TargetImpl target = new TargetImpl();

        // 创建代理对象
        final Target proxyInstance = (Target) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new ProxyHandler(target));
        proxyInstance.doSomething();
        proxyInstance.request();
        proxyInstance.request("赵灵儿");
    }
}
