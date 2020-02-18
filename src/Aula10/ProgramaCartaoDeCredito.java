package Aula10;

public class ProgramaCartaoDeCredito {

	public static void main(String[] args) {
		
		CartaoDeCredito cartao = new CartaoDeCredito(4000, 0, " Jenifer Mathias ");
		
	//	cartao.CartaoDeCredito();
		// System.out.println(cartao.getNomeCliente());
	
		cartao.realizaCompra(9000);
		System.out.println(cartao.getSaldoFatura());
		
		cartao.diminuiLimite(400);
		System.out.println(cartao.getLimite());
		
		cartao.aumentaLimite(500);
		System.out.println(cartao.getLimite());
		
		
	}

}
