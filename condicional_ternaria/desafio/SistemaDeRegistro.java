package desafio;

import java.util.Scanner;

/**Sistema que receba os seguintes dados:
•	Nome
•	Idade
•	Gênero ('M' ou 'F')
•	Nota final
E exiba uma saída como:
Maria, 17 anos - Feminino - Reprovada
João, 19 anos - Masculino - Aprovado
 Regras:
•	Idade < 18 → Menor de idade
•	Nota >= 7 → Aprovado, senão → Reprovado
•	Gênero → 'M' = Masculino, 'F' = Feminino
📘 Desafios incluídos:
•	Múltiplas expressões ternárias
•	Clareza de código
•	Condições compostas
•	Tratamento de char e String
*/

public class SistemaDeRegistro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do(a) Aluno(a): ");
		String nome = sc.nextLine();
		
		System.out.print("Informe a idade do(a) aluno(a): ");
		int idade = validarIdade(sc);
		
		System.out.print("Informe o gênero do(a) aluno(a): ");
		char genero = sc.next().trim().toUpperCase().charAt(0);
		
		System.out.print("Informe a nota final do(a) aluno(a): ");
		double notaFinal = validarNotaFinal(sc);	
		
		String mensagem = genero == 'M' ? 
                (notaFinal >= 7 ? "Masculino - Aprovado" : "Masculino - Reprovado") :
                genero == 'F' ? 
                (notaFinal >= 7 ? "Feminino - Aprovada" : "Feminino - Reprovada") :
                "Gênero não reconhecido.";
		
		System.out.println(nome + ", " + idade + " anos - " + mensagem);
				
		sc.close();

	}
	
	public static int validarIdade(Scanner sc) {
		while(!sc.hasNextInt()) {
			System.out.print("Idade inválida! Informe um valor inteiro: ");
			sc.next();
		}
		return sc.nextInt();
	}
	
	public static double validarNotaFinal(Scanner sc) {
		while(!sc.hasNextInt()) {
			System.out.print("Nota inválida! Informe um valor numérico: ");
			sc.next();
		}
		return sc.nextDouble();
	}
}
