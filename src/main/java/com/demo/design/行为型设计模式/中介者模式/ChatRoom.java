package com.demo.design.行为型设计模式.中介者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-10-18:41
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ChatRoom {

    public static void doSomething(User user,String message){
        System.out.println("名称:" + user.getName() + "信息:" + message);
    }
}
