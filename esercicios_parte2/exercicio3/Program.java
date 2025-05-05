package exercicio3;

import java.util.Scanner;

/*Crie uma rotina que analisa um array de notas e 
 * soma apenas as que forem acima da média da turma, 
 * usando operadores cumulativos e if.*/

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Turma turma = new Turma();//Instanciando a Classe Turma
		
		System.out.print("Informe a quantidade de alunos: ");
		int quantidadeAlunos = sc.nextInt();
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.print("Informe a " + (i + 1) + "ª nota: ");
			double nota = sc.nextDouble();
			turma.adicionarNota(nota);
		}
		
		System.out.printf("A media da turma: %.1f%n", turma.mediaDaTurma());
		System.out.printf("\nResultado da soma das notas "
				+ "acima da média da turma: %.1f ", turma.somarNotasAcimaDaMedia());
		
		sc.close();

	}

}
