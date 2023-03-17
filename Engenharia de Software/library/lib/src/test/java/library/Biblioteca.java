package library;


import java.util.List;
import java.util.LinkedList;

public class Biblioteca {
	
	private List<Livro> livros = new LinkedList<Livro>();
	
	public void addLivro(Livro livro) {
		livros.add(livro);
	}

	
	public List<Livro> buscarLivroNome(String nome){
		List<Livro> encontrados = new LinkedList<Livro>();
		for(Livro livro:livros) {
			if(livro.getTitulo().equals(nome)) encontrados.add(livro); 
		}
		return encontrados;
	}
	
	public List<Livro> getLivros(){
		return livros;
	}
	
}
