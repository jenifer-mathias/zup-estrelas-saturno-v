package Aula11;

/* 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os
canais da televis�o. O controle de volume permite:
aumentar ou diminuir a pot�ncia do volume de som em uma unidade de cada vez;
aumentar e diminuir o n�mero do canal em uma unidade
trocar para um canal indicado;
consultar o valor do volume de som e o canal selecionado
Crie depois um programa principal que interaja com as suas classes, n�o se esque�a dos
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