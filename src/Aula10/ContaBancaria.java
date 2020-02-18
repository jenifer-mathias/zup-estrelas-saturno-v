package Aula10;

// Crie uma classe referente � uma conta banc�ria, que possui como atributos o seu n�mero, saldo
// e o nome do correntista.

// Crie tamb�m: 

// o m�todo saque() que serve para retirar o certo valor do saldo,

// o m�todo dep�sito() que serve para adiconar um valor ao saldo 

// e o m�todo extrato() que serve para mostrar na tela o nome do correntista, o n�mero da conta e o saldo.

// Crie um programa principal e demonstre a utiliza��o dos m�todos implementados.

public class ContaBancaria {
	String numero;
	double saldo;
	String nome;
	
	public ContaBancaria(String numero, double saldo, String nome) {
		this.numero = numero;
		this.saldo = saldo;
		this.nome = nome;
	}
	
	public boolean saque(double valorSacado) {
		
		if (valorSacado <= saldo && valorSacado > 0) {
			saldo -= valorSacado;
			return true;
		} 
		
		return false;
	}
	
	public boolean deposito(double valorDepositado) {
		
		if (valorDepositado > 0) {
			saldo += valorDepositado;
			return true;
		}
		
		return false;
	}
	
	public void extrato() {
		System.out.println("O nome do correntista �: " + this.nome);
		System.out.println("O n�mero da conta �: " + this.numero);
		System.out.println("O saldo �: " + this.saldo);
	}
	
}
