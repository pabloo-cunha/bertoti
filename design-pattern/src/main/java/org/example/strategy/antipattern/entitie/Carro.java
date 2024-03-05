package org.example.strategy.antipattern.entitie;

public class Carro extends Veiculo{

    private String modelo;
    private String marca;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(){
        super.acelerar();
    }
}
