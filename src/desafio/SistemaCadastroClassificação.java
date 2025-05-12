package desafio;

import java.util.Scanner;

public class SistemaCadastroClassificação {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		enum Usuarios {
			ADMIN, CLIENTE, VISITANTE
		}

		Usuarios usuario = null;

		while (usuario == null) {
			System.out.print("Imforme o tipo de usuário: ");
			String tipoUsuario = sc.nextLine().toUpperCase();
			
			if (tipoUsuario.matches(".*\\d.*")) {
				System.out.println("Entrada inválida! Apenas texto é permitido.");
				continue;
			}
			
			// Verifica se contém caracteres especiais
			if (!tipoUsuario.matches("[a-zA-Z\\s]+")) {
				System.out.println("Entrada inválida! Apenas texto é permitido.");
				continue;
			} 

			try {
				usuario = Usuarios.valueOf(tipoUsuario);
				
				System.out.print("Informe a ação desejada(criar, editar e visualizar): ");
				String acao = sc.nextLine().toLowerCase();
				
				if (acao.matches(".*\\d.*")) {
					System.out.println("Entrada inválida! Apenas texto é permitido.");
					continue;
				}
				
				switch (usuario) {
				case ADMIN -> {
					switch (acao) {
						case "criar", "editar", "visualizar" -> System.out.println("Admin tem acesso à ação " + acao);
						default -> System.out.println("Ação inválida para Admin!");
					}
				}
				case CLIENTE -> {
					switch (acao) {
						case "editar", "visualizar" -> System.out.println("O cliente pode " + acao);
						default -> System.out.println("Ação inválida para Cliente!");
					}
				}
				case VISITANTE -> {
					if (acao.equalsIgnoreCase("visualizar")) {
						System.out.println("Visitante pode visualizar");
					} else {
						System.out.println("Ação inválida para visitante!");
					}
				}
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Tipo de usuário inválido!");
			}
		}

		sc.close();

	}

}
