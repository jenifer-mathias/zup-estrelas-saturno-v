package Aula10;

// Crie um carro no seu programa principal, utilize os métodos criados e mostre na tela o preço e a
// cor do carro antes e depois da utilização dos métodos.

public class ProgramaCarro {

	public static void main(String[] args) {
		
		Carro carroDaJenifer = new Carro("T-Cross", 1200, "Volkswagen", "Vermelho", 94990);
		
		System.out.printf(" O preço do carro é: %.2f \n ", carroDaJenifer.preco);
		System.out.printf(" A cor atual do carro é: %s \n ", carroDaJenifer.cor);
		
		carroDaJenifer.darDesconto(5000);
		carroDaJenifer.pintar("Preto");
		
		System.out.printf(" O preço do carro com desconto é: %.2f \n ", carroDaJenifer.preco);
		System.out.printf(" A nova cor do seu carro é: %s \n ", carroDaJenifer.cor);
		
	}

}
