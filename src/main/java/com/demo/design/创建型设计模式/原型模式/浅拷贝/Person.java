package com.demo.design.创建型设计模式.原型模式.浅拷贝;

import java.util.List;

/**
 * @Author: Aoisora
 * @Date: 2025-01-19-06:21
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Person implements Cloneable{
    private String name;
    private int age;
    private List<String> zhengshu;

    public List<String> getZhengshu() {
        return zhengshu;
    }

    public Person(String name, int age, List<String> zhengshu) {
        this.name = name;
        this.age = age;
        this.zhengshu = zhengshu;
    }

    public Person() {
    }

    public void setZhengshu(List<String> zhengshu) {
        this.zhengshu = zhengshu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", zhengshu=" + zhengshu +
                '}';
    }

    @Override
    public Object clone(){
        Person clone = null;
        try {
            // 调用超类object的克隆方法
            clone = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 返回一个克隆人
        return clone;
    }
}
