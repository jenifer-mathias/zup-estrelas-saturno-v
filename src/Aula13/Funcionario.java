package Aula13;

// Modele as classes referentes aos funcion�rios de uma universidade, que ser�o os professores,
// coordenadores, e funcion�rios administrativos.

// Os atributos comuns de todos os funcionarios ser�o: Nome, CPF, n�mero de registro, �rg�o de lota��o e sal�rio.

// Os professores possuem os atributos: N�vel de gradua��o, disciplina ministrada e quantidade de alunos e quantidade de turmas.

// Os coordenadores possuem os atributos: professoresSupervisionados[10].

// Os funcion�rios administrativos possuem os atributos: Fun��o Administrativa e senioridade.

// Implemente, al�m dos getters e setters e os construtores, os seguintes m�todos:

// Aumento de sal�rio: para todos menos os coordenadores aumenta o sal�rio em 10% e para os coordenadores o aumento � de 5%.

// Adiciona turma para os professores.

// Adiciona professor (para os coordenadores): observe que um coordenador s� pode coordenar 10 professores.

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
