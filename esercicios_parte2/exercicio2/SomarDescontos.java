package exercicio2;

import java.util.Scanner;

public class SomarDescontos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double DESCONTO_NOVO = 0.05;
		final double DESCONTO_VIP = 0.1;
		double descontoTotal = 0.0;
		
		System.out.println("Escolhas as opções de Clientes:");
		System.out.println("1 - Cliente novo");
		System.out.println("2 - Cliente VIP");
		System.out.println("3 - Cliente novo e VIP");
		int opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:
				descontoTotal = DESCONTO_NOVO;
				System.out.printf("O cliente na categoria novo tem um desconto de %.2f%%%n", descontoTotal * 100);
				break;
			case 2: 
				descontoTotal = DESCONTO_VIP;
				System.out.printf("O cliente na categoria VIP tem um desconto de %.2f%%%n", descontoTotal * 100);
				break;
			case 3: 
				descontoTotal = DESCONTO_NOVO + DESCONTO_VIP;
				System.out.printf("O cliente na categoria novo e VIP tem um desconto total de %.2f%%%n", descontoTotal * 100);
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
		}
		
		
		System.out.println("\nFim do Progrma!");
		
		sc.close();

	}

}
