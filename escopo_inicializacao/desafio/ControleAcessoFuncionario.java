package desafio;

import java.util.Scanner;

public class ControleAcessoFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Opções de nível:");
		System.out.println("1 - Analista");
		System.out.println("2 - Supervisor");
		System.out.println("3 - Gerente");
		System.out.print("O nível de Acesso escolhido foi: ");
		
		while(!sc.hasNextInt()) {
			System.out.print("Informe um valor numérico do Opções de nível: ");
			sc.next();
		}
		
		int nivelAcesso = sc.nextInt();
		
		String cargo = switch(nivelAcesso) {
			case 1 -> "Cargo de Analista";
			case 2 -> "Cargo de Supervisor";
			case 3 -> "Cargo de Gerente";
			case 0 -> "Outro cargo";
			default -> "Opção inválida!";
		};
		
		System.out.println(cargo);
		
		sc.close();

	}

}
