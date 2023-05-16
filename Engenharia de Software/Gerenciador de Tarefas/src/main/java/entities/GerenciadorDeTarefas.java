package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GerenciadorDeTarefas {
    private String titulo;
    private String descricao;
    private List<Tarefas> tarefas;
    private List<GerenciadorDeTarefas> gerenciadores = new ArrayList<>();

    public GerenciadorDeTarefas(String titulo) {
        this.titulo = titulo;
        this.tarefas = new ArrayList<>();
    }

    public GerenciadorDeTarefas(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
        this.tarefas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Tarefas> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefas> tarefas) {
        this.tarefas = tarefas;
    }

    public List<GerenciadorDeTarefas> getGerenciadores() {
        return gerenciadores;
    }

    public void criarNovo(String titulo, String descricao) {
        gerenciadores.add(new GerenciadorDeTarefas(titulo));
    }

    public void addTarefa(GerenciadorDeTarefas tituloGerenciador, String tarefa) {
        for (GerenciadorDeTarefas gerenciador : gerenciadores) {
            if (gerenciador == tituloGerenciador) {
                tituloGerenciador.getTarefas().add(new Tarefas(tarefa));
            } else
                System.out.println("Essa task não existe.");

        }
    }
    public void excluirTarefa(String titulo) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(titulo));
    }
}