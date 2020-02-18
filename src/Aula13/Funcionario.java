package Aula13;

// Modele as classes referentes aos funcionários de uma universidade, que serão os professores,
// coordenadores, e funcionários administrativos.

// Os atributos comuns de todos os funcionarios serão: Nome, CPF, número de registro, órgão de lotação e salário.

// Os professores possuem os atributos: Nível de graduação, disciplina ministrada e quantidade de alunos e quantidade de turmas.

// Os coordenadores possuem os atributos: professoresSupervisionados[10].

// Os funcionários administrativos possuem os atributos: Função Administrativa e senioridade.

// Implemente, além dos getters e setters e os construtores, os seguintes métodos:

// Aumento de salário: para todos menos os coordenadores aumenta o salário em 10% e para os coordenadores o aumento é de 5%.

// Adiciona turma para os professores.

// Adiciona professor (para os coordenadores): observe que um coordenador só pode coordenar 10 professores.

public class Funcionario { // especifiquei um funcionario em uma classe
	private String nome;
	private String cpf;
	private double numeroRegistro;
	private String orgaoLotacao;
	protected double salario;

	public Funcionario( String nome, String cpf, double numeroRegistro, String orgoLotacao, double salario) {
		this.nome = nome;
		
	}
	
	public void aumentoSalario() {
		this.salario = this.salario + (salario * 0.10);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public double getnumeroRegistro() {
		return numeroRegistro;
	}

	public void setnumeroRegistro(double numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getorgaoLotacao() {
		return orgaoLotacao;
	}

	public void seorgaoLotacao(String orgaoLotacao) {
		this.orgaoLotacao = orgaoLotacao;
	}

	public double getsalario() {
		return salario;
	}

	public void setsalario(double salario) {
		this.salario = salario;
	}
}
