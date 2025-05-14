package exercicios_propostos;

import java.util.Scanner;

/*Avalie a m�dia de um aluno e retorne "Aprovado", "Reprovado" ou 
 * "Recupera��o" com tern�rios aninhados.*/

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a m�dia do aluno: ");
		double media = sc.nextDouble();
		
		String statusAluno = (media >= 7.0) ? "Aprovado" : (media >= 5 && media < 7.0) ? "Recupera��o" : "Reprovado";
		
		System.out.printf("Com a m�dia %.1f o  status do aluno � %s%n", media, statusAluno);
		
		sc.close();

	}

}
