package Aula10;

import java.util.Scanner;

public class ProgramaConta {
	
	//POR FAVOR, ENCONTREM UMA MANEIRA ELEGANTE DE LIMPAR A TELA.
	public static ContaBancaria criaConta(ContaBancaria conta, Scanner teclado) {

		teclado.nextLine();
		System.out.println("Digite o nome do correntista:");
		String correntista = teclado.nextLine();
		System.out.println("Digite o número da conta:");
		String numeroDaConta = teclado.nextLine();

		return new ContaBancaria(numeroDaConta, 0, correntista);
	}

	public static void tiraExtrato(ContaBancaria conta) {
		if (conta != null) {
			conta.extrato();
		} else {
			System.out.println("Favor criar a conta.");
		}
	}

	public static void realizaDeposito(ContaBancaria conta, Scanner teclado) {
		teclado.nextLine();

		if (conta != null) {
			System.out.println("Digite o valor a ser depositado: ");
			double valorDepositado = teclado.nextDouble();
			if (conta.deposito(valorDepositado)) {
				System.out.println("Valor depositado com sucesso.");
			} else {
				System.out.println("Não é possível depositar um valor negativo.");
			}
		} else {
			System.out.println("Favor criar a conta.");
		}

	}

	public static void realizaSaque(ContaBancaria conta, Scanner teclado) {
		teclado.nextLine();

		if (conta != null) {
			System.out.println("Digite o valor a ser sacado: ");
			double valorSacado = teclado.nextDouble();

			if (conta.saque(valorSacado)) {
				System.out.println("Saque foi realizado com sucesso.");
			} else {
				System.out.println("Houve um problema com seu saque. (Saldo insuficiente)");
			}
			// Este está diferente pois aprendemos que podemos usar o return para parar
			// execuções em métodos do tipo void.
			return;
		}

		System.out.println("Favor criar a conta.");
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ContaBancaria conta = null;

		int opcao;
		do {

			System.out.println("##Menu do banco Estrelas##\n");
			System.out.println("Para criar uma conta digite 		1");
			System.out.println("Para consultar o extrato digite 	2");
			System.out.println("Para realizar um depósito digite 	3");
			System.out.println("Para realizar um saque digite  		4");
			System.out.println("Para sair digite -1");

			opcao = teclado.nextInt();

			if (opcao == -1) {
				break;
			}

			switch (opcao) {
			case 1:
				conta = criaConta(conta, teclado);
				break;
			case 2: // Extrato
				tiraExtrato(conta);
				break;
			case 3:
				realizaDeposito(conta, teclado);
				break;
			case 4:
				realizaSaque(conta, teclado);
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != -1);

		System.out.println("Tenha um bom descanso, até amanhã.");

		teclado.close();
	}

}