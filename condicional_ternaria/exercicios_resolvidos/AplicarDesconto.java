package exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class AplicarDesconto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe o valor da compra: ");
		double compra = sc.nextDouble();
		
		double desconto = (compra > 100.00) ? compra * 0.1 : compra * 0.05;
		
		System.out.printf("O desconto da loja foi R$ %.2f%n", desconto);
		
		sc.close();

	}

}
