package exercicios;

import java.util.Scanner;

/**
 * Receber a idade de uma pessoa e classifique como: crian�a (at� 12),
 * adolescente (13�17), adulto (18�59), idoso (60+).
 */

public class ClassificarIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = obterIdade(sc);

		exibirClassificacao(idade);

		sc.close();
	}
	
	/**
     * Solicita ao usu�rio uma idade v�lida e garante que seja um n�mero positivo.
     * @param sc Scanner utilizado para entrada de dados.
     * @return Um n�mero inteiro representando a idade.
     */

	public static int obterIdade(Scanner sc) {
		int idade;
		do {
			System.out.print("Informe a idade da pessoa: ");
			while (!sc.hasNextInt()) {
				System.out.print("Entrada inv�lida! Digite um valor v�lido: ");
				sc.next();
			}
			idade = sc.nextInt();
            if (idade < 0) {
                System.out.println("O valor n�o pode ser negativo!");
            }
		}while(idade < 0);
		return idade;
	}

	public static void exibirClassificacao(int idade) {
		
		if (idade <= 12) {
			System.out.println("A pessoa � uma crian�a!");
		} else if (idade <= 17) {
			System.out.println("A pessoa � um adolescente!");
		} else if (idade <= 59) {
			System.out.println("A pessoa � um adulto!");
		} else {
			System.out.println("A pessoa � um idoso!");
		} 
		
	}
}