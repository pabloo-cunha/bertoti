package academia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    private Registro reg;
    @BeforeEach
    void setUp() {
        Usuario usuario = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        reg = new Registro(usuario, "11h", "Musculação", "1h");
    }

    @Test
    void getUsuario() {
        Usuario usuario = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        reg.setUsuario(usuario);
        Usuario resultado = reg.getUsuario();
        assertEquals("Pablo", resultado.getNome());
    }

    @Test
    void setUsuario() {
        Usuario usuario = new Usuario("Pablo", 27, 1.65, 65.5, 70);
        reg.setUsuario(usuario);
        Usuario resultado = reg.getUsuario();
        assertEquals("Pablo", resultado.getNome());

        reg.getUsuario().setNome("João");
        Usuario editado = reg.getUsuario();
        assertEquals("João", editado.getNome());
    }

    @Test
    void getHorarioDeRegistro() {
        assertEquals("11h", reg.getHorarioDeRegistro());
    }

    @Test
    void setHorarioDeRegistro() {
        reg.setHorarioDeRegistro("12h");
        assertEquals("12h", reg.getHorarioDeRegistro());
    }

    @Test
    void getModalidade() {
        assertEquals("Musculação", reg.getModalidade());
    }

    @Test
    void setModalidade() {
        reg.setModalidade("Natação");
        assertEquals("Natação", reg.getModalidade());
    }

    @Test
    void getDuracao() {
        assertEquals("1h", reg.getDuracao());
    }

    @Test
    void setDuracao() {
        reg.setDuracao("2h");
        assertEquals("2h", reg.getDuracao());
    }
}