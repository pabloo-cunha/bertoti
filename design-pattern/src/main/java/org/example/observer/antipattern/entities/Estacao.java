package org.example.observer.antipattern.entities;

import lombok.Data;

@Data
public class Estacao {

    private double temperatura;
    private double umidade;
    private double pressao;

    public Estacao(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }

    public void setMedicoes(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }

}
