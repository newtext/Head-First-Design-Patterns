package com.designpatterns.strategy.game.character;

public class Queen extends Character {
    @Override
    public void fight() {
        if (weaponBehavior == null)
            System.out.println("No Weapons");
        else
            weaponBehavior.useWeapon();

        System.out.println(getHealthBar());
        reduceHealthBar(10);
        System.out.println(getHealthBar());
    }
}
