package Aula14;

// Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de figura
// geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. Use heran�a, classe abstrata e
// polimorfismo.

public class ProgramaCalculoArea {

	public static void main(String[] args) {

		FiguraGeometrica quadrado = new Quadrado(5); // chamei o meu construtor

		FiguraGeometrica retangulo = new Retangulo(5, 7);

		FiguraGeometrica triangulo = new Triangulo(4, 8);

		FiguraGeometrica circulo = new Circulo(6);
 
		System.out.printf("  A �rea do quadrado �: %.2f\n ", quadrado.calculoArea());
		System.out.printf(" A �rea do ret�ngulo �: %.2f\n ", retangulo.calculoArea());
		System.out.printf(" A �rea do tri�ngulo �: %.2f\n ", triangulo.calculoArea());
		System.out.printf(" A �rea do circulo �: %.2f\n ", circulo.calculoArea());
	}

}
