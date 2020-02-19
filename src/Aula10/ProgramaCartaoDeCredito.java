package Aula10;

import java.util.Scanner;

public class ProgramaCartaoDeCredito {

	public static void main(String[] args) {
		                                         // limite | saldo da fatura
		CartaoDeCredito cartao = new CartaoDeCredito(4500, " Jenifer Mathias dos Santos ");
		
	                                                               // mostrei o nome do cliente, mas eu poderia deixar sem parâmetro e 
		System.out.println(cartao.getNomeCliente());         // fazer como se fosse um novo cliente, digitando o nome dele
		
		System.out.println(" ");
		
		cartao.realizaCompra(300);
		
		System.out.println(" ");
		
		cartao.imprimeFatura();
		
	}

}
