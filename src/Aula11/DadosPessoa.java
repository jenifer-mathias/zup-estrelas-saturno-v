package Aula11;

import java.util.Scanner;

/* Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura.

Crie os métodos públicos necessários para sets e gets 
 
e também um método para imprimir todos dados de uma pessoa. 

Crie um método para calcular a idade da pessoa. */

public class DadosPessoa {

	private String nome;
	private Double altura;
	private int anoAtual; // classe com atributos
	private int anoDeNascimento;
	private int idade;

	public DadosPessoa(String nome, Double altura) {
		this.nome = nome;
		this.altura = altura;
	}
	
	public static String Nome(String nome) {
		return nome;
	}

	public static int CalculoIdade() {
		int anoAtual;
		System.out.println(" Digite o ano atual para calcular sua idade: ");
		Scanner teclado = new Scanner(System.in);
		anoAtual = teclado.nextInt();

		int anoDeNascimento;
		System.out.println(" Digite o seu ano de nascimento para calcular sua idade: ");
		anoDeNascimento = teclado.nextInt();

		return ((anoAtual - anoDeNascimento) - 1); // método para calcular a idade da pessoa
	}

	public static void Altura(Double altura) {
		System.out.println(" \n Digite sua altura: ");
		Scanner teclado = new Scanner(System.in);
		altura = teclado.nextDouble();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
