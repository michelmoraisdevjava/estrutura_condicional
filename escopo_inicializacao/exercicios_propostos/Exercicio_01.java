package exercicios_propostos;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a op��o:true - Para dizer Ol� ou false - Para Tchau");
		boolean escolha = sc.nextBoolean();
		
		
		if(escolha) {
			System.out.println("\nOl�");
		} else {
			System.out.println("\nTchau");
		}
		
		sc.close();

	}

}
