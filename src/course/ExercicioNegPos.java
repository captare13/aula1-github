package course;

import java.util.Scanner;

public class ExercicioNegPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();
		if (num<0) {
			System.out.println("N�mero Negativo");
		}
		else {
			System.out.println("N�mero n�o negativo");
			}
		sc.close();
		
	}

}
