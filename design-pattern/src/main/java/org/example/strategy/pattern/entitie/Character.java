package org.example.strategy.pattern.entitie;

import org.example.strategy.pattern.interfaces.AttackStrategy;
import org.example.strategy.pattern.interfaces.DefenseStrategy;

public class Character {

    AttackStrategy attackStrategy;
    DefenseStrategy defenseStrategy;

    public Character() {
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performMagicAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        defenseStrategy.defense();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void display(){
        System.out.println("Personagem 1");
    }
}
