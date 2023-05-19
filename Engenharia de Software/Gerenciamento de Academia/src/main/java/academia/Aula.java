package academia;

import java.time.LocalTime;
import java.util.List;

public class Aula {
    private String modalidade;
    private LocalTime horario;
    private final int maxAlunos = 15;
    private List<Usuario> inscricoes;

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public List<Usuario> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Usuario> inscricoes) {
        this.inscricoes = inscricoes;
    }

    public void inscreverUsuario(Usuario nome){
        inscricoes.add(nome);
    }

    public void cancelarInscricao(Usuario nome){
        inscricoes.remove(nome);
    }

    public boolean verificarDisponibilidade(){
        return inscricoes.size() < maxAlunos;
    }
}
