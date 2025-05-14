package exercicios_propostos;

import java.util.Scanner;

/*Dado um valor de compra, aplique 3 faixas de desconto 
 * (até 100 = 5%, até 500 = 10%, acima de 500 = 15%).*/

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("informe o valor para receber o desconto: ");
		double valor = sc.nextDouble();
		
		double desconto = (valor <= 100.0) ? 0.05 : (valor > 100 && valor <= 500.00) ? 0.1 : 0.15;
		
		System.out.printf("O desconto foi de %.1f%% em cima do valor R$ %.2f%n", desconto * 100, valor);
		
		sc.close();

	}

}
