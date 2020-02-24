package Aula14;

public class Programador extends Funcionario {

	private String linguagem;
	private String nivelSenioridade;
	private String area;
	
	public Programador(String nome, String cpf, double salario, double horasSemanais, String linguagem,
			String nivelSenioridade, String area) {
		super(nome, cpf, salario, horasSemanais);
		this.linguagem = linguagem;
		this.nivelSenioridade = nivelSenioridade;
		this.area = area;
	}

	@Override
	public double aumentaSalario(double valorAumento) {
		double novoSalario = this.getSalario() + 2 * valorAumento;
		super.setSalario(novoSalario);
		return novoSalario;
	}
	
	public void promover() {

		if (this.nivelSenioridade.equals("Junior")) {
			this.nivelSenioridade = "Pleno";
		} else if (this.nivelSenioridade.equals("Pleno")) {
			this.nivelSenioridade = "Senior";
		}

	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNivelSenioridade() {
		return nivelSenioridade;
	}
	
}
