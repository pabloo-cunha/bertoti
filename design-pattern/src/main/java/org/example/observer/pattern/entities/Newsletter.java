package org.example.observer.pattern.entities;

import lombok.Data;
import org.example.observer.pattern.interfaces.Assinante;
import org.example.observer.pattern.interfaces.News;

import java.util.ArrayList;
import java.util.List;

@Data
public class Newsletter implements News {

    private List<Assinante> assinantes;
    private String mensagem;

    public Newsletter(){
        assinantes = new ArrayList<>();
    }

    @Override
    public void registrarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    @Override
    public void removerAssinante(Assinante assinante) {
        if (assinantes.isEmpty()){
            System.out.println("Não há assinantes para remover");
        } else {
            assinantes.remove(assinante);
        }
    }

    @Override
    public void notificarAssinantes(String mensagem) {
        if (assinantes.isEmpty()){
            System.out.println("Não há assinantes para notificar");
        } else {
            this.mensagem = mensagem;
            for (Assinante assinante : assinantes){
                assinante.update(mensagem);
            }
        }
    }

    public void listarAssinantes(){
        if (assinantes.isEmpty()){
            System.out.println("Não há assinantes");
        } else {
            for (Assinante assinante : assinantes){
                System.out.println(assinante);
            }
        }
    }
}
