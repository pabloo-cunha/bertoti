package org.example.strategy.antipattern.entitie;

public class Main {

    public static void main(String[] args) {
        Veiculo veiculo = new Carro("Fiat", "Uno");
        veiculo.acelerar();

        veiculo = new Moto("Honda", "CG");
        veiculo.acelerar();

    }
}
