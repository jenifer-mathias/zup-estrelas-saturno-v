package Aula11;

import java.util.Scanner;

import Aula10.CartaoDeCredito;

/* Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura.

Crie os m�todos p�blicos necess�rios para sets e gets 
 
e tamb�m um m�todo para imprimir todos dados de uma pessoa. 

Crie um m�todo para calcular a idade da pessoa. */

public class ProgramaDadosPessoa {

	public static void main(String[] args) {

		DadosPessoa nome = new DadosPessoa(" Jenifer Mathias ", 1.53);

		System.out.println(" Dados do usu�rio ");
		
		System.out.println(" ");

		System.out.println(" Nome: " + nome.getNome());

		System.out.println(" Altura: " + nome.getAltura());

		System.out.println(" Idade: " + DadosPessoa.CalculoIdade());

	}

}
