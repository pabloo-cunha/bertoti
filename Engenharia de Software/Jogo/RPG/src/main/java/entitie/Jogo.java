package entitie;

import java.util.ArrayList;
import java.util.List;

public class Jogo{

    private List<Arma> armas = new ArrayList<>();
    private List<Habilidade> skills = new ArrayList<>();
    private List<Personagem> chars = new ArrayList<>();


    public void criarSkill(String nome, int dano, String elemento){

        skills.add(new Habilidade(nome, dano, elemento));
    }

    public void criarArma(String nome, int dano){
        armas.add(new Arma(nome, dano));
    }

    public List<Habilidade> exibirListaDeHabilidades(){
        return skills;
    }

    public List<Arma> exibirListaDeArmas(){
        return armas;
    }

    public void criarPersonagem(String nome, String classe, Arma arma, List<Habilidade> skill){
        chars.add(new Personagem(nome, classe, arma, skill));
    }

}
