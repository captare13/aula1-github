package course;

import java.util.Scanner;

public class ExercicioFor3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de alunos: ");
		int n = sc.nextInt();
		double x = 0;
		double y = 0;
		double z = 0;
		double media = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite as notas: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			media = ((x * 2)+(y * 3)+(z * 5)) / 10;
			System.out.printf("Média= %.1f%n", media);
		}
		sc.close();
	}
}
