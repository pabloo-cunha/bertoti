package academia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AulaTest {

    private Aula aula;

    @BeforeEach
    void setUp() {
        aula = new Aula("Musculação", "10h");
    }

    @Test
    void getModalidade() {
        assertEquals("Musculação", aula.getModalidade());
    }

    @Test
    void setModalidade() {
        aula.setModalidade("Natação");
        assertEquals("Natação", aula.getModalidade());
    }

    @Test
    void getHorario() {
        assertEquals("10h", aula.getHorario());
    }

    @Test
    void setHorario() {
        aula.setHorario("12h");
        assertEquals("12h", aula.getHorario());
    }

    @Test
    void getMaxAlunos() {
        assertEquals(4, aula.getMaxAlunos());
    }

    @Test
    void getInscricoes() {
        Usuario usuario = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        aula.inscreverUsuarioNaAula(usuario);
        List<Usuario> encontrados = aula.getInscricoes();
        assertEquals(1, encontrados.size());
    }

    @Test
    void inscreverUsuario() {
        Usuario usuario = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        aula.inscreverUsuarioNaAula(usuario);
        assertEquals("Pablo", usuario.getNome());
    }

    @Test
    void cancelarInscricao() {
        Usuario usuario = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        aula.inscreverUsuarioNaAula(usuario);
        List<Usuario> encontrados = aula.getInscricoes();
        assertEquals(1, encontrados.size());

        aula.cancelarInscricaoDaAula(usuario);
        List<Usuario> excluindo = aula.getInscricoes();
        assertEquals(0, excluindo.size());
    }

    @Test
    void verificarDisponibilidade() {
        Aula aula = new Aula("Zumba", "18:00");
        Usuario usuario = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        Usuario usuario2 = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        Usuario usuario3 = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        Usuario usuario4 = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        aula.inscreverUsuarioNaAula(usuario);
        aula.inscreverUsuarioNaAula(usuario2);
        aula.inscreverUsuarioNaAula(usuario3);
        aula.inscreverUsuarioNaAula(usuario4);


        boolean disponibilidade = aula.verificarDisponibilidade();

        assertFalse(disponibilidade);

    }
}