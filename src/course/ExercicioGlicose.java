package course;

import java.util.Scanner;

public class ExercicioGlicose {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Entre com a medição da glicose:");
			int x = sc.nextInt();
			if (x > 140) {
				System.out.println("Diabetes");
			} else if (x <= 100) {
				System.out.println("Normal");
			} else {
				System.out.println("Alto");
			}
			System.out.println("Nova verificação(s/n):");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
	}
}
