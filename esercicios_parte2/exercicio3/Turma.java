package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private List<Double> notas;

	public Turma() {
		this.notas = new ArrayList<Double>();
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	// Método para obter as notas
	public void adicionarNota(double nota) {
		notas.add(nota);
	}

	// Método para calcular a média da turma
	public double mediaDaTurma() {
		double soma = 0.0;
		for (double nota : notas) {
			soma += nota;
		}

		return soma / notas.size();
	}

	public double somarNotasAcimaDaMedia() {
		double somarNotas = 0.0;

		for (double nota : notas) {
			if (nota > mediaDaTurma()) {
				somarNotas += nota;
			}
		}

		return somarNotas;
	}

}
