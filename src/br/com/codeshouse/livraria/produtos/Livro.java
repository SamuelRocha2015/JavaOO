package br.com.codeshouse.livraria.produtos;
import br.com.codeshouse.livraria.Autor;

@SuppressWarnings("unused")

	public abstract class Livro implements Produto {
			//Demais Atributos e M�todos.
	
			private String titulo;
		    private String descricao;
		    private double valor;
		    private String isbn;
		    private Autor autor;
			    
		    
	    public Livro(Autor autor) {
	        this.autor = autor;
	        this.isbn = "000-00-00000-00-0";
	    }
	
	    
	    public String getTitulo() {
	        return titulo;
	    }
	
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }
	
	    public String getDescricao() {
	        return descricao;
	    }
	
	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
	
	    public double getValor() {
	        return valor;
	    }
	
	    public void setValor(double valor) {
	        this.valor = valor;
	    }
	
	    public String getIsbn() {
	        return isbn;
	    }
	
	    public void setIsbn(String isbn) {
	        this.isbn = isbn;
	    }
	
	    public Autor getAutor() {
	        return autor;
	    }
	
	    public void setAutor(Autor autor) {
	        this.autor = autor;
	    }
	
	    void mostrarDetalhes() {
	        System.out.println("Mostrando os detalhes do Livro");
	        System.out.println("O nome do livro é : " + titulo);
	        System.out.println("Descricao : " + descricao);
	        System.out.println("Preço : " + valor);
	        System.out.println("ISBN : " + isbn);
	        if (this.temAutor()) {
	            autor.mostrarDetalhes();
	        }
	        System.out.println("----------");
	    }
	
	    
	
	    boolean temAutor() {
	        return this.autor != null;
	    }
	
	    public Livro() {
	    }

}
