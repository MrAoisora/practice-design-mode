package com.demo.design.创建型设计模式.建造者模式;

/**
 * @Author: Aoisora
 * @Date: 2025-01-03-09:18
 * @Description: 武器类
 * @Version 1.0 （版本号）
 */
public class Weapon {

    private String weaponName;

    public Weapon(String name) {
        this.weaponName = name;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                '}';
    }
}
