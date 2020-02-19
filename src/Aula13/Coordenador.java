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

public class Coordenador extends Funcionario {
	
	public Coordenador(
			private String nome;
			private String cpf;
			private double numeroRegistro;
			private String orgoLotacao;
			private double salario; ) {
		super(nome, cpf, numeroRegistro, orgoLotacao, salario);
		// TODO Auto-generated constructor stub
	}

	private Professor[] professoresSupervisionados = new Professor[10];

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}

	@Override
	public void aumentoSalario() {
		super.setsalario(super.getsalario() + (salario * 0.05));
	}

	public void setProfessoresSupervisionados(Professor[] professoresSupervisionados) {
		this.professoresSupervisionados = professoresSupervisionados;
	}
	
	

}
