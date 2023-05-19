package academia;

public class Registro {
    private Usuario usuario;
    private String horarioDeRegistro;
    private String modalidade;
    private String duracao;

    public Registro(Usuario usuario, String horarioDeRegistro, String modalidade, String duracao) {
        this.usuario = usuario;
        this.horarioDeRegistro = horarioDeRegistro;
        this.modalidade = modalidade;
        this.duracao = duracao;
    }

    public Registro() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getHorarioDeRegistro() {
        return horarioDeRegistro;
    }

    public void setHorarioDeRegistro(String horarioDeRegistro) {
        this.horarioDeRegistro = horarioDeRegistro;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
