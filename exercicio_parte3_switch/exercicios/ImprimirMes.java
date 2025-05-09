package exercicios;

import java.util.Scanner;

/*Faça um switch que imprime o nome do mês a partir de um número de 1 a 12*/

public class ImprimirMes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		executarPrograma(sc);
		
		System.out.println("Fim do Programa!");

		sc.close();

	}
	
	public static void validarNumeroInteiro(Scanner sc) {
		while (!sc.hasNextInt()) {
			System.out.print("Escolha um valor inteiro de 1 a 12: ");
			sc.next();
		}
	}
	
	public static void executarPrograma(Scanner sc) {
		System.out.print("Escolha o mês de 1 a 12: ");

		validarNumeroInteiro(sc);

		int opcao = sc.nextInt();
		while (opcao != 0) {
			switch (opcao) {
			case 1 -> System.out.println("Janeiro");
			case 2 -> System.out.println("Fevereiro");
			case 3 -> System.out.println("Março");
			case 4 -> System.out.println("Abril");
			case 5 -> {
				System.out.println("Maio");
				System.out.println("Mês de Aniversário da minha mãe");
			}
			case 6 -> System.out.println("Junho");
			case 7 -> System.out.println("Julho");
			case 8 -> System.out.println("Agosto");
			case 9 -> {
				System.out.println("Setembro");
				System.out.println("Mês de Aniversário do Michel");
			}
			case 10 -> System.out.println("Outubro");
			case 11 -> {
				System.out.println("Novembro");
				System.out.println("Mês de Aniversário do meu filho!");
			}
			case 12 -> System.out.println("Dezembro");
			default -> System.out.println("Mês inválido!");
			}
			
			System.out.print("Escolha o mês de 1 a 12: ");
			validarNumeroInteiro(sc);
			opcao = sc.nextInt();
		}
	}

}
