package exercicios;

import java.util.Scanner;

/**
 * Crie uma função que recebe uma nota (0-10) e retorna um conceito (A, B, C...)
 * usando switch expression.
 */

public class NotaConceito {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor da nota: ");
		int nota = validarNota(sc);
		sc.nextLine();
		String conceito = notaConceito(nota);

		System.out.printf("A nota informada : %d%n", nota);
		System.out.printf("O conceito foi: %s%n", conceito);

		sc.close();
	}

	public static int validarNota(Scanner sc) {
		int nota;
		do {
			while (!sc.hasNextInt()) {
				System.out.println("Permitido apenas valores inteiros!");
				System.out.print("Qual o valor da nota: ");
				sc.next();
			}

			nota = sc.nextInt();

			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida! Digite um valor entrre 0 e 10");
			}

		} while (nota < 0 || nota > 10);
		
		return nota;
	}

	public static String notaConceito(int nota) {
		return switch (nota) {
		case 0, 1, 2, 3 -> "Conceito D";
		case 4, 5, 6 -> "Conceito C";
		case 7, 8 -> "Conceito B";
		case 9, 10 -> "Conceito A";
		default -> "nota inválida!";
		};
	}
}
