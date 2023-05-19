package academia;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Usuario> cadastros = new ArrayList<>();
    private List<Aula> aulasDisponiveis = new ArrayList<>();

    public List<Usuario> getCadastros() {
        return cadastros;
    }

    public void setCadastros(List<Usuario> cadastros) {
        this.cadastros = cadastros;
    }

    public List<Aula> getAulasDisponiveis() {
        return aulasDisponiveis;
    }

    public void setAulasDisponiveis(List<Aula> aulasDisponiveis) {
        this.aulasDisponiveis = aulasDisponiveis;
    }

    public void cadastrarUsuarios(String nome, int idade, double altura, double peso, double metaDePeso){
        cadastros.add(new Usuario(nome, idade, altura, peso, metaDePeso));
    }

    public void cadastrarAula(Aula aula){
        aulasDisponiveis.add(aula);
    }

    public List<Usuario> buscarUsuario(String nome) {
        List<Usuario> encontrados = new ArrayList<>();

        for (Usuario usuario : cadastros) {
            if (usuario.getNome().equals(nome)) {
                encontrados.add(usuario);
            }
        }

        return encontrados;
    }

}
