package org.example.observer.antipattern.entities;

public class Estatistica extends Estacao{


    public Estatistica(double temperatura, double umidade, double pressao) {
        super(temperatura, umidade, pressao);
    }

    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println("Estatistica atualizada");
    }
}
