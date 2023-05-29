package academia;

import java.util.ArrayList;
import java.util.List;

public class Aviao {
    private String modelo;
    private int fabricante;
    private String cor;
    private Integer valorRebido = 0;

    private List<String> passageiros = new ArrayList<>();

    public Aviao(String modelo, int fabricante, String cor){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getFabricante(){
        return fabricante;
    }

    public Integer getValorRecebido(){
        return valorRebido;
    }

    public String getCor(){
        return cor;
    }

    public List<String> getPassageiro(){
        return passageiros;
    }

    public void addPassageiro(String nome){
        passageiros.add(nome);
    }

    public void removePassageiro(String nome){
        passageiros.remove(nome);
    }

    public void addValor(){
        this.valorRebido += 5;
    }

}
