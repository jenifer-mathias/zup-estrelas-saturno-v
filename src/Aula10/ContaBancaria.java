package Aula10;

// Crie uma classe referente à uma conta bancária, que possui como atributos o seu número, saldo
// e o nome do correntista.

// Crie também: 

// o método saque() que serve para retirar o certo valor do saldo,

// o método depósito() que serve para adiconar um valor ao saldo 

// e o método extrato() que serve para mostrar na tela o nome do correntista, o número da conta e o saldo.

// Crie um programa principal e demonstre a utilização dos métodos implementados.

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
		System.out.println("O nome do correntista é: " + this.nome);
		System.out.println("O número da conta é: " + this.numero);
		System.out.println("O saldo é: " + this.saldo);
	}
	
}
