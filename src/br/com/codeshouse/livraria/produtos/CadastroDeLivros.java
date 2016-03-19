package br.com.codeshouse.livraria.produtos;
import br.com.codeshouse.livraria.Autor;

@SuppressWarnings("unused")

	public class CadastroDeLivros {
		    public static void main(String[] args) {
		    	
		        Autor autor = new Autor();
		        autor.setNome("Henrique Dias");
		        autor.setCpf("098.123.764-28");
		        autor.setEmail("henrique.dias@novaeditora.com.br");
		        
		        LivroFisico livro = new LivroFisico();
		        livro.setTitulo("Aprendendo Java");
		        livro.setDescricao("Domine a Linguagem de programação Java");
		        livro.setValor(59.90);
		        livro.setIsbn("978-85-23456-98-4");
		        
		        livro.setAutor(autor);        
		        //demais livros e autores cadastrados
		    }
	}
	

