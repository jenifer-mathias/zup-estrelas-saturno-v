package Aula14;

// Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura
// geométrica: quadrado, retângulo, triângulo e círculo. Use herança, classe abstrata e
// polimorfismo.

public class ProgramaCalculoArea {

	public static void main(String[] args) {

		FiguraGeometrica quadrado = new Quadrado(5); // chamei o meu construtor

		FiguraGeometrica retangulo = new Retangulo(5, 7);

		FiguraGeometrica triangulo = new Triangulo(4, 8);

		FiguraGeometrica circulo = new Circulo(6);
 
		System.out.printf("  A área do quadrado é: %.2f\n ", quadrado.calculoArea());
		System.out.printf(" A área do retângulo é: %.2f\n ", retangulo.calculoArea());
		System.out.printf(" A área do triângulo é: %.2f\n ", triangulo.calculoArea());
		System.out.printf(" A área do circulo é: %.2f\n ", circulo.calculoArea());
	}

}
