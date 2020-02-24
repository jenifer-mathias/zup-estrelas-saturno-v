package Aula11;

/* 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os
canais da televis�o. O controle de volume permite:
aumentar ou diminuir a pot�ncia do volume de som em uma unidade de cada vez;
aumentar e diminuir o n�mero do canal em uma unidade
trocar para um canal indicado;
consultar o valor do volume de som e o canal selecionado
Crie depois um programa principal que interaja com as suas classes, n�o se esque�a dos
modificadores de acesso e dos getters e setters em suas classes. */

public class ControleProf {

	private TelevisaoProf televisao;

	public ControleProf() {
		this.televisao = new TelevisaoProf();
	}

	public TelevisaoProf getTelevisao() {
		return this.televisao;
	}

	public int aumentaVolumeUnitario() {
		int novoVolume = this.televisao.getVolume() + 1;
		if (novoVolume <= 100) {
			this.televisao.setVolume(novoVolume);
			return novoVolume;
		}
		return 100;
	}

	public int diminuiVolumeUnitario() {
		int novoVolume = this.televisao.getVolume() - 1;
		if (novoVolume >= 0) {
			this.televisao.setVolume(novoVolume);
			return novoVolume;
		}
		return 0;
	}

	public int aumentaCanalUnitario() {
		int novoCanal = this.televisao.getCanal() + 1;
		this.televisao.setCanal(novoCanal);
		return novoCanal;
	}

	public int diminuiCanalUnitario() {
		int novoCanal = this.televisao.getCanal() - 1;
		if (novoCanal >= 1) {
			this.televisao.setCanal(novoCanal);
			return novoCanal;
		}

		return 1;
	}

	public int trocaDeCanal(int novoCanal) {
		if (novoCanal >= 1) {
			this.televisao.setCanal(novoCanal);
			return novoCanal;
		}

		return this.televisao.getCanal();
	}

	public int consultaVolume() {
		return this.televisao.getVolume();
	}

	public int consultaCanal() {
		return this.televisao.getCanal();
	}

}