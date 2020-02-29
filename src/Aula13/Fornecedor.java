package Aula13;

public class Fornecedor extends PessoaDados {
	private Double valorCredito;
	private Double valorDivida;

	public Fornecedor(String nome, String endere�o, String telefone, Double valorCredito, Double valorDivida) {
		super(nome, endere�o, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}

	public Double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(Double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
