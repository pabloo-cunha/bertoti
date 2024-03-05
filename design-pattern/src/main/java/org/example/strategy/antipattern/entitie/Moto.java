package org.example.strategy.antipattern.entitie;

public class Moto extends Veiculo{

    private String modelo;
    private String marca;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(){
        super.acelerar();
    }

}
