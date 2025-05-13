package exercicios_propostos;

import java.util.Scanner;

/*Verifique se um número é múltiplo de 5 e retorne "Sim" ou "Não" usando ternário.*/

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		double numero = sc.nextDouble();
		
		String multiplo = (numero % 5 == 0.0) ? "Sim" : "Não";
		
		System.out.printf("O número %.1f é múltiplo? %s%n", numero, multiplo);
		
		sc.close();

	}

}
