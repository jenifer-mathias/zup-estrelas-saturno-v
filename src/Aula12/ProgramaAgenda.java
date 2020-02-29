package Aula12;

import Aula11.Pessoa;
import java.util.Scanner;
import Aula11.Pessoa;

/*  Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
 
 (para representar as pessoas na Agenda utilize a classe Pessoa construída da aula anterior): 
 
 void armazenaPessoa(String nome, int idade, float altura);
 
 void removePessoa(String nome);
 
 int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
 
 void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
 
 void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda. */

// Scanner teclado = new Scanner(System.in);      // Scanner in_teclado;
public class ProgramaAgenda {

	public static void main(String[] args) {

		Pessoa[] pessoa = new Pessoa[10];

		pessoa[0] = new Pessoa("Jenifer", 19, 1.53);
		pessoa[1] = new Pessoa("Lourdes", 52, 1.65);
		pessoa[2] = new Pessoa("Silvior", 49, 1.60);
		pessoa[3] = new Pessoa("Aurino", 75, 1.60);
		pessoa[4] = new Pessoa("Helena", 68, 1.50);
		pessoa[5] = new Pessoa("Mariana", 19, 1.65);
		pessoa[6] = new Pessoa("Orlando", 18, 1.64);
		pessoa[7] = new Pessoa("Luccas", 17, 1.70);
		pessoa[8] = new Pessoa("Zélia", 42, 1.68);
		pessoa[9] = new Pessoa("Cristiano", 43, 1.75);

	}

	public void armazenarPessoa (String nome, int idade, float altura) {
        if (Pessoa < 10) {
         
        }
    
}
}
