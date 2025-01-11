package com.demo.design.结构型设计模式.组合模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-11-08:07
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ComponentTest {

    @Test
    public void test01(){
        // 红色小袋子
        final Bag redSmallBag = new Bag();
        final Goods good1 = new Goods("熬源特产",7.9,2);
        final Goods good2 = new Goods("熬源地图",9.9,1);
        redSmallBag.add(good1);
        redSmallBag.add(good2);

        // 中袋子
        final Bag middleBag = new Bag();
        final Goods good3 = new Goods("景德镇瓷器", 380, 1);
        middleBag.add(good3);
        middleBag.add(redSmallBag);

        // 白色小袋子
        final Bag whileSmallBag = new Bag();
        final Goods good4 = new Goods("韶关香菇", 68, 2);
        final Goods good5 = new Goods("韶关红茶", 180, 3);
        whileSmallBag.add(good4);
        whileSmallBag.add(good5);

        // 大袋子
        final Bag bigBag = new Bag();
        final Goods good6 = new Goods("李宁牌运动鞋", 198, 1);
        bigBag.add(good6);
        bigBag.add(whileSmallBag);
        bigBag.add(middleBag);


        //打印
        bigBag.operation();


    }
}