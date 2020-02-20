package Aula14;

// Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de figura
// geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. 
// Use heran�a, classe abstrata e polimorfismo.

// criei a minha classe abstrata
public abstract class FiguraGeometrica { // o que tem em comum a todas as figuras geometricas... lados
	
	protected double area;

	public abstract double calculoArea();         
}

// vou criar um m�todo (abstrato) para eu
// cham�-lo em cada figura e fazer o seu
// devido c�lculo
