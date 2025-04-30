package exercicios;

import java.util.Scanner;

/**
 * Receber a idade de uma pessoa e classifique como: criança (até 12),
 * adolescente (13–17), adulto (18–59), idoso (60+).
 */

public class ClassificarIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		classificarIdade(sc);

		sc.close();
	}

	public static int validarEntradaInt(Scanner sc) {
		while (!sc.hasNextInt()) {
			System.out.print("Entrada inválida! Digite um valor válido: ");
			sc.next();
		}
		return sc.nextInt();
	}

	public static void classificarIdade(Scanner sc) {
		int idade;

		System.out.print("Informe a idade da pessoa: ");
		idade = validarEntradaInt(sc);
		
		while(idade < 0) {
			System.out.print("O valor não pode ser negativo! Digite um número válido: ");
			idade = validarEntradaInt(sc);
		}
		
		if (idade >= 0 && idade <= 12) {
			System.out.println("A pessoa é uma criança!");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("A pessoa é um adolescente!");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("A pessoa é um adulto!");
		} else if (idade >= 60) {
			System.out.println("A pessoa é um idoso!");
		} 
		
	}
}