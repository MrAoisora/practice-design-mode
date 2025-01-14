package com.demo.design.结构型设计模式.侨接模式;

import com.demo.design.结构型设计模式.桥接模式.*;
import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-14-17:29
 * @Description:
 * @Version 1.0 （版本号）
 */
public class BridgeModeTest {

    @Test
    public void test01(){
        final Blue blue = new Blue();
        final Red red = new Red();
        final Gray gray = new Gray();
        final Circle blueCircle = new Circle(blue, 10);
        final Circle redCircle = new Circle(red, 20);
        final Rectangle rectangle = new Rectangle(gray);
        blueCircle.draw();
        redCircle.draw();
        rectangle.draw();
    }
}
