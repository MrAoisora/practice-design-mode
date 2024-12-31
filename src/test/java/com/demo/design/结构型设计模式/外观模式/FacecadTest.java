package com.demo.design.结构型设计模式.外观模式;

import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2024-12-31-23:55
 * @Description: 外观模式测试类
 * @Version 1.0 （版本号）
 */
public class FacecadTest {

    @Test
    public void test01(){
        final Facecad facecad = new Facecad();
        facecad.request();
    }
}
