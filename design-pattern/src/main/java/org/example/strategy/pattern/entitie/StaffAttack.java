package org.example.strategy.pattern.entitie;

import org.example.strategy.pattern.interfaces.AttackStrategy;

public class StaffAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Magic Staff Attack!");
    }
}
