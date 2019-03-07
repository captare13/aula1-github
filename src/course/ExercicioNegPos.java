package course;

import java.util.Scanner;

public class ExercicioNegPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		if (num<0) {
			System.out.println("Número Negativo");
		}
		else {
			System.out.println("Número não negativo");
			}
		sc.close();
		
	}

}
