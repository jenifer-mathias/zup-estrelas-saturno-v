package Aula10;

// Crie um carro no seu programa principal, utilize os m�todos criados e mostre na tela o pre�o e a
// cor do carro antes e depois da utiliza��o dos m�todos.

public class ProgramaCarro {

	public static void main(String[] args) {
		
		Carro carroDaJenifer = new Carro("T-Cross", 1200, "Volkswagen", "Vermelho", 94990);
		
		System.out.printf(" O pre�o do carro �: %.2f \n ", carroDaJenifer.preco);
		System.out.printf(" A cor atual do carro �: %s \n ", carroDaJenifer.cor);
		
		carroDaJenifer.darDesconto(5000);
		carroDaJenifer.pintar("Preto");
		
		System.out.printf(" O pre�o do carro com desconto �: %.2f \n ", carroDaJenifer.preco);
		System.out.printf(" A nova cor do seu carro �: %s \n ", carroDaJenifer.cor);
		
	}

}
