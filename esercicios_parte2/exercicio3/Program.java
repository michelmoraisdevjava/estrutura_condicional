package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crie uma rotina que analisa um array de notas e 
 * soma apenas as que forem acima da média da turma, 
 * usando operadores cumulativos e if.*/

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> notas = new ArrayList<Double>();
		
		System.out.print("Total de notas: ");
		int n = sc.nextInt();
		
		System.out.print("Informe a quantidade de alunos: ");
		int quantidadeAlunos = sc.nextInt();
		
		double nota = 0.0;
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			System.out.print("Informe a " + (i + 1) + "ª nota: ");
			nota = sc.nextDouble();
			notas.add(nota);
			soma += nota;
		}
		
		System.out.println();
		double mediaDaTurma = soma / quantidadeAlunos;
		System.out.printf("A media da turma: %.1f%n", mediaDaTurma);
		
		double somaComFiltro = 0.0;
		for(double valor : notas) {
			if(valor > mediaDaTurma) {
				somaComFiltro +=  valor;
			}
		}
		
		System.out.printf("\nResultado da soma das notas "
				+ "acima da média da turma: %.1f ", somaComFiltro);
		
		sc.close();

	}

}
