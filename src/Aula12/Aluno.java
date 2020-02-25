package Aula12;

/* Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.

Cada objeto dessa classe deve guardar os seguintes dados do aluno: 
matrícula, nome, 2 notas de prova e 1 nota de trabalho. 

Escreva os seguintes métodos para esta classe:

media() - calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)

final() - calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final
[caso em que sua média é maior do que 6]) */

public class Aluno {

	private String matricula;
	private String nome;
	private Double prova1;
	private Double prova2;
	private Double trabalho;
	private Double media;

	public Aluno(String matricula, String nome, Double prova1, Double prova2, Double trabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trabalho = trabalho;
	}

	public Double media(Double prova1, Double prova2, Double trabalho) {
		this.prova1 = prova1 * 2.5;
		this.prova2 = prova2 * 2.5;
		this.trabalho = trabalho * 2;

		return this.media = ((this.prova1 + this.prova2 + this.trabalho) / 7);
	}

}
