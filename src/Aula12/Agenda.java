package Aula12;

import Aula11.Pessoa;

/*  Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
 
 (para representar as pessoas na Agenda utilize a classe Pessoa construída da aula anterior): 
 
 void armazenaPessoa(String nome, int idade, float altura);
 
 void removePessoa(String nome);
 
 int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
 
 void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
 
 void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda. */
 

public class Agenda {
    
    // tipo // var        
	Pessoa[] pessoa = new Pessoa[10];
	
	private String nome;
	private float altura;
	private int idade;
	
	public void armazenaPeossoa(String nome, int idade, float altura) {
	this.nome = nome;
	this.altura = altura;
	this.idade = idade;
	
	for (Pessoa pessoa: pessoa) {
		Pessoa[] = Pessoa[] + 1;
	
	}
	
	public void removePessoa(String nome) {
		
	}
	
	public int buscaPessoa(String nome) {
		return pessoa[i];
		
	}
	
	public void imprimeAgenda() {
		System.out.println(dados.Impressao);
		System.out.println(idade);
		System.out.println(altura);
	}
	
	public void imprimePessoa (int index) {
		System.out.println(pessoa[i]);
	}

	public Pessoa[] getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa[] pessoa) {
		this.pessoa = pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
