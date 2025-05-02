package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Crie um menu de opções com switch: cadastrar usuário, listar usuários, sair.*/

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		executar(sc);

		sc.close();

	}

	public static int menu(Scanner sc) {
		System.out.println("Menu de opções:\n");
		System.out.println("1 - Cadastrar usuário");
		System.out.println("2 - Listar usuários");
		System.out.println("3 - Sair");
		System.out.print("Escolha uma opção: ");
		return sc.nextInt();
	}
	

	public static void executar(Scanner sc) {
		List<String> listaUsuarios = new ArrayList<String>();
		int opcao;
		do {
			opcao = menu(sc);
			sc.nextLine();

			switch (opcao) {
			case 1:
				cadastrarUsuario(sc, listaUsuarios);
				break;
			case 2:
				listarUsuarios(listaUsuarios);
				break;
			case 3:
				System.out.println("Fim do Programa!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 3);
		
	}
	
	public static void cadastrarUsuario(Scanner sc, List<String> listaUsuarios) {
		System.out.print("Digite o nome do usuário: ");
		String usuario = sc.nextLine();
		listaUsuarios.add(usuario);
		System.out.println("Usuário cadastrado com sucesso!");
		System.out.println();
	}
	
	public static void listarUsuarios(List<String> listaUsuarios) {
		System.out.println("\nLista de usuários cadastrados");
		if (listaUsuarios.isEmpty()) {
		    System.out.println("Nenhum usuário cadastrado.");
		} else {
		    for (String nome : listaUsuarios) {
		        System.out.println(nome);
		    }
		}
		System.out.println();
	}

}
