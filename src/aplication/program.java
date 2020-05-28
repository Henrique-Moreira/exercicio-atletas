package aplication;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char again, sexo;
		String nome, atletaMaisAlto;
		double altura, peso, pesos = 0, alturaMulheres = 0, alturaInicial = 0, atletas, men = 0, medHomens;
		int woman = 0;
		atletaMaisAlto = "Nenhum";

		System.out.print("Nome: ");
		nome = sc.nextLine();

		System.out.print("Sexo(M/F): ");
		sexo = sc.next().charAt(0);
		while (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
			System.out.println("Insira uma letra válida para sexo(M/F): ");
			sexo = sc.next().charAt(0);
		}
		if (sexo == 'm' || sexo == 'M') {
			men = men + 1;
		} else {
			woman = woman + 1;
		}

		System.out.print("Altura: ");
		altura = sc.nextDouble();
		if (sexo == 'f' || sexo == 'F') {
			alturaMulheres = alturaMulheres + altura;
		}
		while (altura <= 0) {
			System.out.println("Insira um valor positivo para a altura: ");
			altura = sc.nextDouble();
			if (sexo == 'f' || sexo == 'F') {
				alturaMulheres = alturaMulheres + altura;
			}
		}
		if (alturaInicial < altura) {
			atletaMaisAlto = nome;
			alturaInicial = altura;
		}
		System.out.print("Peso:");
		peso = sc.nextDouble();
		if (peso > 0) {
			pesos = pesos + peso;
		}
		while (peso <= 0) {
			System.out.println("Insira um valor positivo para o peso: ");
			peso = sc.nextDouble();
			if (peso > 0) {
				pesos = pesos + peso;
			}
		}
		atletas = 1;
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
			if (sexo == 'm' || sexo == 'M') {
				men = men + 1;
			} else {
				woman = woman + 1;
			}

			System.out.print("Altura: ");
			altura = sc.nextDouble();
			if (sexo == 'f' || sexo == 'F') {
				alturaMulheres = alturaMulheres + altura;
			}
			while (altura <= 0) {
				System.out.println("Insira um valor positivo para a altura: ");
				altura = sc.nextDouble();
				if (sexo == 'f' || sexo == 'F') {
					alturaMulheres = alturaMulheres + altura;
				}
			}
			if (alturaInicial < altura) {
				atletaMaisAlto = nome;
				alturaInicial = altura;
			}
			System.out.print("Peso:");
			peso = sc.nextDouble();
			if (peso > 0) {
				pesos = pesos + peso;
			}
			while (peso <= 0) {
				System.out.println("Insira um valor positivo para o peso: ");
				peso = sc.nextDouble();
				if (peso > 0) {
					pesos = pesos + peso;
				}
			}
			atletas = atletas + 1;
			System.out.print("Digitar outro atleta (S/N)? ");
			again = sc.next().charAt(0);
		}
		medHomens = men / atletas * 100;

		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", (pesos / atletas));
		System.out.println("Atleta mais alto: " + atletaMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f %% %n", medHomens);
		System.out.println("Altura média das mulheres: " + (alturaMulheres / woman));
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		sc.close();
	}

}
