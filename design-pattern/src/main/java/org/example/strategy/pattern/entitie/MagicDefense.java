package org.example.strategy.pattern.entitie;

import org.example.strategy.pattern.interfaces.DefenseStrategy;

public class MagicDefense implements DefenseStrategy {
    @Override
    public void defense() {
        System.out.println("Magic Defense!");
    }
}
