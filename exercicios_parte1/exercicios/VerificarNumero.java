package exercicios;

import java.util.Scanner;

// Verificar se um número é positivo, negativo ou zero.

public class VerificarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		do {
			System.out.print("Informe um númeiro inteiro: ");
			numero = sc.nextInt();

			if (numero > 0) {
				System.out.printf("Número %d é POSITIVO!%n", numero);
			} else if (numero < 0) {
				System.out.printf("Número %d é NEGATIVO%n", numero);
			} 
			System.out.println();
		} while (numero != 0);

		System.out.printf("O número escolhido foi o %d (Zero)%n", numero);
		System.out.println();
		System.out.println("Fim do programa!");

		sc.close();

	}

}
