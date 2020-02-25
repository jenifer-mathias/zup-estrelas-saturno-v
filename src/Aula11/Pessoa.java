package Aula11;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura.

Crie os m�todos p�blicos necess�rios para sets e gets 
 
e tamb�m um m�todo para imprimir todos dados de uma pessoa. 

Crie um m�todo para calcular a idade da pessoa. */

public class Pessoa { // classe com atributos

	private String nome;
	private Double altura;
	private int idade;

	public Pessoa(String nome, Double altura) {
		this.nome = nome;
		this.altura = altura;
	}

	public String Nome(String nome) {
		this.nome = nome;
		return this.nome;
	}

	public Double altura(Double altura) {
		this.altura = altura;
		return this.altura;
	}

	public void calculoIdade() { // m�todo para calcular a idade da pessoa

		// pegando a data do sistema
		Calendar cal = GregorianCalendar.getInstance();
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH); // para tornar o programa atendendo 100% dos casos, teria que
		int mesAtual = cal.get(Calendar.MONTH) + 1; // calcular o caso que engloba ano bissexto
		int anoAtual = cal.get(Calendar.YEAR); // fevereiro com 28d, meses de 30 e 31d

		// recebendo a data de nascimento usuario
		Scanner teclado = new Scanner(System.in);

		System.out.println(" ");

		System.out.println("Digite o dia em que voc� nasceu: ");
		int diaNascimento = teclado.nextInt();

		if ((diaNascimento <= 0) && (diaNascimento > 31)) { // poderia implementar um loop para repetir at� que o
															// usu�rio digitasse algo v�lido
			System.out.println("Dia Invalido"); // tanto pra dia, m�s e ano
		} else {
			System.out.println(" Digite o m�s em que voc� nasceu: ");
			int mesNascimento = teclado.nextInt();

			if ((mesNascimento <= 0) && (mesNascimento > 12)) {
				System.out.println("Mes invalido");
			} else {

				System.out.println(" Digite o ano em que voc� nasceu: ");
				int anoNascimento = teclado.nextInt();

				if ((anoNascimento <= 0) && (anoNascimento > anoAtual)) {
					System.out.println("Ano Invalido");
				} else {
					int Nascimento = anoNascimento * 365;
					Nascimento = Nascimento + (mesNascimento * 31);
					Nascimento = Nascimento + diaNascimento;
					int Atual = anoAtual * 365;
					Atual = Atual + (mesAtual * 31);
					Atual = Atual + diaAtual;
					this.idade = ((Atual - Nascimento) / 365);

				}
			}
		}
	}

	public void dadosImpressao() {

		System.out.println(" ");
		System.out.println(" Dados do usu�rio ");
		System.out.println(" ");
		System.out.println(" Nome: " + getNome());
		System.out.println(" Altura: " + getAltura());
		System.out.println(" Idade: " + getIdade());
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
