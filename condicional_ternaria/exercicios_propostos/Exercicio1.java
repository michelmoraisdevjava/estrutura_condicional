package exercicios_propostos;

import java.util.Scanner;

/*Verifique se um n�mero � m�ltiplo de 5 e retorne "Sim" ou "N�o" usando tern�rio.*/

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o n�mero: ");
		double numero = sc.nextDouble();
		
		String multiplo = (numero % 5 == 0.0) ? "Sim" : "N�o";
		
		System.out.printf("O n�mero %.1f � m�ltiplo? %s%n", numero, multiplo);
		
		sc.close();

	}

}
