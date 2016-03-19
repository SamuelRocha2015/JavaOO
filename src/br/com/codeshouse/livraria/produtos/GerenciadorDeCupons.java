package br.com.codeshouse.livraria.produtos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unused")

	public class GerenciadorDeCupons {
	Map<String, Double>  cupons;

		public GerenciadorDeCupons(){
			this.cupons  = new HashMap<>();
			
			this.cupons.put("CUP740", 10.0);
			this.cupons.put("CUP805", 12.0);
			this.cupons.put("CUP847", 15.0);
			this.cupons.put("CUP884", 20.0);
			//...
		}
		
		public Double validaCupom(String cupom){
			return this.cupons.get(cupom);
		}
	}










