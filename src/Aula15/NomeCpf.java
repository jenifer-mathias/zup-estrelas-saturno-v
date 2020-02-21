package Aula15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Escreva um programa para criar um HashMap onde a chave é o CPF e o valor o Nome.
  
 Leia do usuário 10 conjuntos de valores e armazene em seu Hashmap

 Mostre na tela os 10 valores de nomes armazenados

 Peça ao usuário um CPF e remova do seu hashMap a entrada referente à esse valor

 Mostre na tela os valores restantes em seu hashMap */

public class NomeCpf {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Map<String, String> nomeCpf = new HashMap<String, String>();

		for (int i = 1; i <= 2; i++) {

			System.out.println(" Digite o seu nome: ");
			String nome = teclado.nextLine();

			System.out.println(" Digite o seu CPF: ");
			String cpf = teclado.nextLine();

			nomeCpf.put(cpf, nome);

		}

		System.out.println(" Digite um cpf a ser removido: ");
		String cpf = teclado.nextLine();
		System.out.println(" Usuário removido com sucesso. Segue os usuários restantes: ");

		nomeCpf.remove(cpf);

		// tipo // criação de var mostra os nomes q estão dentro do mapa
		for (String atualizaCpf : nomeCpf.values()) {
			System.out.println(atualizaCpf);
		}
	}
}
