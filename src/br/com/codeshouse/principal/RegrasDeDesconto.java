package br.com.codeshouse.principal;

import br.com.codeshouse.livraria.Autor;
import br.com.codeshouse.livraria.produtos.MiniLivro;


@SuppressWarnings("unused")
	
	public class RegrasDeDesconto {
			public static void main(String[] args) {
				
					Autor autor = new Autor();
					autor.setNome("Rodrigo Machado");
					
					MiniLivro livro = new MiniLivro();
					livro.setValor(39.90);

					if (!livro.aplicaDescontoDe(0.3)) {
							System.out.println("Desconto no livor não pode ser maior que 30%");
					} else {
							System.out.println("Valor com desconto : " + livro.getValor());
					}
			}
	}




