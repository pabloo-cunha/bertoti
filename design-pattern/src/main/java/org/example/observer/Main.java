package org.example.observer;

import org.example.observer.pattern.entities.AssinanteA;
import org.example.observer.pattern.entities.Newsletter;
import org.example.observer.pattern.entities.AssinanteB;
import org.example.observer.pattern.interfaces.Assinante;

public class Main {

    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        Assinante email = new AssinanteA("pablo@fatec.com.br");
        Assinante email2 = new AssinanteA("joao@fatec.com.br");

        Assinante sms = new AssinanteB("1298810-2019");

        newsletter.registrarAssinante(email);
        newsletter.registrarAssinante(email2);
        newsletter.registrarAssinante(sms);

        newsletter.notificarAssinantes("Nova newsletter disponível!");
        newsletter.listarAssinantes();
    }
}
