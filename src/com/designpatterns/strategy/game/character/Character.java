package com.designpatterns.strategy.game.character;

import com.designpatterns.strategy.game.weapons.WeaponBehavior;

public abstract class Character {

    private int healthBar = 100;

    WeaponBehavior weaponBehavior;
    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public int getHealthBar() {
        return healthBar;
    }

    public void reduceHealthBar(int healthBar) {
        this.healthBar -= healthBar;
    }
}
