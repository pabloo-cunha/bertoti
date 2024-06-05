package org.example.observer.pattern.interfaces;

public interface News {

    void registrarAssinante(Assinante assinante);
    void removerAssinante(Assinante assinante);
    void notificarAssinantes(String mensagem);
}
