package org.example.observer.pattern.entities;

import lombok.Data;
import org.example.observer.pattern.interfaces.Assinante;

@Data
public class AssinanteA implements Assinante {

    private String email;

    public AssinanteA(String email) {
        this.email = email;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("Email para " + email + ": "+ mensagem);
    }
}
