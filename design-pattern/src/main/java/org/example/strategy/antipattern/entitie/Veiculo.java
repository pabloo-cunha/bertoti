package org.example.strategy.antipattern.entitie;

public class Veiculo {

    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }
}
