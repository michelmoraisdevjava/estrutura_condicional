package exercicio2;

import java.util.Scanner;

public class SomarDescontos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double DESCONTO_NOVO = 0.05;
		final double DESCONTO_VIP = 0.1;
		final double DESCONTO_ESPECIAL = 0.1;
		double descontoTotal = 0.0;
		
		System.out.print("Valor das compras: ");
		double compras = sc.nextDouble();
		
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
		
		double totalGasto = 0.0;
		if(compras > 200.00) {
			totalGasto = compras - (descontoTotal + DESCONTO_ESPECIAL) * compras;
			System.out.println("O cliente teve mais um desconto de 10% em compras acima de R$ 200.00");
			System.out.printf("\nO total gasto da compra com os descontos foi de R$ %.2f%n", totalGasto);
		}else {
			totalGasto = compras - (descontoTotal * compras);
			System.out.printf("\nO total gasto da compra com os descontos foi de R$ %.2f%n", totalGasto);
		}
		
		
		System.out.println("\nFim do Progrma!");
		
		sc.close();

	}

}
