package com.designpatterns.strategy.game.character;

import com.designpatterns.strategy.game.weapons.BowAndArrowBehavior;

public class CharacterTest {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.fight();

        Character queen = new Queen();
        queen.fight();

        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.fight();
    }
}
