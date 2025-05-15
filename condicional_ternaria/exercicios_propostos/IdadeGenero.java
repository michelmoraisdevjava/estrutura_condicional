package exercicios_propostos;

import java.util.Scanner;

/*Implemente um sistema que leia idade e gênero, 
 * e retorne mensagens personalizadas como:
o	"Menor de idade - Feminino"
o	"Maior de idade - Masculino"
*/

public class IdadeGenero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a idade da pessoa: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Informe o gênero da pessoa: ");
		String genero = sc.nextLine().trim().toLowerCase();
		
		/*String mensagem = (idade >= 18 && genero.equals("masculino")) ? "Maior de idade - Masculino" 
				: (idade < 18 && genero.equals("feminino")) ? "Menor de idade - Feminino" 
						: (idade >= 18 && genero.equals("feminino")) ? "Maior de idade - Feminino" : "Menor de idade - Masculino";*/
		
		// Condicional ternária otimizada
        String mensagem = genero.equals("masculino") ? 
                (idade >= 18 ? "Maior de idade - Masculino" : "Menor de idade - Masculino") :
                genero.equals("feminino") ? 
                (idade >= 18 ? "Maior de idade - Feminino" : "Menor de idade - Feminino") :
                "Gênero não reconhecido.";
		
		System.out.println(mensagem);
		
		sc.close();

	}

}
