package com.designpatterns.strategy.game.character;

import com.designpatterns.strategy.game.weapons.AxeBehavior;

public class Troll extends Character{

    public Troll(){
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
