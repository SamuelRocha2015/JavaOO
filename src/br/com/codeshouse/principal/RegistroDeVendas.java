package br.com.codeshouse.principal;
import br.com.codeshouse.livraria.Autor;
import br.com.codeshouse.livraria.produtos.CarrinhoDeCompras;
import br.com.codeshouse.livraria.produtos.Ebook;
import br.com.codeshouse.livraria.produtos.LivroFisico;
import br.com.codeshouse.livraria.produtos.Produto;

@SuppressWarnings("unused")

	public class RegistroDeVendas {
			public static void main(String[] args) {

				Autor autor = new Autor();
				autor.setNome("Rodrigo Machado");
					
				LivroFisico fisico = new LivroFisico();
				fisico.setTitulo("Programação Orientada a Testes");
				fisico.setValor(59.90);
				fisico.setAutor(autor);
				
				Ebook ebook = new Ebook();
				ebook.setTitulo("Programação Orientada a Testes");
				ebook.setValor(29.90);
				ebook.setAutor(autor);
				
				CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
				carrinho.adiciona(fisico);
				carrinho.adiciona(ebook);
				
				System.out.println("Total: " + carrinho.getTotal());
			
				
				for (Produto produto : carrinho.getProdutos()){
					System.out.println(produto);
				}
				
			}
	}


