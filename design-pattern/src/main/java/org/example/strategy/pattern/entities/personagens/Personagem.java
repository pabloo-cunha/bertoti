package org.example.strategy.pattern.entities.personagens;

import lombok.Data;
import org.example.strategy.pattern.interfaces.ComportamentoSkills;
import org.example.strategy.pattern.interfaces.ComportamentosArma;

@Data
public class Personagem {

    private ComportamentosArma arma;
    private ComportamentoSkills skills;

    public void atacar() {
        arma.usarArma();
    }

    public void usarSkill(int numSkill) {
        skills.usarSkill(numSkill);
    }

    public void exibirEquipamento() {
        System.out.println("Personagem equipado com: ");
        arma.descricaoEquipamento();
    }
}
