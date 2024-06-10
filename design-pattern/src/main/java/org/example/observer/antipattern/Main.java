package org.example.observer.antipattern;

import org.example.observer.antipattern.entities.Dashboard;
import org.example.observer.antipattern.entities.Estacao;
import org.example.observer.antipattern.entities.Estatistica;
import org.example.observer.antipattern.entities.PrevisaoDoTempo;

public class Main {

    public static void main(String[] args) {

        Estacao estacao = new Estacao(20, 50, 1013);
        Dashboard dashboard = new Dashboard(20, 50, 1013);
        Estatistica estatistica = new Estatistica(20, 50, 1013);
        PrevisaoDoTempo previsaoDoTempo = new PrevisaoDoTempo(20, 50, 1013);

        estacao.setMedicoes(21, 51, 1014);
        dashboard.atualizar(estacao.getTemperatura(), estacao.getUmidade(), estacao.getPressao());
        estatistica.atualizar(estacao.getTemperatura(), estacao.getUmidade(), estacao.getPressao());
        previsaoDoTempo.atualizar(estacao.getTemperatura(), estacao.getUmidade(), estacao.getPressao());


    }
}
