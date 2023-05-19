package academia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    Usuario user;

    @BeforeEach
    void setUp() {
        user = new Usuario("Pablo", 27, 1.65, 67d, 60d);
    }

    @Test
    void getNome() {
        user.getNome();
        assertEquals("Pablo", user.getNome());
    }

    @Test
    void setNome() {
        user.setNome("João");
        assertEquals("João", user.getNome());
    }

    @Test
    void getIdade() {
        assertEquals(27, user.getIdade());
    }

    @Test
    void setIdade() {
        user.setIdade(28);
        assertEquals(28, user.getIdade());
    }

    @Test
    void getAltura() {
        assertEquals(1.65, user.getAltura());
    }

    @Test
    void setAltura() {
        user.setAltura(1.67);
        assertEquals(1.67, user.getAltura());
    }

    @Test
    void getPesoAtual() {
        assertEquals(67d, user.getPesoAtual());
    }

    @Test
    void setPesoAtual() {
        user.setPesoAtual(64d);
        assertEquals(64d, user.getPesoAtual());
    }

    @Test
    void getMetaDePeso() {
        assertEquals(60d, user.getMetaDePeso());
    }

    @Test
    void setMetaDePeso() {
        user.setMetaDePeso(62d);
        assertEquals(62d, user.getMetaDePeso());
    }
}