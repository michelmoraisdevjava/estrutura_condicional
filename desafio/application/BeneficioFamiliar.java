package application;

import java.util.Locale;
import java.util.Scanner;

public class BeneficioFamiliar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		executar(sc);
		
		sc.close();

	}
	
	public static double calcularBeneficio(double rendaTotal) {
		double beneficioBase = 0.0;
		if(rendaTotal < 24000.00) {
			beneficioBase = 6000.00;
		} else if(rendaTotal <= 48000.00) {
			beneficioBase = 4000.00;
		} else {
			beneficioBase = 0.0;
		}
		return beneficioBase;
	}
	
	public static double calcularAdicionalPorFilhos(int quantidadeFilhos) {
		
		double adicional = (quantidadeFilhos == 0) ? 0.0 : 800.00 * quantidadeFilhos;
		
		return adicional;
	}
	
	public static double calcularAdicionalPorZonaRural(String moraZonaRural) {
		
		double adicional = ("sim".equalsIgnoreCase(moraZonaRural) ? 1000.00 : 0.0);
		
		return adicional;
	}
	
	public static double calcularAdicionalPorDesemprego(String desempregado) {
		
		double adicional =("sim".equalsIgnoreCase(desempregado) ? 2000.00 : 0.0);
		
		return adicional;
	}
	
	public static int validarEntradaInt(Scanner sc) {
		while (!sc.hasNextInt()) { // Verifica se a entrada � um n�mero v�lido
	        System.out.print("Entrada inv�lida. Digite um n�mero inteiro: ");
	        sc.next(); // Descarta entrada inv�lida
	    }
		return sc.nextInt();
	}
	
	public static double validarRenda(Scanner sc) {
		while (!sc.hasNextDouble()) { // Verifica se a entrada � um n�mero v�lido
	        System.out.print("Entrada inv�lida. Digite um valor num�rico: ");
	        sc.next(); // Descarta entrada inv�lida
	    }
		return sc.nextDouble();
	}
	
	public static void executar(Scanner sc) {
		System.out.print("Renda total do casal por ano: ");
		double rendaTotal = validarRenda(sc);
		
		double beneficioBase = calcularBeneficio(rendaTotal);
		
		System.out.print("Quantidade de filhos menores de 18 anos: ");
		int quantidadeFilhos = validarEntradaInt(sc);
		
		double adicionalPorFilhos = calcularAdicionalPorFilhos(quantidadeFilhos);
		
		sc.nextLine();
		System.out.print("Se a fam�lia mora em zona rural (sim/n�o): ");
		String moraZonaRural = sc.nextLine().trim().toLowerCase();
		
		double adicionalZonaRural = calcularAdicionalPorZonaRural(moraZonaRural);
		
		System.out.print("Se um dos respons�veis est� desempregado (sim/n�o): ");
		String estaDesempregado = sc.nextLine().trim().toLowerCase();
		
		double adicionalPorDesemprego = calcularAdicionalPorDesemprego(estaDesempregado);
		
		System.out.println("\nRELAT�RIO DO BENEF�CIO FAMILIAR");
		System.out.printf("Benef�cio base: R$ %.2f%n", beneficioBase);
		System.out.printf("Adicional por filhos: R$ %.2f%n", adicionalPorFilhos);
		System.out.printf("Adicional por zona rural: R$ %.2f%n", adicionalZonaRural);
		System.out.printf("Adicional por desemprego: R$ %.2f%n", adicionalPorDesemprego);
		
		double valorFinal = beneficioBase + adicionalPorFilhos + adicionalZonaRural + adicionalPorDesemprego;
		
		System.out.printf("\nValor bruto calculado: R$ %.2f%n", valorFinal);
	}
	
}
