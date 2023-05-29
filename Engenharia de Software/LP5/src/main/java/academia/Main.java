package academia;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aviao aviao = new Aviao("A190", 2, "Azul");
        Aviao aviao2 = new Aviao("Boing", 3, "Vermelho");

        System.out.println(aviao.getModelo());
        System.out.println(aviao2.getModelo());
        System.out.println(aviao.getFabricante());
        System.out.println(aviao2.getFabricante());
        System.out.println(aviao.getCor());
        System.out.println(aviao2.getCor());

        aviao.addPassageiro("Jonathan");
        aviao.addValor();
        aviao.addPassageiro("Lucas");
        aviao.addValor();
        aviao.addPassageiro("Cordeiro");
        aviao.addValor();

        for (String passageiro: aviao.getPassageiro()){
            System.out.println(passageiro);
        }

        System.out.println(aviao.getValorRecebido());
    }
}