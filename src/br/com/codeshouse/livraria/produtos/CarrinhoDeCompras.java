package br.com.codeshouse.livraria.produtos;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")

	public class CarrinhoDeCompras {
			private double total;
			private List<Produto> listaProdutos = new ArrayList<Produto>();
			public double getTotal() {
					return total;
			}
			public void adiciona(Produto produto){
					this.listaProdutos.add(produto);
			}
			public void remove(Produto produto){
					this.listaProdutos.remove(produto);
			}
			public List<Produto> getProdutos(){
					return this.listaProdutos;
			}
	}	
	



	