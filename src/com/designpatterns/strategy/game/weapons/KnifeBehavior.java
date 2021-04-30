package com.designpatterns.strategy.game.weapons;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Using Knife");
    }
}
