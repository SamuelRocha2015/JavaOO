package br.com.codeshouse.livraria.produtos;
import br.com.codeshouse.livraria.Editora;

@SuppressWarnings("unused")

	public class Revista implements Produto, Promocional {
			//Demais Atributos e Métodos
	
	
			private String titulo;
			private String descricao;
			private double valor;
			private Editora editora;
			
			public boolean aplicaDescontoDe(double porcentagem){
				 if (porcentagem > 0.1) {
			            return false;
			     }
			     double desconto = getValor() * porcentagem;
			     setValor(getValor() - desconto);
			     System.out.println("Aplicando Desconto no Livro Fisico");
			     return true;
			}
			
			//Getters e Seterrs 
			
			
			

			public String getNome() {
				return titulo;
			}

			public void setNome(String nome) {
				this.titulo = nome;
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

			public Editora getEditora() {
				return editora;
			}

			public void setEditora(Editora editora) {
				this.editora = editora;
			}
			
	}
