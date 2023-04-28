public class Aluno {

    private String nome;
    private int idade;
    private double mediaNotas;

    public Aluno(String nome, int idade, double mediaNotas) {
        this.nome = nome;
        this.idade = idade;
        this.mediaNotas = mediaNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "nome: " + nome +
                ", idade: " + idade +
                ", media das notas: " + mediaNotas;
    }
}
