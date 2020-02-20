package Aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaArrayListCores {

	public static void main(String[] args) {
		
		List<String> cores = new ArrayList<String>();
		
		cores.add("vermelho");
		cores.add("roxo");
		cores.add("azul");
		
		Scanner teclado = new Scanner(System.in);
		
		String cor = "";
		while(!cor.equals("preto")) {
			System.out.println("Digite uma cor: ");
			cor = teclado.nextLine();
			cores.add(cor);
		}
		
		for (String string : cores) {
			System.out.println(string);
		}

	}

}
