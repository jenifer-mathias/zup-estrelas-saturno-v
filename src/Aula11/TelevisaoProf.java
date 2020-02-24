package Aula11;

/* 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os
canais da televisão. O controle de volume permite:
aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
aumentar e diminuir o número do canal em uma unidade
trocar para um canal indicado;
consultar o valor do volume de som e o canal selecionado
Crie depois um programa principal que interaja com as suas classes, não se esqueça dos
modificadores de acesso e dos getters e setters em suas classes. */

public class TelevisaoProf {
	private int canal;
	private int volume;

	public void Televisao() {
		this.canal = 1;
		this.volume = 1;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getCanal() {
		return this.canal;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return this.volume;
	}
}