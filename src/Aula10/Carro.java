package Aula10;

// Crie uma classe que represente um carro, que tenha como características o nome, o peso, a
// fabricante, a cor e o valor do carro. Crie também o método darDesconto() que servirá para
// diminuir o preço do carro e o método pintar(), que será responsável por mudar a cor do carro.

// Crie um carro no seu programa principal, utilize os métodos criados e mostre na tela o preço e a
// cor do carro antes e depois da utilização dos métodos.

public class Carro {

	String nome;
	double peso;
	String fabricante;
	String cor;
	double preco;
	
	public Carro( String nome, double peso, String fabricante, String cor, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.fabricante = fabricante;
		this.cor = cor;
		this.preco = preco;
	}
	
	public void darDesconto (double desconto) {
		this.preco -= desconto;
	}
	
	public void pintar (String novacor) {
		this.cor = novacor;
	}
	
}


