package org.example.strategy.pattern;

import org.example.strategy.pattern.entities.armas.Adaga;
import org.example.strategy.pattern.entities.armas.Espada;
import org.example.strategy.pattern.entities.personagens.Personagem;
import org.example.strategy.pattern.entities.poderes.Guerreiro;

public class Main {

    public static void main(String[] args) {

        Personagem arthur = new Personagem();

        //escolher a arma
        arthur.setArma(new Espada());
        arthur.atacar();

        //trocar de arma
        arthur.setArma(new Adaga());
        arthur.atacar();

        //escolher a classe das skills
        arthur.setSkills(new Guerreiro());
        arthur.usarSkill(1);
        arthur.usarSkill(2);
        arthur.usarSkill(3);

        arthur.exibirEquipamento();
        arthur.atacar();
        arthur.setArma(new Espada());
        arthur.exibirEquipamento();
        arthur.atacar();
    }
}
