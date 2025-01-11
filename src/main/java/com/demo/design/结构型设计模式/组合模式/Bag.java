package com.demo.design.结构型设计模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Aoisora
 * @Date: 2025-01-11-08:00
 * @Description: 背包类
 * @Version 1.0 （版本号）
 */
public class Bag implements Component{

    private List<Component> list = new ArrayList<>();


    /**
     * 添加货物
     * @param component
     */
    @Override
    public void add(Component component) {
        list.add(component);
    }

    /**
     * 删除货物
     * @param index
     */
    @Override
    public void remove(int index) {
        list.remove(index);
    }

    /**
     * 打印商品
     */
    @Override
    public void operation() {
        for (Component component : list) {
            if(component instanceof Goods){
                System.out.println(component.toString());
            }else {
                component.operation();
            }
        }
    }
}
