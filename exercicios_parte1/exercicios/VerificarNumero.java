package exercicios;

import java.util.Scanner;

// Verificar se um n�mero � positivo, negativo ou zero.

public class VerificarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		do {
			System.out.print("Informe um n�meiro inteiro: ");
			numero = sc.nextInt();

			if (numero > 0) {
				System.out.printf("N�mero %d � POSITIVO!%n", numero);
			} else if (numero < 0) {
				System.out.printf("N�mero %d � NEGATIVO%n", numero);
			} 
			System.out.println();
		} while (numero != 0);

		System.out.printf("O n�mero escolhido foi o %d (Zero)%n", numero);
		System.out.println();
		System.out.println("Fim do programa!");

		sc.close();

	}

}
