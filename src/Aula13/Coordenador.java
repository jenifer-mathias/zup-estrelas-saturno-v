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

public class Coordenador extends Funcionario {
	private Professor[] professoresSupervisionados = new Professor[10];

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}
	
	Coordenador coordenador = new Coordenador();

	@Override
	public void aumentoSalario() {
		super.setsalario(super.getsalario() + (salario * 0.05));
	}

	public void setProfessoresSupervisionados(Professor[] professoresSupervisionados) {
		this.professoresSupervisionados = professoresSupervisionados;
	}
	
	

}
