package Aula14;

// Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de figura
// geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. Use heran�a, classe abstrata e
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
