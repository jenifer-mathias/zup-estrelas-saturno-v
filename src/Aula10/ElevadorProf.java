package Aula10;

public class ElevadorProf {

	// 3. Crie uma classe denominada Elevador para armazenar as informações de um
	// elevador dentro de
	// um prédio. A classe deve armazenar o andar atual (térreo = 0), total de
	// andares no prédio
	// (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
	// presentes nele. A
	// classe deve também disponibilizar os seguintes métodos:
	// Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
	// houver
	// espaço);
	// Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
	// dentro
	// dele);
	// Sobe : para subir um andar (não deve subir se já estiver no último andar);
	// Desce : para descer um andar (não deve descer se já estiver no térreo);

	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoas;

	public ElevadorProf(int totalAndares, int capacidade) {
		this.andarAtual = 0;
		this.qtdPessoas = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}

	public boolean entra() {
		if (qtdPessoas + 1 <= capacidade) {
			qtdPessoas++;
			return true;
		}

		return false;
	}

	public boolean sai() {
		if (qtdPessoas > 0) {
			qtdPessoas--;
			return true;
		}

		return false;
	}

	public boolean sobe() {
		if (andarAtual != totalAndares) {
			andarAtual++;
			return true;
		}

		return false;
	}

	public boolean desce() {
		if (andarAtual > 0) {
			andarAtual--;
			return true;
		}

		return false;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {      // usei o get para mostrar no programa principal 
		return capacidade;            // pois como estão privados, preciso mostrar no programa principal
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;        // usei o set porque quero modificar a capacidade do meu elevador
	}                                        // 

	public int getQtdPessoas() {
		return qtdPessoas;
	}

}
