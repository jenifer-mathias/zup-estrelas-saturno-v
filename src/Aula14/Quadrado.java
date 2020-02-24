package Aula14;

// Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura
// geométrica: quadrado, retângulo, triângulo e círculo. Use herança, classe abstrata e
// polimorfismo.

public class Quadrado extends FiguraGeometrica {

	private double lado;

	public Quadrado(double lado) {    // construtor
		this.lado = lado;
	}

	@Override
	public double calculoArea() {
		return lado * lado;	
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	
}
