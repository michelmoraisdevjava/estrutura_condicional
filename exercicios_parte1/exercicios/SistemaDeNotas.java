package exercicios;

import java.util.Scanner;
/*3.	Simule um sistema de notas: receba duas notas, 
 * calcule a média e diga se foi "Reprovado" (<6), "Recuperação" (6 a 6.9), 
 * ou "Aprovado" (>=7).*/

public class SistemaDeNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1 = obterNota(sc, "Informe a primeira nota do aluno: ");
		double nota2 = obterNota(sc, "Informe a segunda nota do aluno: ");
		
		double media = calcularMedia(nota1, nota2);
		
		exibirResultado(media);
		
		sc.close();

	}
	
	public static double obterNota(Scanner sc, String mensagem) {
		System.out.print(mensagem);
		while(!sc.hasNextDouble()) {
			System.out.print("Entrada inválida! Digite um valor válido: ");
			sc.next();
		}
		return sc.nextDouble();
	}
	
	public static double calcularMedia(double nota1, double nota2) {
		return (nota1 + nota2) / 2.0;  
	}
	
	public static void exibirResultado(double media) {
		
		System.out.printf("A media do aluno foi %.1f%n", media);
		
		if(media < 6) {
			System.out.println("O aluno foi REPROVADO!");
		}else if(media <= 6.9) {
			System.out.println("O aluno está em RECUPERAÇÃO!");
		}else {
			System.out.println("O aluno foi APROVADO! PARABÉNS!");
		}
	}

}
