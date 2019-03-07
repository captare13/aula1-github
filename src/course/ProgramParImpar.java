package course;

import java.util.Scanner;

public class ProgramParImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um numero inteiro: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Even!");
		}
		else {
			System.out.println("Odd!");
		}
		sc.close();
	}
}
