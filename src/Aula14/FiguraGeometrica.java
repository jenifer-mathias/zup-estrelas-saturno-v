package Aula14;

// Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura
// geométrica: quadrado, retângulo, triângulo e círculo. 
// Use herança, classe abstrata e polimorfismo.

// criei a minha classe abstrata
public abstract class FiguraGeometrica { // o que tem em comum a todas as figuras geometricas... lados
	
	protected double area;

	public abstract double calculoArea();         
}

// vou criar um método (abstrato) para eu
// chamá-lo em cada figura e fazer o seu
// devido cálculo
