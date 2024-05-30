package org.example.strategy.pattern.entities.armas;

import org.example.strategy.pattern.interfaces.ComportamentosArma;

public class Espada implements ComportamentosArma {

    @Override
    public void usarArma() {
        System.out.println("Ataque de Espada!");
    }

    public void descricaoEquipamento() {
        System.out.println("Espada de Duas Mãos!");
    }
}
