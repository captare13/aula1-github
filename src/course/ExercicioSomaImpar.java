package course;

import java.util.Scanner;

public class ExercicioSomaImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int inicio = n1, fim = n2;

		if (n2 < n1) {
			inicio = n2;
			fim = n1;
		}
		int soma = 0;
		for (int i = inicio; i <= fim; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.println("Soma dos ímpares = " + soma);
		sc.close();
	}

}
