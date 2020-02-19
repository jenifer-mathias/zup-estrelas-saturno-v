package Aula10;

// Crie uma classe que represente um cartão de crédito, que 
// deve ter como atributos o seu limite, o saldo da fatura e nome do cliente. 

//Crie também os métodos:
// aumentaLimite(), 
// diminuiLimite(),
// realizaCompra() que não deve permitir uma compra caso o limite tenha sido atingido 
// e o imprimeFatura() que imprime na tela o valor da fatura.

public class CartaoDeCredito {
	private double limite;         // double inicia em 0
	private double saldoDaFatura; // criei a minha classe com os atributos
	private String nomeDoCliente;

	public CartaoDeCredito(double limite, String nomeDoCliente) {
		this.limite = limite;
		this.saldoDaFatura = 0;                   // criei o meu construtor
		this.nomeDoCliente = nomeDoCliente;
	}
	
	public void aumentaLimite(double valor) {
		this.limite += valor;                    // criei os meus métodos
	}

	public void diminuiLimite(double valor) {
		this.limite -= valor;
	}

	public void realizaCompra(double valorDaCompra) {
		if (this.limite <= valorDaCompra) {
			this.saldoDaFatura += valorDaCompra;
			this.limite -= valorDaCompra;
			System.out.println(" Compra não autorizada! ");
		} else {
			System.out.println(" Compra realizada com sucesso! ");
		}
	}

	public void imprimeFatura() {
		System.out.printf(" Seu limite atual é: %.2f\n", limite);
		System.out.printf(" Valor da fatura: %.2f\n ", saldoDaFatura);
	}

	public void saldoFatura() {
		System.out.printf(" Valor da fatura: ", this.saldoDaFatura);
	}

	public String getNomeCliente() {
		return nomeDoCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeDoCliente = nomeCliente;
	}

	public double getSaldoFatura() {
		return saldoDaFatura;
	}

	public void setSaldoFatura(double saldoFatura) {
		this.saldoDaFatura = saldoFatura;
	}


	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
