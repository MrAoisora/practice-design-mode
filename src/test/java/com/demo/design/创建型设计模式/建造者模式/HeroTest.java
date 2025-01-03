package com.demo.design.创建型设计模式.建造者模式;


import org.junit.Test;

/**
 * @Author: Aoisora
 * @Date: 2025-01-03-09:32
 * @Description:
 * @Version 1.0 （版本号）
 */
public class HeroTest {

    @Test
    public void test01(){
        final Hero hero = new Hero.Builder("孙悟空").withEquipment(new Equipment("金库全"))
                .withSkill(new Skill("七十二变"))
                .withWeapon(new Weapon("定海神针"))
                .withHp(new Hp(100))
                .build();
        System.out.println(hero.toString());
    }

}