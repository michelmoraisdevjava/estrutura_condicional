package exercicios;

import java.util.Scanner;

/*Fa�a um switch que imprime o nome do m�s a partir de um n�mero de 1 a 12*/

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
		System.out.print("Escolha o m�s de 1 a 12: ");

		validarNumeroInteiro(sc);

		int opcao = sc.nextInt();
		while (opcao != 0) {
			switch (opcao) {
			case 1 -> System.out.println("Janeiro");
			case 2 -> System.out.println("Fevereiro");
			case 3 -> System.out.println("Mar�o");
			case 4 -> System.out.println("Abril");
			case 5 -> {
				System.out.println("Maio");
				System.out.println("M�s de Anivers�rio da minha m�e");
			}
			case 6 -> System.out.println("Junho");
			case 7 -> System.out.println("Julho");
			case 8 -> System.out.println("Agosto");
			case 9 -> {
				System.out.println("Setembro");
				System.out.println("M�s de Anivers�rio do Michel");
			}
			case 10 -> System.out.println("Outubro");
			case 11 -> {
				System.out.println("Novembro");
				System.out.println("M�s de Anivers�rio do meu filho!");
			}
			case 12 -> System.out.println("Dezembro");
			default -> System.out.println("M�s inv�lido!");
			}
			
			System.out.print("Escolha o m�s de 1 a 12: ");
			validarNumeroInteiro(sc);
			opcao = sc.nextInt();
		}
	}

}
