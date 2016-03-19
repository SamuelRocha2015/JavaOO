package br.com.codeshouse.livraria.produtos;
@SuppressWarnings("unused")
	
	public class MiniLivro  extends Livro implements Promocional {

			
			public boolean aplicaDescontoDe(double porcentagem) {
					return false;
			}
	}



