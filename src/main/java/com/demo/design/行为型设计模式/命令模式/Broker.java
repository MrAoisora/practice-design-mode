package com.demo.design.行为型设计模式.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Aoisora
 * @Date: 2025-01-13-17:14
 * @Description:
 * @Version 1.0 （版本号）
 */
public class Broker {

    private List<Command> list = new ArrayList<>();


    /**
     * 添加命令
     * @param command
     */
    public void add(Command command){
        list.add(command);
    }

    /**
     * 遍历命令
     */
    public void printList(){
        for (Command command : list) {
            command.execute();
        }
        list.clear();
    }
}
