package Aula15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Estacionamento {
	
	public Double valorEmCaixa;
	public int CapacidadeMax = 15;

	public Estacionamento(Double valorEmCaixa, int capacidadeMax) {
		this.valorEmCaixa = valorEmCaixa;
		CapacidadeMax = capacidadeMax;
	}

	public static void main(String[] args) {

		 for (int i = 0; i < 15; i++) {

			Scanner teclado = new Scanner(System.in);

			System.out.println(" Digite a placa do seu carro: ");
			String placa = teclado.next();

			System.out.println(" Digite a cor do seu carro: ");
			String cor = teclado.next();

			System.out.println(" Digite a marca do seu carro: ");
			String marca = teclado.next();

			System.out.println(" Digite o modelo do seu carro: ");
			String modelo = teclado.next();

			System.out.println(" "); 

			Carro2 carro = new Carro2(placa, cor, marca, modelo); 

			Map<String, Carro2> carroEstac = new HashMap<String, Carro2>();

			for (int j = 1; j <= 15; j++) {
				Scanner teclado = new Scanner(System.in);
				System.out.println(" Digite a placa do carro: ");
				String placa = teclado.next();
				
				carroEstac.put(placa, Carro2); // inserindo um elemento no mapa
			}

			System.out.println(carroEstac.get(placa)); // acessando diretamente um elemento pela sua chave

			for (Carro2 string : carroEstac.values()) { // retorna todos os valores dentro do mapa
				System.out.println(string);
			}
		}

	}
	
	public Double registraEntrada() {
		if ( < 15)
			++
	}
	
	public Double registraSaida() {
		--
	}
	
	public void imprimeSaldo() {
		System.out.println(this.getValorEmCaixa());
	}
	
	public void carroPresente() {
		
	}
	
	public Double getValorEmCaixa() {
		return valorEmCaixa;
	}

	public void setValorEmCaixa(Double valorEmCaixa) {
		this.valorEmCaixa = valorEmCaixa;
	}

	public int getCapacidadeMax() {
		return CapacidadeMax;
	}

	public void setCapacidadeMax(int capacidadeMax) {
		CapacidadeMax = capacidadeMax;
	}

}
