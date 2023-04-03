package application;

import entitie.Habilidade;
import entitie.Jogo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogo jg = new Jogo();
        boolean status = true;
        System.out.println("cadastrar skill");

        while(status) {
            System.out.println("\t---------------\t");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Elemento: ");
            String elemento = sc.nextLine();
            System.out.print("Dano: ");
            int dano = sc.nextInt();
            sc.nextLine();
            jg.criarSkill(nome, dano, elemento);

            System.out.println("Cadastrar outra habilidade? sim ou não?");
            String op= sc.nextLine();
            if (op.equals("nao"))
                status = false;

        for (Habilidade x: jg.exibirListaDeHabilidades()){
            System.out.println(x.getNome() + ", " + x.getDano());
        }

        }



    }
}
