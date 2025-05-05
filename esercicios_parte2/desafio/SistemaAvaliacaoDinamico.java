package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAvaliacaoDinamico {
	private static final int AVALIACOES = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> pontos = new ArrayList<Double>();

		double somaPontos = 0.0;
		double pontuacao = 0.0;
		int count = 0;
		for (int i = 0; i < AVALIACOES; i++) {
			System.out.print("Informa a " + (i + 1) + "ª pontuação: ");
			pontuacao = sc.nextDouble();
			pontos.add(pontuacao);
			if (pontuacao > 60.0) {
				somaPontos += pontuacao;
				count++;
			}
		}

		double mediaFinal = 0.0;

		if (pontuacao < 60) {
			mediaFinal = somaPontos / count;
			System.out.println("É preciso atingir uma pontuação mínima acima de 60.0 pontos!");
		}else {
			System.out.printf("A soma dos pontos acumulados: %.1f%n", somaPontos);
			mediaFinal = somaPontos / count;
			System.out.printf("A média final: %.1f%n", mediaFinal);
		}

		if (mediaFinal > 70.0) {
			mediaFinal += 10.0;
			System.out.printf("A média final com Bônus: %.1f%n", mediaFinal);
		}

		String situacao = (mediaFinal >= 60.0) ? "Aprovado" : "Reprovado";

		System.out.printf("Situação Final do aluno: %s%n", situacao);

		sc.close();

	}

}
