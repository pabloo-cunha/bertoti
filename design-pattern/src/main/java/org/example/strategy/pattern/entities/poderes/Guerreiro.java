package org.example.strategy.pattern.entities.poderes;

import org.example.strategy.pattern.interfaces.ComportamentoSkills;

public class Guerreiro implements ComportamentoSkills {

    @Override
    public void usarSkill(int numSkill) {
        switch (numSkill) {
            case 1:
                usarFortificar();
                break;
            case 2:
                usarGolpeRapido();
                break;
            case 3:
                usarGolpeForte();
                break;
            default: break;
        }
    }

    private void usarFortificar() {
        System.out.println("Fortificar!");
    }

    private void usarGolpeRapido() {
        System.out.println("Golpe Rapido!");
    }

    private void usarGolpeForte() {
        System.out.println("Golpe Forte!");
    }
}
