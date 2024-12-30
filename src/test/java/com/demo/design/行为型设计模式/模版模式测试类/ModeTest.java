package com.demo.design.行为型设计模式.模版模式测试类;

import com.demo.design.行为型设计模式.模版模式.RequsetImpl;
import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2024-12-30-22:41
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ModeTest {

    @Test
    public void test01(){
        final RequsetImpl requset = new RequsetImpl();
        requset.service();
    }
}
