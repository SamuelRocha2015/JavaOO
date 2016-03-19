package br.com.codeshouse.principal;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Scanner;

import br.com.codeshouse.livraria.Autor;
@SuppressWarnings("unused")
	
	public class CadastroDeAutor {
		public static void main(String[] args) throws IOException {
			Autor novoAutor = new Autor();
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Informe o Nome do Autor:");
			novoAutor.setNome(leitor.nextLine());
			System.out.println("Informe o Email do Autor:");
			novoAutor.setEmail(leitor.nextLine());
			System.out.println("Informe o CPF do Autor:");
			novoAutor.setCpf(leitor.nextLine());

			PrintStream out = new PrintStream ("c:\\temp\\novoArquivo.txt"); 
			
			out.println("============ Dados do Autor ============");
			out.println("Nome:" + novoAutor.getNome());
			out.println("Email:" + novoAutor.getEmail());
			out.println("CPF::" + novoAutor.getCpf());
			out.println("==================================== ");

			out.close();
			System.out.println("========== Autor Cadastrado com Sucesso ==========");
			
		}
	}





