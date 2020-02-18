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
