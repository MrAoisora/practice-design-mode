package com.demo.design.结构型设计模式.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Aoisora
 * @Date: 2025-01-07-09:08
 * @Description: 享元工厂
 * @Version 1.0 （版本号）
 */
public class FlyweightFactory {
    // 使用缓存
    private static Map<String,Flyweight> map = new HashMap<>();

    // 获取享元类
    public static Flyweight getFlyweight(String value){
        if(!map.containsKey(value)){
            map.put(value,new CreateFlyweight(value));
        }
        return map.get(value);
    }
}
