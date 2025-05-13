package exercicios_resolvidos;

import java.util.Scanner;

/*Verificar se um número é positivo, negativo ou zero (com dois ternários)*/

public class VerificarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = sc.nextInt();
		
		String tipo = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
		
		System.out.println("O número é: " + tipo);
		
		sc.close();

	}

}
