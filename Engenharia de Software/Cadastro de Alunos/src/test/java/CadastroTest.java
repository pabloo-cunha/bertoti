import org.junit.Test;

import static org.junit.Assert.*;

public class CadastroTest {

    @Test
    public void cadastro() {
        Cadastro cd = new Cadastro();

        cd.getCadastros().add(new Aluno("Pablo", 27, 6));

        assertEquals(1, 1);
        System.out.println(cd.getCadastros().get(0));
    }
}