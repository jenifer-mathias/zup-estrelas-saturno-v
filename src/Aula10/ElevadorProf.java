package Aula10;

public class ElevadorProf {

	// 3. Crie uma classe denominada Elevador para armazenar as informa��es de um
	// elevador dentro de
	// um pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de
	// andares no pr�dio
	// (desconsiderando o t�rreo), capacidade do elevador e quantas pessoas est�o
	// presentes nele. A
	// classe deve tamb�m disponibilizar os seguintes m�todos:
	// Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda
	// houver
	// espa�o);
	// Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m
	// dentro
	// dele);
	// Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
	// Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo);

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
		return capacidade;            // pois como est�o privados, preciso mostrar no programa principal
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;        // usei o set porque quero modificar a capacidade do meu elevador
	}                                        // 

	public int getQtdPessoas() {
		return qtdPessoas;
	}

}
