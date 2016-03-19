package teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

@SuppressWarnings("unused")


public class Teste {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			
			InputStream is = new FileInputStream("c:\\temp\\livros.csv");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			String linha = reader.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = reader.readLine();
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Erro ao tentar ler arquivo.");
		}
		
	}	
}



