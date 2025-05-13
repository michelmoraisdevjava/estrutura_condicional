package exercicios_resolvidos;

import java.util.Scanner;

/*Verificar se um n�mero � positivo, negativo ou zero (com dois tern�rios)*/

public class VerificarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int numero = sc.nextInt();
		
		String tipo = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
		
		System.out.println("O n�mero �: " + tipo);
		
		sc.close();

	}

}
