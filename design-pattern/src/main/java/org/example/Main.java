package org.example;

import org.example.strategy.pattern.entitie.Character;

public class Main {

    public static void main(String[] args) {
        Character knight = new Character();
        Character mage = new Character();

        knight.display();
        mage.display();

        knight.performAttack();
        mage.performDefense();

        mage.performMagicAttack();
        knight.performDefense();

    }

}