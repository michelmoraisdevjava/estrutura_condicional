package exercicios;

/*Para ignorar acentos gr�ficos, voc� pode utilizar a classe java.text.Normalizer*/
import java.text.Normalizer;
import java.util.Scanner;

/* Simule um sistema de estacionamento com switch para diferentes 
 * tipos de ve�culos: carro, moto, caminh�o, �nibus.*/

public class SistemaEstacionamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		enum Tipos {
			CARRO, MOTO, CAMINHAO, ONIBUS
		}

		Tipos tipoVeiculo = null;

		while (tipoVeiculo == null) {
			System.out.print("Informe o tipo de ve�culo: ");
			String tipo = sc.nextLine().toUpperCase();
			String palavras = removerAcentos(tipo);

			// Verifica se cont�m n�meros
			if (palavras.matches(".*\\d.*")) {
				System.out.println("Entrada inv�lida! Apenas texto � permitido.");
				continue;
			}

			// Verifica se cont�m caracteres especiais
			if (!palavras.matches("[a-zA-Z\\s]+")) {
				System.out.println("Entrada inv�lida! Apenas texto � permitido.");
				continue;
			} 
			
			// Tenta converter a entrada para um tipo v�lido
			try {
				tipoVeiculo = Tipos.valueOf(palavras);
			} catch (IllegalArgumentException e) {
				System.out.println("Tipo inv�lido! Op��es dispon�veis: CARRO, MOTO, CAMINHAO, ONIBUS.");
			}
		}

		switch (tipoVeiculo) {
			case CARRO -> System.out.println("Estacionamento para Carros!");
			case MOTO -> System.out.println("Estacionamento para Motos!");
			case CAMINHAO -> System.out.println("Estacionamento para Caminh�es!");
			case ONIBUS -> System.out.println("Estacionamento para �nibus!");
		}

		sc.close();

	}

	/*
	 * Normalizer.normalize() para decompor os caracteres acentuados e depois remove
	 * qualquer caractere n�o ASCII com replaceAll("[^\\p{ASCII}]", "")
	 */
	public static String removerAcentos(String texto) {
		String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
		return normalizado.replaceAll("[^\\p{ASCII}]", "");
	}

}
