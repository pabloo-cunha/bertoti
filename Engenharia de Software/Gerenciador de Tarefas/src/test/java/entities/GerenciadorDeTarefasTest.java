package entities;

import org.junit.Before;

import java.util.List;

import static org.junit.Assert.*;

public class GerenciadorDeTarefasTest {
    GerenciadorDeTarefas gerenciador;
    GerenciadorDeTarefas gerenciador2;

    @Before
    public void setUp(){
        gerenciador = new GerenciadorDeTarefas("Compras");
        gerenciador2 = new GerenciadorDeTarefas("Viagem", "Programar viagens");
        gerenciador.getGerenciadores().add(gerenciador);
        gerenciador.getGerenciadores().add(gerenciador2);
    }

    @org.junit.Test
    public void getTitulo() {
        String titulo = gerenciador.getTitulo();
        assertEquals("Compras", titulo);
    }

    @org.junit.Test
    public void setTitulo() {
        gerenciador.setTitulo("Lista de Compras");
        String novoTitulo = gerenciador.getTitulo();
        assertEquals("Lista de Compras", novoTitulo);
    }

    @org.junit.Test
    public void getDescricao() {
        String descricao = gerenciador2.getDescricao();
        assertEquals("Programar viagens", descricao);
    }

    @org.junit.Test
    public void setDescricao() {
        gerenciador2.setDescricao("Custo baixo");
        String novaDescricao = gerenciador2.getDescricao();
        assertEquals("Custo baixo", novaDescricao);
    }

    @org.junit.Test
    public void getTarefas() {
        List<Tarefas> tarefas = gerenciador.getTarefas();
        assertNotNull(tarefas);
        assertEquals(0, tarefas.size());
    }

    @org.junit.Test
    public void setTarefas() {
    }

    @org.junit.Test
    public void criarNovo() {
        gerenciador.criarNovo("Novo Gerenciador", "Ola mundo");
        List<Tarefas> tarefa  = gerenciador.getTarefas();
        assertNotNull(tarefa);
        tarefa.add(new Tarefas("tarefa 1"));
        assertEquals(1, tarefa.size());
        assertEquals("tarefa 1", tarefa.get(0).getDescricao());

    }

    @org.junit.Test
    public void addTarefa() {
        gerenciador.getTarefas().add(new Tarefas("tarefa 1"));
        gerenciador2.getTarefas().add(new Tarefas("tarefa 2"));
        List<Tarefas> tarefas1 = gerenciador.getTarefas();
        List<Tarefas> tarefas2 = gerenciador2.getTarefas();
        assertNotNull(tarefas1);
        assertNotNull(tarefas2);
        assertEquals(1, tarefas1.size());
        assertEquals(1, tarefas2.size());

    }

    @org.junit.Test
    public void excluirTarefa() {
        gerenciador.getTarefas().add(new Tarefas("nova tarefa"));
        gerenciador.excluirTarefa("nova tarefa");
        List<Tarefas> tarefa = gerenciador.getTarefas();
        assertNotNull(tarefa);
        assertEquals(0, tarefa.size());
    }
}