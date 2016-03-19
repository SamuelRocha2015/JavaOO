package br.com.codeshouse.livraria.produtos;
@SuppressWarnings("unused")

	public class LivroFisico extends Livro implements Promocional {
			//Demais Atributos e Métodos
		
			private double taxaImpressao;
		
			public double getTaxaImpressao() {
					return taxaImpressao;
			}
		
			public void setTaxaImpressao(double taxaImpressao) {
					this.taxaImpressao = taxaImpressao;
			}
			
			
			public boolean aplicaDescontoDe(double porcentagem) {
					 if (porcentagem > 0.3) {
				            return false;
				     }
				     double desconto = getValor() * porcentagem;
				     setValor(getValor() - desconto);
				     System.out.println("Aplicando Desconto no Livro Fisico");
				     return true;
			}
	}





