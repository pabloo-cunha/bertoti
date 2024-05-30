package org.example.strategy.pattern.entities.armas;

import org.example.strategy.pattern.interfaces.ComportamentosArma;

public class Adaga implements ComportamentosArma {

    @Override
    public void usarArma() {
        System.out.println("Ataque de Adaga!");
    }

    @Override
    public void descricaoEquipamento() {
        System.out.println("Adaga de Duas Mãos!");
    }


}
