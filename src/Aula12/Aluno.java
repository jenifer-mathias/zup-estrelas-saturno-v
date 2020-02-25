package Aula12;

import java.util.Scanner;

/* Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.

Cada objeto dessa classe deve guardar os seguintes dados do aluno: 
matrícula, nome, 2 notas de prova e 1 nota de trabalho. 

Escreva os seguintes métodos para esta classe:

media() - calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)

final() - calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final
[caso em que sua média é maior do que 6]) */

public class Aluno {

	private static Double qtdAprovacao;
	private String nome;
	private String matricula;
	private Double prova1;
	private Double trabalho;
	private Double prova2;
	private Double media;

	public Aluno(String nome, String matricula, Double prova1, Double trabalho, Double prova2) {
		this.nome = nome;
		this.matricula = matricula;
		this.prova1 = prova1 * 2.5;
		this.trabalho = trabalho * 2;
		this.prova2 = prova2 * 2.5;
	}

	public Double media() {
		Double media = (prova1 + prova2 + trabalho) / 7;
		return (prova1 + prova2 + trabalho) / 7;
	}

	public double qtdAprovacao(){
        double media = media();
        if(media >= 6)
            return 0;
            
        return 10 - media; 
    }
	
	public void dadosImpressao() {
		
		System.out.println(" ");
		System.out.println(" INFORMAÇÕES DO ALUNO ");
		System.out.println(" ");
		System.out.println(" Nome: " + getNome());
		System.out.println(" Matrícula: " + getMatricula());
		System.out.println(" ");
		System.out.println(" Nota da primeira prova: " + getProva1());
		System.out.println(" Nota do trabalho: " + getTrabalho());
		System.out.println(" Nota mínima necessária na segunda prova: " + (Math.ceil(qtdAprovacao()))); // arredonda pra cima
		System.out.println(" Nota da segunda prova: " + getProva2());
		System.out.println(" Média final: " + (Math.round(media())));  // retorna decimal para inteiro
		
		if (media() >= 6) {
			System.out.println(" Aluno aprovado! "); 
		} else {
			System.out.println(" Aluno reprovado! ");
		}	

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getProva1() {
		return prova1;
	}

	public void setProva1(Double prova1) {
		this.prova1 = prova1;
	}

	public Double getProva2() {
		return prova2;
	}

	public void setProva2(Double prova2) {
		this.prova2 = prova2;
	}

	public Double getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Double trabalho) {
		this.trabalho = trabalho;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public static Double getQtdAprovacao() {
		return qtdAprovacao;
	}

	public static void setQtdAprovacao(Double qtdAprovacao) {
		Aluno.qtdAprovacao = qtdAprovacao;
	}
}
