package Aula14;

public abstract class FuncionarioProf {

	private String nome;
	private String cpf;
	private double salario;
	private double horasSemanais;
	
	//Criar um método de validação de CPF
	
	public abstract double aumentaSalario(double valorAumento);
	
	public double diminuiCargaHoraria(double valorReducao) {
		this.horasSemanais -= valorReducao;
		return this.horasSemanais;
	}
	
	public FuncionarioProf(String nome, String cpf, double salario, double horasSemanais) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.horasSemanais = horasSemanais;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getHorasSemanais() {
		return horasSemanais;
	}
	
	public void setHorasSemanais(double horasSemanais) {
		this.horasSemanais = horasSemanais;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
}

