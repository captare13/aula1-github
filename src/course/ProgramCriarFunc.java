package course;

import java.util.Scanner;

public class ProgramCriarFunc {
	/* criar fun��o */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite tr�s n�meros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux; // retornar esse valor
	}

	public static void showResult(int value) {
		;
		System.out.println("Higher = " + value);

	}
}
