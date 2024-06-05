package org.example.observer.pattern.entities;

import lombok.Data;
import org.example.observer.pattern.interfaces.Assinante;

@Data
public class AssinanteB implements Assinante {

    private String numeroCelular;

    public AssinanteB(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("SMS para " + numeroCelular + ": " + mensagem);
    }
}
