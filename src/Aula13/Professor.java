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

public class Professor extends Funcionario {
	private String nivelGraduacao;
	private String disciplinaMinistrada;
	private int qtdAlunos;
	private int qtdTurmas;
	
	Professor[] professor = new Professor[10];
	
	public void aumentoSalario() {
		super.setsalario(super.getsalario() + (salario * 0.10));
	}
	
public void novaTurma(int qtdTurmas) {
	this.qtdTurmas = qtdTurmas;
}
	
	public String getnivelGraduacao() {
		return nivelGraduacao;
	}

	public void setnivelGraduacao(String nivelGraduacao) {
		this.nivelGraduacao = nivelGraduacao;
	}

	public String getdisciplinaMinistrada() {
		return disciplinaMinistrada;
	}

	public void setdisciplinaMinistrada(String disciplinaMinsitrada) {
		setdisciplinaMinistrada(disciplinaMinsitrada);
	}

	public int getqtdAlunos() {
		return qtdAlunos;
	}

	public void setqtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public int getqtdTurmas() {
		return qtdTurmas;
	}

	public void setNome(int qtdTurmas) {
		this.qtdTurmas = qtdTurmas;
	}

}
