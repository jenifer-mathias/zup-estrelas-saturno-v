package Aula14;

// Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de figura
// geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. Use heran�a, classe abstrata e
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

// Math.PI m�todo q retorna o pi 
// Math.pow m�todo q retorna pot�ncia