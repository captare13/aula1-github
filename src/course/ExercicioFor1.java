package course;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor de 1 ate 1000: ");
		int n = sc.nextInt();
		System.out.println("Números ímpares: ");
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
