package exercicios;

import java.util.Scanner;

/* Usando String, crie um switch para diferentes comandos de 
 * menu: "iniciar", "parar", "reiniciar", "sair".*/

public class Menu2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolhas as opções do Menu!\n");
		System.out.println("Iniciar");
		System.out.println("Parar");
		System.out.println("Reiniciar");
		System.out.println("Sair");
		
		String opcao = sc.nextLine();
		
		switch(opcao.toLowerCase()) {
			case "iniciar" -> System.out.println("Programa iniciado!");
			case "parar" -> System.out.println("Programa parado!");
			case "reiniciar" -> System.out.println("Programa reiniciado!");
			case "sair" -> System.out.println("Sair do Programa!");
			default -> System.out.println("Opção inválida!");
		}
		
		sc.close();

	}

}
