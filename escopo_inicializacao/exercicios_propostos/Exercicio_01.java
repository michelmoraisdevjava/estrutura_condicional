package exercicios_propostos;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a opção:true - Para dizer Olá ou false - Para Tchau");
		boolean escolha = sc.nextBoolean();
		
		
		if(escolha) {
			System.out.println("\nOlá");
		} else {
			System.out.println("\nTchau");
		}
		
		sc.close();

	}

}
