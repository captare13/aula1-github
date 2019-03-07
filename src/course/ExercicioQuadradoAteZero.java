package course;

import java.util.Scanner;

public class ExercicioQuadradoAteZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int calc;
		int n1;
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		while (n1 != 0){
			calc = n1 * n1;
			System.out.println(calc);
			System.out.println("Digite um número: ");
			n1 = sc.nextInt();
			}
		sc.close();
	}

}
