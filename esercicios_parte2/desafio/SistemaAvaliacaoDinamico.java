package desafio;

import java.util.Scanner;

public class SistemaAvaliacaoDinamico {
	private static final int AVALIACOES = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe as pontuações!");
		
		avaliar(sc);

		sc.close();

	}
	
	public static double obterPonto(Scanner sc) {
		while(!sc.hasNextDouble()) {
			System.out.println("Entrada inválida!");
			System.out.print("Digite um valor numérico: ");
			sc.next();
		}
		return sc.nextDouble();
	}

	public static void avaliar(Scanner sc) {
		Avaliacao avaliacao = new Avaliacao();

		for (int i = 0; i < AVALIACOES; i++) {
			double pontuacao = 0.0;
			System.out.print("Informa a " + (i + 1) + "ª pontuação: ");
			pontuacao = obterPonto(sc);
			avaliacao.adicionarPonto(pontuacao);
		}

		System.out.printf("\nO total de pontos acumulados: %.1f%n", avaliacao.calcularSomaAcimaDe60());
		System.out.printf("A média final: %.1f%n", avaliacao.calcularMediaFinal());
		System.out.printf("Situação Final do aluno: %s%n", avaliacao.verificarSituacao());
	}

}
