package library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class Testes {

	@Test
	void test() {
		
		Biblioteca bib = new Biblioteca();
		
		bib.addLivro(new Livro("Engenharia de Software", "Sommerville"));
		
		assertEquals(bib.getLivros().size(), 1);
		
		bib.addLivro(new Livro("Engenharia de Software segunda edicao", "Sommerville"));
		
		assertEquals(bib.getLivros().size(), 2);
		
		List<Livro> busca = bib.buscarLivroNome("Engenharia de Software segunda edicao");
		
		assertEquals(busca.size(), 1);
		assertEquals(busca.get(0).getAutor(), "Sommerville");
		
	}

}
