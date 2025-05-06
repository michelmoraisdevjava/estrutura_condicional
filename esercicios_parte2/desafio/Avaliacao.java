package desafio;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {

	private List<Double> pontos;

	public Avaliacao() {
		this.pontos = new ArrayList<Double>();
	}

	// método para adicionar os pontos a lista
	public void adicionarPonto(double pontuacao) {
		pontos.add(pontuacao);
	}

	public List<Double> getPontuacoes() {
		return pontos;
	}

	public double calcularSomaAcimaDe60() {
		double soma = 0.0;
		for (double pontuacao : pontos) {
			if (pontuacao > 60.0) {
				soma += pontuacao;
			}
		}
		return soma;
	}

	public double calcularMediaFinal() {

		if (pontos.isEmpty()) {
			return 0.0;
		}

		double media = calcularSomaAcimaDe60();
		int countSoma = 0;

		for (double pontuacao : pontos) {
			if (pontuacao > 60) {
				countSoma++;
			}
		}

		double mediaFinal = 0.0;
		if (media == 0) {
			return 0.0;
		} else {

			mediaFinal = media / countSoma;
			if (mediaFinal > 70.0) {
				return mediaFinal += 10.0;
			} else {
				return mediaFinal;
			}
		}
	}

	public String verificarSituacao() {
		double mediaFinal = calcularMediaFinal();
		return (mediaFinal > 60.0) ? "Aprovado" : "Reprovado";
	}

}
