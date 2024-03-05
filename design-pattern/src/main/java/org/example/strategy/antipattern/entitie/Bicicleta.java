package org.example.strategy.antipattern.entitie;

public class Bicicleta extends Veiculo{

        private String modelo;
        private String marca;

        public Bicicleta(String marca, String modelo) {
            super(marca, modelo);
        }

        @Override
        public void acelerar(){
            super.acelerar();
        }
}
