package entitie;

import java.util.ArrayList;
import java.util.List;

public class Personagem{

    private final int pontosDeVida = 100;

    private String nome;
    private String classe;

    private Arma arma;
    private List<Habilidade> skills = new ArrayList<>();

    public Personagem(String nome, String classe, Arma arma, List<Habilidade> skills) {
        this.nome = nome;
        this.classe = classe;
        this.arma = arma;
        this.skills = skills;
    }

    public Personagem() {
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public List<Habilidade> getSkills() {
        return skills;
    }

    public void setSkills(List<Habilidade> skills) {
        this.skills = skills;
    }




}
