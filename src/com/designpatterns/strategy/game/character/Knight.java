package com.designpatterns.strategy.game.character;

import com.designpatterns.strategy.game.weapons.SwordBehavior;

public class Knight extends Character{

    public Knight(){
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
