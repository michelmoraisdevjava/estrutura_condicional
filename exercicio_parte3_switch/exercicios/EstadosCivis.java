package exercicios;

import java.util.Scanner;

public class EstadosCivis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		enum Estados {
			SOLTEIRO, CASADO, DIVORCIADO, VIUVO
		}

		Estados estadoCivil = null;

		while (estadoCivil == null) {
			System.out.print("Informe o estado civil: ");
			String estado = sc.nextLine().toUpperCase();
			
			try {
				estadoCivil = Estados.valueOf(estado);
			} catch (IllegalArgumentException e) {
				System.out.println("Estado Civil Inexistente!");
			}
		}

		switch (estadoCivil) {
		case SOLTEIRO -> System.out.println("Estado Civil: Solteiro");
		case CASADO -> System.out.println("Estado Civil: Casado");
		case DIVORCIADO -> System.out.println("Estado Civil: Divorciado");
		case VIUVO -> System.out.println("Estado Civil: Viúvo");
		}

		sc.close();

	}

}
