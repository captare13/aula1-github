package course;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Digite um n�mero: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Raiz Quadrada = %.3f%n", sq);
			System.out.print("Repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
	}
}