package com.designpatterns.strategy.game.weapons;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Using Axe");
    }
}
