package br.com.codeshouse.principal;

import br.com.codeshouse.livraria.produtos.GerenciadorDeCupons;

@SuppressWarnings("unused")
	
	public class ConsultaDeDescontos {
	
		public static void main(String[] args) {
			
			GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
			Double desonto = gerenciador.validaCupom("CUP740");
			
			if (desonto != null) {
				System.out.println("Cupom de Desconto Valido.");
				System.out.println("Valor: " + desonto);
			} else  {
				System.out.println("Esse cupom não existe");
			}
		}
	}



