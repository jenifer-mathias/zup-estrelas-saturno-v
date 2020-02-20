package Aula14;

// Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura
// geométrica: quadrado, retângulo, triângulo e círculo. Use herança, classe abstrata e
// polimorfismo.

public class Circulo extends FiguraGeometrica {
	private double raio;

	public Circulo(double raio) { // construtor
		this.raio = raio;
	}

	@Override
	public double calculoArea() {                       
		return Math.PI * Math.pow(raio, 2);
	}         
}

// Math.PI método q retorna o pi 
// Math.pow método q retorna potência