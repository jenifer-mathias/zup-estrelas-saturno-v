package Aula11;
import java.util.Scanner;

import Aula10.CartaoDeCredito;

/* Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura.

Crie os m�todos p�blicos necess�rios para sets e gets 
 
e tamb�m um m�todo para imprimir todos dados de uma pessoa. 

Crie um m�todo para calcular a idade da pessoa. */

public class ProgramaPessoa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println(" \n Digite o seu nome: ");
		String nome = teclado.nextLine();

		System.out.println(" \n Digite sua altura: " + " \n (Obs: Utilize v�rgula para o espa�amento) ");
		Double altura = teclado.nextDouble();

		Pessoa dados = new Pessoa(nome, altura);

		dados.calculoIdade();

		dados.dadosImpressao();

	}

}
