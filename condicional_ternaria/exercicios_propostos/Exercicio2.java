package exercicios_propostos;

import java.util.Scanner;

/*Dado um caractere, diga se é vogal ou consoante (considere apenas letras minúsculas).*/

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe uma letra do alfabeto: ");
		char letra = sc.next().toLowerCase().charAt(0);
		
		String tipo = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') ? "Vogal" : "Consoante";
		
		
		System.out.println("A letra é uma " + tipo);
		
		sc.close();

	}

}
