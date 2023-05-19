package academia;

import java.util.ArrayList;
import java.util.List;

public class Evolucao {
    private Usuario associado;
    private String duracao;
    private List<Registro> exercicios = new ArrayList<>();

    public Evolucao() {
    }

    public Evolucao(Usuario associado) {
        this.associado = associado;
        this.exercicios = new ArrayList<>();
    }

    public Usuario getAssociado() {
        return associado;
    }

    public void setAssociado(Usuario associado) {
        this.associado = associado;
    }

    public List<Registro> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Registro> exercicios) {
        this.exercicios = exercicios;
    }

    public void adicionarRegistros(Registro registro){
        exercicios.add(registro);
    }

    public double calcularEvolucao(Usuario pesoAtual, Usuario metaDePeso){
        return pesoAtual.getPesoAtual() - metaDePeso.getPesoAtual();
    }
}
