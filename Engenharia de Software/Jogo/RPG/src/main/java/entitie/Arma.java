package entitie;

import java.util.ArrayList;
import java.util.List;

public class Arma {

    private String nome;
    private int ataque;

    private List<Arma> armas = new ArrayList<>();

    public Arma(String nome, int poder) {
        this.nome = nome;
        this.ataque = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
