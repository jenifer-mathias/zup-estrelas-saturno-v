package Aula14;

// Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura
// geométrica: quadrado, retângulo, triângulo e círculo. Use herança, classe abstrata e
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
