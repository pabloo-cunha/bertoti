import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro cd = new Cadastro();
        System.out.println("Cadastro de Alunos");
        System.out.println();

        System.out.print("nome: ");
        String nome = sc.nextLine();

        System.out.print("idade: ");
        int idade = sc.nextInt();

        System.out.println("notas: ");
        System.out.print("a1: ");
        double a1 = sc.nextDouble();
        System.out.print("a2: ");
        double a2 = sc.nextDouble();
        System.out.print("a3: ");
        double a3 = sc.nextDouble();
        System.out.print("a4: ");
        double a4 = sc.nextDouble();

        double media = (a1 + a2 + a3 + a4) / 4;
        cd.getCadastros().add(new Aluno(nome, idade, media));

        for(Aluno aluno: cd.getCadastros()){
            System.out.println(aluno);
        }


    }
}
