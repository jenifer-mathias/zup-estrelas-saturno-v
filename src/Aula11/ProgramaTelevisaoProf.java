package Aula11;

/* 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os
canais da televis�o. O controle de volume permite:
aumentar ou diminuir a pot�ncia do volume de som em uma unidade de cada vez;
aumentar e diminuir o n�mero do canal em uma unidade
trocar para um canal indicado;
consultar o valor do volume de som e o canal selecionado
Crie depois um programa principal que interaja com as suas classes, n�o se esque�a dos
modificadores de acesso e dos getters e setters em suas classes. */

public class ProgramaTelevisaoProf {

	public static void main(String[] args) {
		// Criamos o nosso objeto controle

		ControleProf controle = new ControleProf();

		System.out.println("Testando o m�todo de aumentar volume.");
		for (int i = 0; i <= 105; i++) {
			controle.aumentaVolumeUnitario();
		}
		System.out.println(controle.consultaVolume());
		System.out.println("FIM DO TESTE DE AUMENTO DE VOLUME");

		System.out.println("Testando o m�todo de diminuir volume.");
		for (int i = 0; i <= 105; i++) {
			controle.diminuiVolumeUnitario();
		}
		System.out.println(controle.consultaVolume());
		System.out.println("FIM DO TESTE DE DIMIN�ISS�O DE VOLUME");

		System.out.println("Testando o m�todo de troca de canal.");
		System.out.println(controle.consultaCanal());
		controle.trocaDeCanal(544);
		System.out.println(controle.consultaCanal());
		System.out.println("FIM DO TESTE DE TROCA DE CANAL");

		System.out.println("Testando o m�todo de aumento de canal.");
		for (int i = 0; i <= 42; i++) {
			controle.aumentaCanalUnitario();
		}
		System.out.println(controle.consultaCanal());
		System.out.println("FIM DO TESTE DE AUMENTO DE CANAL.");

		System.out.println("Testando o m�todo de dimin�iss�o de canal.");
		for (int i = 0; i <= 590; i++) {
			controle.diminuiCanalUnitario();
		}
		System.out.println(controle.consultaCanal());
		System.out.println("FIM DO TESTE DE DIMIN�ISS�O DE CANAL.");

	}

}
