package Aula11;

/* 4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os
canais da televisão. O controle de volume permite:
aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
aumentar e diminuir o número do canal em uma unidade
trocar para um canal indicado;
consultar o valor do volume de som e o canal selecionado
Crie depois um programa principal que interaja com as suas classes, não se esqueça dos
modificadores de acesso e dos getters e setters em suas classes. */

public class ProgramaTelevisaoProf {

	public static void main(String[] args) {
		// Criamos o nosso objeto controle

		ControleProf controle = new ControleProf();

		System.out.println("Testando o método de aumentar volume.");
		for (int i = 0; i <= 105; i++) {
			controle.aumentaVolumeUnitario();
		}
		System.out.println(controle.consultaVolume());
		System.out.println("FIM DO TESTE DE AUMENTO DE VOLUME");

		System.out.println("Testando o método de diminuir volume.");
		for (int i = 0; i <= 105; i++) {
			controle.diminuiVolumeUnitario();
		}
		System.out.println(controle.consultaVolume());
		System.out.println("FIM DO TESTE DE DIMINÓISSÃO DE VOLUME");

		System.out.println("Testando o método de troca de canal.");
		System.out.println(controle.consultaCanal());
		controle.trocaDeCanal(544);
		System.out.println(controle.consultaCanal());
		System.out.println("FIM DO TESTE DE TROCA DE CANAL");

		System.out.println("Testando o método de aumento de canal.");
		for (int i = 0; i <= 42; i++) {
			controle.aumentaCanalUnitario();
		}
		System.out.println(controle.consultaCanal());
		System.out.println("FIM DO TESTE DE AUMENTO DE CANAL.");

		System.out.println("Testando o método de diminóissão de canal.");
		for (int i = 0; i <= 590; i++) {
			controle.diminuiCanalUnitario();
		}
		System.out.println(controle.consultaCanal());
		System.out.println("FIM DO TESTE DE DIMINÓISSÃO DE CANAL.");

	}

}
