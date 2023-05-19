package academia;

public class Usuario {
    private String nome;
    private int idade;
    private double altura;
    private double pesoAtual;
    private double metaDePeso;

    public Usuario(String nome, int idade, double altura, double pesoAtual, double metaDePeso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.pesoAtual = pesoAtual;
        this.metaDePeso = metaDePeso;
    }

    public Usuario() {
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public double getMetaDePeso() {
        return metaDePeso;
    }

    public void setMetaDePeso(double metaDePeso) {
        this.metaDePeso = metaDePeso;
    }

}
