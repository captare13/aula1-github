package course;

import java.util.Locale;
import java.util.Scanner;

/* estrutura repetitiva WHILE*/

public class ProgramWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double n = sc.nextDouble();

		while (n >= 0.0) {
			double sr = Math.sqrt(n); //calcula raiz quadrada
			System.out.printf("%.3f%n", sr);
			System.out.print("Digite outro número: ");
			n = sc.nextDouble();
		}
		System.out.println("Negative number");
		sc.close();
	}
}
