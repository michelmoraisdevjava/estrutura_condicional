package desafio;

import java.util.Scanner;

public class SistemaCadastroClassifica��o {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		enum Usuarios {
			ADMIN, CLIENTE, VISITANTE
		}

		Usuarios usuario = null;

		while (usuario == null) {
			System.out.print("Imforme o tipo de usu�rio: ");
			String tipoUsuario = sc.nextLine().toUpperCase();
			
			if (tipoUsuario.matches(".*\\d.*")) {
				System.out.println("Entrada inv�lida! Apenas texto � permitido.");
				continue;
			}
			
			// Verifica se cont�m caracteres especiais
			if (!tipoUsuario.matches("[a-zA-Z\\s]+")) {
				System.out.println("Entrada inv�lida! Apenas texto � permitido.");
				continue;
			} 

			try {
				usuario = Usuarios.valueOf(tipoUsuario);
				
				System.out.print("Informe a a��o desejada(criar, editar e visualizar): ");
				String acao = sc.nextLine().toLowerCase();
				
				if (acao.matches(".*\\d.*")) {
					System.out.println("Entrada inv�lida! Apenas texto � permitido.");
					continue;
				}
				
				switch (usuario) {
				case ADMIN -> {
					switch (acao) {
						case "criar", "editar", "visualizar" -> System.out.println("Admin tem acesso � a��o " + acao);
						default -> System.out.println("A��o inv�lida para Admin!");
					}
				}
				case CLIENTE -> {
					switch (acao) {
						case "editar", "visualizar" -> System.out.println("O cliente pode " + acao);
						default -> System.out.println("A��o inv�lida para Cliente!");
					}
				}
				case VISITANTE -> {
					if (acao.equalsIgnoreCase("visualizar")) {
						System.out.println("Visitante pode visualizar");
					} else {
						System.out.println("A��o inv�lida para visitante!");
					}
				}
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Tipo de usu�rio inv�lido!");
			}
		}

		sc.close();

	}

}
