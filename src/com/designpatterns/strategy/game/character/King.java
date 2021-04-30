package com.designpatterns.strategy.game.character;

public class King extends Character{
    @Override
    public void fight() {
        if (weaponBehavior == null)
            System.out.println("No Weapons");
        else
            weaponBehavior.useWeapon();
    }
}
