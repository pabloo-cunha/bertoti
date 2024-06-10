package org.example.observer.antipattern.entities;

import lombok.Data;


public class Dashboard extends Estacao{


    public Dashboard(double temperatura, double umidade, double pressao) {
        super(temperatura, umidade, pressao);
    }

    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println("Dashboard atualizado");
    }
}
