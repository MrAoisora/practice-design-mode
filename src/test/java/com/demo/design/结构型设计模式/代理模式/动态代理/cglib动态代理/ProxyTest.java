package com.demo.design.结构型设计模式.代理模式.动态代理.cglib动态代理;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-22:44
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ProxyTest {
    @Test
    public void test01(){
        final Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service.class);
        enhancer.setCallback(new ProxyHandle());
        final Service service = (Service) enhancer.create();
        service.service();
        service.service("赵灵儿");

    }
}
