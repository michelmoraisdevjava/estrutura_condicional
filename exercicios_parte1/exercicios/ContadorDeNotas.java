package exercicios;

import java.util.Scanner;

/**
 * Simule um caixa eletrônico: receba um valor e exiba quantas notas de 100, 50,
 * 20 e 10 são necessárias para sacar esse valor (use condicionais +
 * matemática).
 */
public class ContadorDeNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		executar(sc);

		sc.close();

	}

	public static double obterValor(Scanner sc) {
		double valor;

		while (true) {
			System.out.print("Informe o valor do saque: ");

			if (!sc.hasNextDouble()) {
				System.out.print("Entrada inválida!\nDigite um valor numérico!\n");
				sc.next();
				continue;
			}
			valor = sc.nextDouble();

			if (valor < 0) {
				System.out.print("O valor não pode ser negativo!\n");
				continue;
			}
			break;
		}
		return valor;
	}

	public static void obterMenu() {
		System.out.println("\nEscolha qual nota deseja utilizar para saque:");
		System.out.println("1 - Notas de R$ 100,00");
		System.out.println("2 - Notas de R$ 50,00");
		System.out.println("3 - Notas de R$ 20,00");
		System.out.println("4 - Notas de R$ 10,00");
	}

	public static void executar(Scanner sc) {

		double valor = obterValor(sc);
		obterMenu();
		int opcao = sc.nextInt();
		int notaEscolhida = 0;

		switch (opcao) {
		case 1 -> notaEscolhida = 100;
		case 2 -> notaEscolhida = 50;
		case 3 -> notaEscolhida = 20;
		case 4 -> notaEscolhida = 10;
		default -> {
			System.out.println("Opção inválida!");
			return;
		}
		}

		int quantidadeNotas = (int) (valor / notaEscolhida);
		System.out.printf("Saque de %d notas de R$ %.2f%nValor total de saque R$ %.2f%n", quantidadeNotas,
				(double) notaEscolhida, valor);

	};
}
