package org.example.strategy.pattern.entitie;

import org.example.strategy.pattern.interfaces.AttackStrategy;

public class SwordAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Heavy Sword Attack!");
    }
}
