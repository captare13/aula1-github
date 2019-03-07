package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhileII {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite as coordenadas x e y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
			}
			System.out.print("Digite novamente as coordenadas x e y: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}

}
