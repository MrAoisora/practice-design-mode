package com.demo.design.创建型设计模式.单例模式.饱汉式;

/**
 * @Author: Aoisora
 * @Date: 2024-12-29-19:57
 * @Description: 双重检查锁饱汉式
 * @Version 1.0 （版本号）
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        if(singleton == null){ // 只有为null时才去竞争锁资源
            synchronized (Singleton.class){
                if(singleton == null ){ // 再次判断避免其他通过第一个null值判断线程已经获取锁了创建成功了,避免当前获取锁的线程再去创建对象
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
