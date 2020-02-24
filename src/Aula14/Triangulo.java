package Aula14;

// Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura
// geométrica: quadrado, retângulo, triângulo e círculo. Use herança, classe abstrata e
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
