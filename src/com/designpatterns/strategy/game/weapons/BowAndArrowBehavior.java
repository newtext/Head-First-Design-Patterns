package com.designpatterns.strategy.game.weapons;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Using Bow and Arrow");
    }
}
