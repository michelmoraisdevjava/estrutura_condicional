package exercicio1;

import java.util.Scanner;
 /*Somar 1 ponto ao jogador se ele acertar a pergunta.*/
public class SomarPonto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pontos = 0;
		boolean acertou = false;
		do {
		System.out.print("O jogador acertou a pergunta (true/false)? ");
		acertou = sc.nextBoolean();
		
		if(acertou) pontos += 1;
		}while(acertou);
		
		System.out.printf("O jogador acumulou: %d pontos", pontos);
		
		sc.close();

	}

}
