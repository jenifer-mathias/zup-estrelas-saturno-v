package Aula14;

public class TechLeadProf extends ProgramadorProf {

	private ProgramadorProf[] programadores = new ProgramadorProf[10];

	public TechLeadProf(String nome, String cpf, double salario, double horasSemanais, String linguagem,
			String nivelSenioridade, String area) {
		super(nome, cpf, salario, horasSemanais, linguagem, nivelSenioridade, area);
	}
	
	@Override
	public double aumentaSalario(double valorAumento) {
		double novoValor = super.getSalario() + valorAumento * 4;
		super.setSalario(novoValor);
		return novoValor;
	}
	
	public boolean adicionaProgramador(ProgramadorProf programador) {
		
		boolean foiAdicionado = false;
		
		for (int i = 0; i < this.programadores.length; i++) {
			
			if (this.programadores[i] == null) {
				this.programadores[i] = programador;
				foiAdicionado = true;
				break;
			}
			
		}
		
		return foiAdicionado;
	}
	
	public boolean removeProgramador(String cpf) {
		
		boolean foiRemovido = false;
		
		for (int i = 0; i < this.programadores.length; i++) {
			
			if (this.programadores[i] == null) {
				continue;
			} 
			
			if (this.programadores[i].getCpf().equals(cpf)) {
				this.programadores[i] = null;
				foiRemovido = true;
				break;
			}
			
		}
		
		return foiRemovido;
	}
	

	public ProgramadorProf[] getProgramadores() {
		return programadores;
	}

}
