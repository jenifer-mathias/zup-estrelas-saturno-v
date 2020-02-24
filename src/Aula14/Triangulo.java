package Aula14;

// Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de figura
// geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. Use heran�a, classe abstrata e
// polimorfismo.

public class Triangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Triangulo(double base, double altura) { // construtor
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculoArea() {
		return base * altura / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
