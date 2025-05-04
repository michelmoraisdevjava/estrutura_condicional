package exercicio1;

import java.util.Scanner;

/*Some 1 ponto ao jogador se ele acertar a pergunta.*/
public class SomarPonto {

	private static final int PONTOS_POR_ACERTO = 1;
	private static final int PENALIZACAO_TEMPO = 5;
	private static final int TEMPO_LIMITE_MS = 5000; // 5 segundos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pontos = 0;
		String resposta = null;
		
		do {
		System.out.println("Responda a pergunta antes do tempo acabar! (Digite 'sim' para acertar)");
		
		// Criando uma thread para controlar o tempo
        long inicioTempo = System.currentTimeMillis();
        resposta = sc.nextLine();
        long tempoDecorrido = System.currentTimeMillis() - inicioTempo;
        
        if (tempoDecorrido <= TEMPO_LIMITE_MS && resposta.equalsIgnoreCase("sim")) {
            pontos += PONTOS_POR_ACERTO;
        } else {
            pontos -= PENALIZACAO_TEMPO;
            break;
        }
        
		}while(resposta != "sim");
        
		System.out.printf("O jogador acumulou: %d pontos", pontos);
		
		sc.close();

	}

}
