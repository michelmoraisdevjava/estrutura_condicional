package exercicios_propostos;

import java.util.Scanner;

/*Avalie a média de um aluno e retorne "Aprovado", "Reprovado" ou 
 * "Recuperação" com ternários aninhados.*/

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a média do aluno: ");
		double media = sc.nextDouble();
		
		String statusAluno = (media >= 7.0) ? "Aprovado" : (media >= 5 && media < 7.0) ? "Recuperação" : "Reprovado";
		
		System.out.printf("Com a média %.1f o  status do aluno é %s%n", media, statusAluno);
		
		sc.close();

	}

}
