package br.com.codeshouse.livraria.produtos;
@SuppressWarnings("unused")

	
	public class Ebook extends Livro implements Promocional{
	    	//Demais Atributos e Métodos
		
		
		private String marcaDagua;
	    
	    public Ebook() {
	        super();
	    }
	
	    public String getMarcaDagua() {
	        return marcaDagua;
	    }
	
	    public void setMarcaDagua(String marcaDagua) {
	        this.marcaDagua = marcaDagua;
	    }
	    
		public boolean aplicaDescontoDe(double porcentagem) {
	        if (porcentagem > 0.15) {
	            return false;
	        }
	        double desconto = this.getValor() * porcentagem;
	        this.setValor(this.getValor() - desconto);
	        return true;
	    }
	
	
	}
