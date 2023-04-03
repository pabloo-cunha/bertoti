package entitie;

import java.util.ArrayList;
import java.util.List;

public class Habilidade {

    private String nome;
    private int dano;
    private String elemento;
    private List<Habilidade> skills = new ArrayList<>();

    public Habilidade(String nome, int dano, String elemento) {
        this.nome = nome;
        this.dano = dano;
        this.elemento = elemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public List<Habilidade> getSkills() {
        return skills;
    }

    public void setSkills(List<Habilidade> skills) {
        this.skills = skills;
    }


}
