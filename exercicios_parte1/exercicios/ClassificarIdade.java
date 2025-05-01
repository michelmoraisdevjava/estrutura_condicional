package exercicios;

import java.util.Scanner;

/**
 * Receber a idade de uma pessoa e classifique como: criança (até 12),
 * adolescente (13–17), adulto (18–59), idoso (60+).
 */

public class ClassificarIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = obterIdade(sc);

		exibirClassificacao(idade);

		sc.close();
	}
	
	/**
     * Solicita ao usuário uma idade válida e garante que seja um número positivo.
     * @param sc Scanner utilizado para entrada de dados.
     * @return Um número inteiro representando a idade.
     */

	public static int obterIdade(Scanner sc) {
		int idade;
		do {
			System.out.print("Informe a idade da pessoa: ");
			while (!sc.hasNextInt()) {
				System.out.print("Entrada inválida! Digite um valor válido: ");
				sc.next();
			}
			idade = sc.nextInt();
            if (idade < 0) {
                System.out.println("O valor não pode ser negativo!");
            }
		}while(idade < 0);
		return idade;
	}

	public static void exibirClassificacao(int idade) {
		
		if (idade <= 12) {
			System.out.println("A pessoa é uma criança!");
		} else if (idade <= 17) {
			System.out.println("A pessoa é um adolescente!");
		} else if (idade <= 59) {
			System.out.println("A pessoa é um adulto!");
		} else {
			System.out.println("A pessoa é um idoso!");
		} 
		
	}
}