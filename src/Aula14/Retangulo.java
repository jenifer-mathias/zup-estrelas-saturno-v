package Aula14;

// Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de figura
// geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. Use heran�a, classe abstrata e
// polimorfismo.

public class Retangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Retangulo(double base, double altura) { // construtor
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculoArea() {
		return base * altura;
	}

}
