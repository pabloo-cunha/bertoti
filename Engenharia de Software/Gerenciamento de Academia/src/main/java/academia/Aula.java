package academia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula {
    private String modalidade;
    private String horario;
    private final int maxAlunos = 4;
    private List<Usuario> inscricoes = new ArrayList<>();

    public Aula() {
    }

    public Aula(String modalidade, String horario) {
        this.modalidade = modalidade;
        this.horario = horario;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public List<Usuario> getInscricoes() {
        return inscricoes;
    }

    public void inscreverUsuarioNaAula(Usuario usuario){
        inscricoes.add(usuario);
    }

    public void cancelarInscricaoDaAula(Usuario usuario){
        inscricoes.remove(usuario);
        inscricoes.removeAll(Collections.singleton(null));
    }

    public boolean verificarDisponibilidade(){
        return inscricoes.size() < maxAlunos;
    }
}
