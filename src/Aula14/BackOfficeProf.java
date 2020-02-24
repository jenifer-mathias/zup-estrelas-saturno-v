package Aula14;

// Exemplo feito em aula (utilização de Classe Abstrata)

public class BackOfficeProf extends FuncionarioProf {
	
	private String areaAtuacao;

	public BackOfficeProf(String nome, String cpf, double salario, double horasSemanais, String areaAtuacao) {
		super(nome, cpf, salario, horasSemanais);
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public double aumentaSalario(double valorAumento) {
		double novoSalario = super.getSalario() + valorAumento * 1.3;
		super.setSalario(novoSalario);
		return novoSalario;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
}
