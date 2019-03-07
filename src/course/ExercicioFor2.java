package course;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos numeros serão lidos: ");
		int n = sc.nextInt();
		int x = 0;
		int in = 0;
		int out = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite um número: ");
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in.");
		System.out.println(out + " out.");

		sc.close();
	}

}
