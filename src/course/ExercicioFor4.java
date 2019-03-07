package course;

import java.util.Scanner;

public class ExercicioFor4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de pares: ");
		int n = sc.nextInt();
		double x = 0;
		double y = 0;
		double div = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os números: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				div = x / y;
				System.out.printf("Divisão= %.1f%n", div);
			}
		}
		sc.close();
	}

}
