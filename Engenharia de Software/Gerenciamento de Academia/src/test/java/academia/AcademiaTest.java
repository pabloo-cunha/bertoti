package academia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AcademiaTest {

    private Academia academia;
    @BeforeEach
    void setUp() {
        academia = new Academia();
    }

    @Test
    void cadastrarUsuarios() {
        academia.cadastrarUsuarios("Pablo", 27, 1.65, 67.0, 65);
        academia.cadastrarUsuarios("João", 29, 1.85, 60.0, 65);
        academia.cadastrarUsuarios("Maria", 27, 1.65, 67.0, 67.0);

        List<Usuario> cadastro = academia.getCadastros();
        assertEquals(3, cadastro.size());
        assertEquals("Pablo", cadastro.get(0).getNome());
        assertEquals("João", cadastro.get(1).getNome());
        assertEquals("Maria", cadastro.get(2).getNome());
    }

    @Test
    void cadastrarAula() {
        Aula aula = new Aula("Musculação", "10h");
        academia.cadastrarAula(aula);
        List<Aula> disponivel = academia.getAulasDisponiveis();
        assertEquals("Musculação", disponivel.get(0).getModalidade());
        assertEquals("10h", disponivel.get(0).getHorario());
    }

    @Test
    void buscarUsuario() {
        academia.cadastrarUsuarios("João", 25, 1.75, 82.4, 75.0);
        academia.cadastrarUsuarios("Maria", 30, 1.65, 60.0, 55.0);

        List<Usuario> encontrados = academia.buscarUsuario("Maria");
        assertEquals("Maria", encontrados.get(0).getNome());
        assertEquals(1, encontrados.size());

        List<Usuario> naoEncontrados = academia.buscarUsuario("Pablo");
        assertEquals(0, naoEncontrados.size());
    }
}