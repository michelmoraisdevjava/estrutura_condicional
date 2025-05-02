package desafio;

import java.util.Scanner;

public class SistemaAvaliacaoAcademico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeAluno = lerNome(sc);
		double nota1 = lerNota(sc, 1);
		double nota2 = lerNota(sc, 2);
		double frequencia = lerFrequencia(sc);
		double media = calcularMedia(nota1, nota2);
		String situacao = avaliarAluno(media, frequencia);

		exibirResultado(nomeAluno, media, frequencia, situacao);

		sc.close();

	}

	public static String lerNome(Scanner sc) {
		System.out.print("Nome do aluno: ");
		return sc.nextLine();
	}

	public static double lerNota(Scanner sc, int numeroNota) {
		double nota;

		while (true) {
			System.out.printf("Digite a %dª nota: ", numeroNota);

			if (!sc.hasNextDouble()) {
				System.out.print("Entrada inválida!\nDigite um valor numérico!\n");
				sc.next();
				continue;
			}

			nota = sc.nextDouble();
			if (nota < 0) {
				System.out.print("O valor não pode ser negativo!\n");
				continue;
			}
			break;

		}
		return nota;
	}

	public static double lerFrequencia(Scanner sc) {

		while (true) {
			System.out.print("Informe a frequencia do aluno: ");
			
			if(!sc.hasNextDouble()) {
				System.out.print("Entrada inválida!\nDigite um valor numérico!\n");
				sc.next();
				continue;
			}
			break;
		}
		return sc.nextDouble();
		
	}

	public static double calcularMedia(double n1, double n2) {
		return (n1 + n2) / 2;
	}

	public static String avaliarAluno(double media, double frequencia) {
		if (media >= 7 && frequencia >= 75) {
			return "Aprovado";
		} else if (media >= 5 && frequencia >= 75) {
			return "Recuperação";
		} else if (frequencia < 75) {
			return "Reprovado por faltas";
		} else {
			return "Reprovado";
		}
	}

	public static void exibirResultado(String nomeAluno, double media, double frequencia, String situacao) {
		System.out.printf("\nNome do Aluno: %s%n", nomeAluno);
		System.out.printf("Média do aluno: %.2f%n", media);
		System.out.printf("Frequência do aluno: %.1f%%%n", frequencia);
		System.out.printf("A situação do aluno: %s%n", situacao);
	}

}
