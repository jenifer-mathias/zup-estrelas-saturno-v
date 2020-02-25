package Aula12;

import java.util.Scanner;

public class ProgramaAluno {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite o seu nome: ");
		String nome = teclado.nextLine();

		System.out.println(" Digite o seu número de matrícula: ");
		String matricula = teclado.nextLine();

		System.out.println(" Digite sua nota referente a primeira prova: ");
		Double prova1 = teclado.nextDouble();

		System.out.println(" Digite sua nota referente ao trabalho: ");
		Double trabalho = teclado.nextDouble();
		
		System.out.println(" Digite sua nota referente a segunda prova: ");
		Double prova2 = teclado.nextDouble();
		
		Aluno aluno = new Aluno(nome, matricula, prova1, trabalho, prova2);
		
		aluno.getMedia();

		Aluno.getQtdAprovacao();
		
		aluno.dadosImpressao();

	}

}
