package exercicios;

/*Para ignorar acentos gráficos, você pode utilizar a classe java.text.Normalizer*/
import java.text.Normalizer;
import java.util.Scanner;

/* Simule um sistema de estacionamento com switch para diferentes 
 * tipos de veículos: carro, moto, caminhão, ônibus.*/

public class SistemaEstacionamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		enum Tipos {
			CARRO, MOTO, CAMINHAO, ONIBUS
		}

		Tipos tipoVeiculo = null;

		while (tipoVeiculo == null) {
			System.out.print("Informe o tipo de veículo: ");
			String tipo = sc.nextLine().toUpperCase();
			String palavras = removerAcentos(tipo);

			// Verifica se contém números
			if (palavras.matches(".*\\d.*")) {
				System.out.println("Entrada inválida! Apenas texto é permitido.");
				continue;
			}

			// Verifica se contém caracteres especiais
			if (!palavras.matches("[a-zA-Z\\s]+")) {
				System.out.println("Entrada inválida! Apenas texto é permitido.");
				continue;
			} 
			
			// Tenta converter a entrada para um tipo válido
			try {
				tipoVeiculo = Tipos.valueOf(palavras);
			} catch (IllegalArgumentException e) {
				System.out.println("Tipo inválido! Opções disponíveis: CARRO, MOTO, CAMINHAO, ONIBUS.");
			}
		}

		switch (tipoVeiculo) {
			case CARRO -> System.out.println("Estacionamento para Carros!");
			case MOTO -> System.out.println("Estacionamento para Motos!");
			case CAMINHAO -> System.out.println("Estacionamento para Caminhões!");
			case ONIBUS -> System.out.println("Estacionamento para Ônibus!");
		}

		sc.close();

	}

	/*
	 * Normalizer.normalize() para decompor os caracteres acentuados e depois remove
	 * qualquer caractere não ASCII com replaceAll("[^\\p{ASCII}]", "")
	 */
	public static String removerAcentos(String texto) {
		String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
		return normalizado.replaceAll("[^\\p{ASCII}]", "");
	}

}
