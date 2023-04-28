import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private List<Aluno> cadastros = new ArrayList<>();
    private Aluno aluno;

    public List<Aluno> getCadastros() {
        return cadastros;
    }

    public void setCadastros(List<Aluno> cadastros) {
        this.cadastros = cadastros;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
