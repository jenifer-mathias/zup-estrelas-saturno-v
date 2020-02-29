package Aula14;

public class ExecutandoCalculoFigGeo implements IFiguraGeometrica {

	@Override
	public Double quadradoCalculoArea(Double lado) {
		return lado * lado;	
	}
	
	@Override
	public Double retanguloCalculoArea(Double base, Double altura) {
		return base * altura;
	}
	
	@Override
	public Double trianguloCalculoArea(Double base, Double altura) {
		return base * altura / 2;
	}
	
	@Override 
	public Double circuloCalculoArea(Double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
}

