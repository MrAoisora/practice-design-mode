package com.demo.design.行为型设计模式.中介者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-10-18:42
 * @Description:
 * @Version 1.0 （版本号）
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void request(String message){
        ChatRoom.doSomething(this, message);
    }
}
