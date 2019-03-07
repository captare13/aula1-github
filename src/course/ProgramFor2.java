package course;

import java.util.Scanner;

/* verificar qual o maior valor*/

public class ProgramFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.println("N deve ser positivo! tente novamente: ");
			n = sc.nextInt();
		}

		int higher = Integer.MIN_VALUE;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Valor #" + i + ": ");
			int x = sc.nextInt();
			if (x > higher) {
				higher = x;
			}
		}
		System.out.println("Higher = " + higher);
		sc.close();
	}
}
