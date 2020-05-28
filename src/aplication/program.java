package aplication;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char again, sexo;
		String nome;
		double altura, peso;

		System.out.print("Nome: ");
		nome = sc.nextLine();

		System.out.print("Sexo(M/F): ");
		sexo = sc.next().charAt(0);
		while (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
			System.out.println("Insira uma letra válida para sexo(M/F): ");
			sexo = sc.next().charAt(0);
		}

		System.out.print("Altura: ");
		altura = sc.nextDouble();

		while (altura <= 0) {
			System.out.println("Insira um valor positivo para a altura: ");
			altura = sc.nextDouble();
		}

		System.out.print("Peso:");
		peso = sc.nextDouble();
		while (peso <= 0) {
			System.out.println("Insira um valor positivo para o peso: ");
			peso = sc.nextDouble();
		}

		System.out.print("Digitar outro atleta (S/N)? ");
		again = sc.next().charAt(0);

		while (again == 'S' || again == 's') {
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Sexo(M/F): ");
			sexo = sc.next().charAt(0);
			while (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
				System.out.println("Insira uma letra válida para sexo(M/F): ");
				sexo = sc.next().charAt(0);
			}

			System.out.print("Altura: ");
			altura = sc.nextDouble();

			while (altura <= 0) {
				System.out.println("Insira um valor positivo para a altura: ");
				altura = sc.nextDouble();
			}

			System.out.print("Peso:");
			peso = sc.nextDouble();
			while (peso <= 0) {
				System.out.println("Insira um valor positivo para o peso: ");
				peso = sc.nextDouble();
			}

			System.out.print("Digitar outro atleta (S/N)? ");
			again = sc.next().charAt(0);
		}

		sc.close();
	}

}
