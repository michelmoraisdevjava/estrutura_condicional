package exercicios_resolvidos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();

		if (x == 7) {
			System.out.println("Acertou");
		} else {
			System.out.println("Errou!");
		}

		System.out.println(x);
		
		sc.close();

	}

}
