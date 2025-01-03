package com.demo.design.创建型设计模式.建造者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-03-09:22
 * @Description: 英雄类
 * @Version 1.0 （版本号）
 */
public class Hero {
    @Override
    public String toString() {
        return "Hero{" +
                "weapon=" + weapon +
                ", skill=" + skill +
                ", hp=" + hp +
                ", equipment=" + equipment +
                '}';
    }

    private Weapon weapon;

    private Skill skill;

    private Hp hp;

    private  Equipment equipment;

    /**
     * 私有化构造函数
     * @param builder
     */
    private Hero(Builder builder){
        this.equipment = builder.equipment;
        this.hp = builder.hp;
        this.skill = builder.skill;
        this.weapon = builder.weapon;
    }

    public static class Builder{

        private String name;

        private Weapon weapon;

        private Skill skill;

        private Hp hp;

        private  Equipment equipment;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withWeapon(Weapon weapon){
            this.weapon = weapon;
            return this;
        }

        public Builder withSkill(Skill skill){
            this.skill = skill;
            return this;
        }

        public Builder withHp(Hp hp){
            this.hp = hp;
            return this;
        }

        public Builder withEquipment(Equipment equipment){
            this.equipment = equipment;
            return this;
        }

        /**
         * 创建一个方法返回Hero类型,并把自身builder对象传递进去
         * @return
         */
        public Hero build(){
            return new Hero(this);
        }
    }
}
