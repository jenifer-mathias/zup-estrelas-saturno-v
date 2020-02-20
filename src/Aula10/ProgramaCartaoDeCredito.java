package Aula10;

// Crie uma classe que represente um cart�o de cr�dito, que 
// deve ter como atributos o seu limite, o saldo da fatura e nome do cliente. 

// Crie tamb�m os m�todos:
// aumentaLimite(), 
// diminuiLimite(),
// realizaCompra() que n�o deve permitir uma compra caso o limite tenha sido atingido 
// e o imprimeFatura() que imprime na tela o valor da fatura.

public class ProgramaCartaoDeCredito {

	public static void main(String[] args) {
		                                           // limite
		CartaoDeCredito cartao = new CartaoDeCredito(4500, " Jenifer Mathias dos Santos ");    // chamei o construtor, gerei meu objeto
		
		System.out.println(cartao.getNomeCliente());          // mostrei o nome do cliente, mas eu poderia deixar sem par�metro e      
		                                                      // fazer como se fosse um novo cliente, digitando o nome dele
		System.out.println(" ");
		
		cartao.realizaCompra(300);
		
		System.out.println(" ");
		
		cartao.imprimeFatura();
		
	}

}

