package Aula13;

public class Administrador extends Empregado {
	private Double ajudaDeCusto;

	public Administrador(String nome, String endereço, String telefone, int codigoSetor, Double salarioBase,
			Double imposto, Double ajudaDeCusto) {
		super(nome, endereço, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override 
	public Double calcularSalario() {
		Double salarioAdm = super.getSalarioBase() + this.ajudaDeCusto;
		super.setSalarioBase(salarioAdm);
		return salarioAdm;
	}
	
	public Double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
		
}
