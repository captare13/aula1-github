package course;

import java.util.Scanner;

public class ExercicioIfParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		if (num % 2 == 0 || num == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
			}
		sc.close();
		
	}	

}
