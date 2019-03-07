package course;

import java.util.Scanner;

public class ExercicioFor7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		int calc = 0;

		for (int i = 1; i <= n; i++) {
			calc = i;
			System.out.printf("%d ", calc);
			calc = calc * i;
			System.out.printf("%d ", calc);
			calc = calc * i;
			System.out.printf("%d%n", calc);
		}
		sc.close();
	}

}
/*for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			*/
