package org.example.observer.antipattern.entities;

public class PrevisaoDoTempo extends Estacao{


    public PrevisaoDoTempo(double temperatura, double umidade, double pressao) {
        super(temperatura, umidade, pressao);
    }

    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println("Previsao do tempo atualizada");
    }

}
