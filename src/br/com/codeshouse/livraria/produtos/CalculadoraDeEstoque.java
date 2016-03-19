package br.com.codeshouse.livraria.produtos;
@SuppressWarnings("unused")

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		double soma = 0;

		for (int i = 0; i < 35; i++) {
			soma += 59.90;
		}

		System.out.println("O total dos livros é: " + soma);
		if (soma < 150) {
			System.out.println("Seu estoque está baixo!");
		} else if (soma >= 200) {
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom!");
		}
	}
}
