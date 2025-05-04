package exercicio1;

import java.util.Scanner;
 /*Some 1 ponto ao jogador se ele acertar a pergunta.*/
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
		
		//Subtraia 5 pontos se o tempo acabar
		final int PENALIZACAO_TEMPO = 5;
		
		System.out.print("O tempo acabou? (sim/nao) ");
		sc.nextLine();
		String tempoAcabou = sc.nextLine();
		
		if(tempoAcabou.equalsIgnoreCase("sim")) {
			pontos -= PENALIZACAO_TEMPO;
		}
		
		System.out.printf("O jogador acumulou: %d pontos", pontos);
		
		sc.close();

	}

}
