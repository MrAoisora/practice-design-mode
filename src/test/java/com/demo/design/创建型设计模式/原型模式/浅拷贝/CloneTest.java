package com.demo.design.创建型设计模式.原型模式.浅拷贝;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Aoisora
 * @Date: 2025-01-19-06:26
 * @Description: 克隆模式测试类
 * @Version 1.0 （版本号）
 */
public class CloneTest {


    @Test
    public void test01() throws CloneNotSupportedException {
        final List<String> zhengshu = new ArrayList<>();
        zhengshu.add("英语四级");
        zhengshu.add("大学本科");
        final Person human = new Person();
        human.setAge(18);
        human.setName("李逍遥");
        human.setZhengshu(zhengshu);
        // 打印原型
        System.out.println(human.toString());
        // 打印克隆人
        final Person clone = (Person) human.clone();
        System.out.println(clone.toString());
        // 尝试修改克隆人属性是否会对原型产生影响
        System.out.println("尝试修改克隆人属性是否会对原型产生影响");
        clone.setName("赵灵儿");
        clone.setAge(20);
        zhengshu.add("日语N2");
        System.out.println(human.toString());
        System.out.println(clone.toString());
        System.out.println("得出结论:不管是修改原型还是克隆人两个对象,基础类型跟String类型都是直接赋值的,相互不会互相影响,浅拷贝的引用类型指向" +
                "同一个内存地址,不管修改原型还是克隆对象都会产生数据更新");
    }
}