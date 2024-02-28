package org.example.composite.entitie;

import java.util.ArrayList;
import java.util.List;

public class Professor implements Component{

    private String nome;
    private String matricula;
    private List<Component> professores = new ArrayList<>();

    public Professor() {
    }

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void add(Component component) {
        professores.add(component);
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void getProfessores() {
        for (Component component : professores) {
            System.out.println(component.getNome());
        }
    }

}
