package br.com.codeshouse.util;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import br.com.codeshouse.livraria.produtos.LivroFisico;
import br.com.codeshouse.livraria.produtos.Produto;

@SuppressWarnings("unused")

	public class Exportador {
		public void paraCSV (List<LivroFisico> livros) throws FileNotFoundException{
				PrintStream out = new PrintStream("c:\\temp\\livros.csv");
				out.println("Titulo,Descricao,Valor");
				
				for (LivroFisico fisico : livros) {
						out.println(fisico.getTitulo() + "," + fisico.getDescricao() + "," + fisico.getValor());
				}
				
				out.close();
		}
	}

